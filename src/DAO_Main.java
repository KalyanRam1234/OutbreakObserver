import Student.*;
import UseCases.UseCase1.*;
import UseCases.useCase2.useCase2;
import UseCases.useCase2.useCase2_DAO;

import java.util.ArrayList;

import RTPCR.RTPCR;
public class DAO_Main {
    public static DAO_Factory daoFactory;
    public static void main(String[] args){
        ArrayList<useCase1> s1;
        useCase2 s2;
        ArrayList<useCase2> s2list;
        try{
            daoFactory = new DAO_Factory();
            daoFactory.activateConnection();
            StudentDAO dao=daoFactory.getStudentDAO();
            System.out.println(dao.getStudentCount());
            //useCase1_DAO sdao = daoFactory.getuseCase1DAO();
            //s1=sdao.getCollegeRTPCR_Status("2023-04-12" );

            //System.out.println(s1.size());

            /* Testing useCase 2. */
            useCase2_DAO sdao2 = daoFactory.getuseCase2DAO();
            s2=sdao2.getMyRTPCR_Status("IMT2021001", "2023-04-12");

            System.out.println(s2.getstudentId() + " " + s2.getName() + " " + s2.getTestId() + " " + s2.getTestDate() + " " + s2.getTestResult() + " " + s2.getEmailId());

            s2list=sdao2.getAllMyRTPCR_Status("IMT2021001");

            for(int i=0; i<s2list.size(); i++)
            System.out.println(s2list.get(i).getstudentId() + " " + s2list.get(i).getName() + " " + s2list.get(i).getTestId() + " " + s2list.get(i).getTestDate() + " " + s2list.get(i).getTestResult() + " " + s2list.get(i).getEmailId());

            RTPCR rtpcr = new RTPCR("RT061", "IMT2021001", "2023-04-12", "Positive", null);
            sdao2.addMyRTPCR_Status(rtpcr);

            daoFactory.deactivateConnection(DAO_Factory.TXN_STATUS.COMMIT);

        }catch(Exception e){
                //Handle errors for Class.forName
                daoFactory.deactivateConnection( DAO_Factory.TXN_STATUS.ROLLBACK );
                e.printStackTrace();
        }
    } 
    
}
