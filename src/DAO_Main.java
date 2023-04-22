import Student.*;
import UseCases.UseCase1.*;
import java.util.ArrayList;
public class DAO_Main {
    public static DAO_Factory daoFactory;
    public static void main(String[] args){
        ArrayList<useCase1> s1;
        try{
            daoFactory = new DAO_Factory();
            daoFactory.activateConnection();
            StudentDAO dao=daoFactory.getStudentDAO();
            System.out.println(dao.getStudentCount());
            useCase1_DAO sdao = daoFactory.getuseCase1DAO();
            s1=sdao.getCollegeRTPCR_Status("2023-04-12" );

            System.out.println(s1.size());
            daoFactory.deactivateConnection(DAO_Factory.TXN_STATUS.COMMIT);

        }catch(Exception e){
                //Handle errors for Class.forName
                daoFactory.deactivateConnection( DAO_Factory.TXN_STATUS.ROLLBACK );
                e.printStackTrace();
        }
    } 
    
}
