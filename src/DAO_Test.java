
import java.util.Scanner;

import Login.LoginDAO;

public class DAO_Test {
    public static DAO_Factory daoFactory;
    public static void main(String[] args){
        // useCase1 s1;
        // useCase2 s2;
        // ArrayList<useCase2> s2list;
        // try{
        //     daoFactory = new DAO_Factory();
        //     daoFactory.activateConnection();
        //     StudentDAO dao=daoFactory.getStudentDAO();
        //     System.out.println(dao.getStudentCount());
        //     useCase1_DAO sdao = daoFactory.getuseCase1DAO();
        //     s1=sdao.getStudentRTPCR_Status("IMT2021010", "2023-04-12" );

        //     System.out.println(s1.getName()==null);

        //     /* Testing useCase 2. */
        //     useCase2_DAO sdao2 = daoFactory.getuseCase2DAO();
        //     s2=sdao2.getMyRTPCR_Status("IMT2021001", "2023-04-12");

        //     System.out.println(s2.getstudentId() + " " + s2.getName() + " " + s2.getTestId() + " " + s2.getTestDate() + " " + s2.getTestResult() + " " + s2.getEmailId());

        //     s2list=sdao2.getAllMyRTPCR_Status("IMT2021001");

        //     for(int i=0; i<s2list.size(); i++)
        //     System.out.println(s2list.get(i).getstudentId() + " " + s2list.get(i).getName() + " " + s2list.get(i).getTestId() + " " + s2list.get(i).getTestDate() + " " + s2list.get(i).getTestResult() + " " + s2list.get(i).getEmailId());

        //     RTPCR rtpcr = new RTPCR("RT061", "IMT2021001", "2023-04-12", "Positive", null);
        //     sdao2.addMyRTPCR_Status(rtpcr);

        //     daoFactory.deactivateConnection(DAO_Factory.TXN_STATUS.COMMIT);

        // }catch(Exception e){
        //         //Handle errors for Class.forName
        //         daoFactory.deactivateConnection( DAO_Factory.TXN_STATUS.ROLLBACK );
        //         e.printStackTrace();
        // }

        try{
            daoFactory = new DAO_Factory();

            daoFactory.activateConnection();

            LoginDAO dao=daoFactory.getLoginDAO();

            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.print("1)Login\n2)Register\n3)Exit\nEnter a choice: ");
                int choice=sc.nextInt();
                if(choice==1){
                    System.out.println("Login");
                    System.out.print("Enter username: ");
                    String username=sc.next();
                    System.out.print("Enter password: ");
                    String password=sc.next();
                    int p=dao.Login(username, password);
                    if(p==0){
                        System.out.println("Login Successful");
                        break;
                    }
                    else if(p==1){
                        System.out.println("Incorrect Password, please try again");
                    }
                    else if(p==2){
                        System.out.println("Username doesn't exist, Please register");
                        
                    }
                }
                else if(choice==2){
                    System.out.println("Register");
                    System.out.print("Enter username: ");
                    String username=sc.next();
                    System.out.print("Enter password: ");
                    String password=sc.next();
                    int p=dao.Register(username, password);

                    if(p==0){
                        System.out.println("Registration Successful");
                        break;
                    }
                    else System.out.println("Registration failed, please try again");
                }
                else if(choice==3) System.exit(0);
            }
            sc.close();
            daoFactory.deactivateConnection( DAO_Factory.TXN_STATUS.COMMIT );
        }
        catch(Exception e){
            daoFactory.deactivateConnection( DAO_Factory.TXN_STATUS.ROLLBACK );
            e.printStackTrace();
        }
    } 
    
}
