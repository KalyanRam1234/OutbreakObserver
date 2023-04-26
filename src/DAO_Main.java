import Student.*;
import UseCases.UseCase1.*;
import UseCases.useCase2.useCase2;
import UseCases.useCase2.useCase2_DAO;
import UseCases.useCase3.useCase3;
import UseCases.useCase3.useCase3_DAO;
import UseCases.useCase4.useCase4;
import UseCases.useCase4.useCase4_DAO;
import UseCases.useCase4.useCase4b;
import UseCases.useCase5.useCase5;
import UseCases.useCase5.useCase5_DAO;
import UseCases.useCase6.useCase6_DAO;
import UseCases.useCase7.useCase7_DAO;
import UseCases.useCase7.useCase7a;
import UseCases.useCase7.useCase7b;
import UIUX.AdminUI;
import java.util.ArrayList;
import java.util.Scanner;

import RTPCR.RTPCR;
public class DAO_Main {
    public static DAO_Factory daoFactory;
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        useCase1 s1;
        useCase2 s2;

        ArrayList<useCase2> s2list;
        try{
            daoFactory = new DAO_Factory();
            daoFactory.activateConnection();
            StudentDAO dao=daoFactory.getStudentDAO();
            System.out.println(dao.getStudentCount());
            
            // If Admin accesses the system. Then the following control should be executed:
            AdminUI UI = new AdminUI();
            String s="";
            boolean flag = false;

            while(!s.equals("quit"))
            {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                int i = UI.displayIntialPrompt();
                
                switch(i)
                {
                    case 1:{
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        ArrayList<String> list = UI.displayRTPCRPrompt1();
                        useCase1_DAO sdao = daoFactory.getuseCase1DAO();
                        sdao.enterIntoRTPCRTable(list.get(1), list.get(0), list.get(2), list.get(3));
                        break;
                    }

                    case 2:{
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        int c = UI.displayRTPCRPrompt2();
                        
                        useCase1_DAO sdao = daoFactory.getuseCase1DAO();
                        switch(c)
                        {
                            case 1:{
                                
                                String s1a = UI.displayRTPCRPrompt2a();
                                ArrayList<useCase1> list = sdao.getStudentRTPCR_Status(s1a);
                                UI.displayRTPCRDetailsOfStudent(list);
                                break;
                            }
                            
                            case 2:{
                                ArrayList<String> list = UI.displayRTPCRPrompt2b();
                                useCase1 uc1 = sdao.getStudentRTPCR_Status(list.get(0), list.get(1));
                                UI.displayRTPCRdetails(uc1);
                                break;
                            }

                            case 3:{
                                String date = UI.displayRTPCRPrompt2c();
                                ArrayList<useCase1> list = sdao.getCollegeRTPCR_Status(date);
                                UI.displayRTPCRDetailsOnDate(list);
                                break;
                            }

                            case 4:{
                                String batch = UI.displayRTPCRPrompt2d();
                                ArrayList<useCase1> list = sdao.getBatchRTPCR_Status(batch);
                                UI.displayRTPCRdetails(list);
                                break;
                            }
                        }
                        
                        break;
                    }

                    case 3:{
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        useCase3_DAO sdao = daoFactory.getuseCase3DAO();
                        String id = UI.displayVaccinationPrompt3a();
                        int i3 = sdao.getCurrentDoseNo(id);
                        ArrayList<String> list = UI.displayVaccinationPrompt3b(i3);
                        
                        useCase3 uc3 = new useCase3(id, i3, list.get(0), list.get(1), list.get(2));
                        sdao.enterIntoDosesTable(uc3);

                        if(!uc3.getvStatus().equals("null"))
                        {
                            sdao.updateVaccinationStatus(uc3);
                        }
                        break;
                    }

                    case 4:{
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();

                        useCase4_DAO sdao = daoFactory.getuseCase4DAO();
                        int c4 = UI.displayVaccinationPrompt4();

                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        switch(c4)
                        {
                            case 1:{
                                
                                String s1a = UI.displayVaccinationPrompt4a();
                                ArrayList<useCase4> list = sdao.getStudentDoses(s1a);
                                UI.displayVaccinationDetailsOfStudent(list);
                                break;
                            }
                            
                            case 2:{
                                ArrayList<useCase4> list = sdao.getAllStudentDoses();
                                UI.displayVaccinationDetailsOfStudent(list);
                                break;
                            }

                            case 3:{
                                ArrayList<useCase4b> list = sdao.getVaccinationDetails();
                                UI.displayVaccinationDetails(list);
                                break;
                            }

                            case 4:{
                                String batch = UI.displayRTPCRPrompt2d();
                                ArrayList<useCase4b> list = sdao.getVaccinationDetailsBatch(batch);
                                UI.displayVaccinationDetailsOfBatch(list, batch);
                                break;
                            }
                        }
                        break;
                    }

                    case 5:{
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        useCase5_DAO sdao = daoFactory.getuseCase5DAO();
                        int i5 = UI.displayInfectedPrompt5();
                       
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();

                        switch(i5)
                        {
                            case 1:{
                                ArrayList<useCase5> list = sdao.getInfectedList();
                                UI.displayInfectedDetailsList(list);
                                break;
                            }

                            case 2:{
                                String batch = UI.displayInfectedPrompt5b();
                                ArrayList<useCase5> list = sdao.getInfectedListByBatch(batch);
                                UI.displayInfectedDetailsListByBatch(list,batch);
                                break;
                            }
                        }
                        break;
                    }

                    case 6:{
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();

                        useCase6_DAO sdao = daoFactory.getuseCase6DAO();
                        
                        int i5 = UI.displayInfectedPrompt6();
                       
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        
                        switch(i5)
                        {
                            case 1:{
                                ArrayList<String> list = UI.displayUpdateInfected_Prompt1();
                                sdao.enterInfectedDetails(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8));
                                break;
                            }

                            case 2:{
                                ArrayList<String> list = UI.displayUpdateInfected_Prompt2();
                                sdao.updateInfectedDetails(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8));
                                
                                break;
                            }

                            case 3:{
                                ArrayList<String> list = UI.displayUpdateInfected_Prompt3();
                                sdao.removeInfectedDetails(list.get(0));
                                break;
                            }
                        }
                        break;
                    }

                    case 7:{
                
                        break;
                    }

                    case -1:{
                        flag=true;
                        break;
                    }
                }
                if(flag) break;
                s = sc.next();
            }
            //useCase1_DAO sdao = daoFactory.getuseCase1DAO();
            //s1=sdao.getCollegeRTPCR_Status("2023-04-12" );

            //System.out.println(s1.size());

            /* Testing useCase 2. */
            // useCase2_DAO sdao2 = daoFactory.getuseCase2DAO();
            // s2=sdao2.getMyRTPCR_Status("IMT2021001", "2023-04-12");

            // System.out.println(s2.getstudentId() + " " + s2.getName() + " " + s2.getTestId() + " " + s2.getTestDate() + " " + s2.getTestResult() + " " + s2.getEmailId());

            // s2list=sdao2.getAllMyRTPCR_Status("IMT2021001");

            // for(int i=0; i<s2list.size(); i++)
            // System.out.println(s2list.get(i).getstudentId() + " " + s2list.get(i).getName() + " " + s2list.get(i).getTestId() + " " + s2list.get(i).getTestDate() + " " + s2list.get(i).getTestResult() + " " + s2list.get(i).getEmailId());

            // RTPCR rtpcr = new RTPCR("RT061", "IMT2021001", "2023-04-12", "Positive", null);
            // sdao2.addMyRTPCR_Status(rtpcr);

            //AdminUI UI = new AdminUI();
            //useCase6_DAO sdao = daoFactory.getuseCase6DAO();
            // UI.displayInfectedPrompt6();
            // Scanner sc = new Scanner(System.in);
            // int ig = sc.nextInt();
            // switch(ig)
            // {
            //     case 1:{
            //         ArrayList<String> list = UI.displayUpdateInfected_Prompt1();
            //         list.
            //     }

            //     case 2:{

            //     }

            //     case 3:{

            //     }
            // }
            // useCase7_DAO sdao = daoFactory.getuseCase7DAO();
            // ArrayList<useCase7a> uc7a = sdao.getInfectedStudentsList();
            // ArrayList<ArrayList<useCase7b>> uc7b = sdao.getRooomatesOfInfectedStudents(uc7a);
            // UI.displayRoomatesOfInfectedStudents(uc7b, uc7a);
            // useCase1_DAO sdao = daoFactory.getuseCase1DAO();
            // ArrayList<useCase1> sList=sdao.getCollegeRTPCR_Status("2023-04-12" );

            // UI.displayRTPCRdetails(sList);
            // int i=0;
            // //while(i<5) {
            //     Scanner sc = new Scanner(System.in);
            //     sc.nextInt();
            //     UI.displayRTPCRdetails(s1);
            //     System.out.print("\033[H\033[2J");  
            //     System.out.flush();
            //     i++;
            // //}

            daoFactory.deactivateConnection(DAO_Factory.TXN_STATUS.COMMIT);

        }catch(Exception e){
                //Handle errors for Class.forName
                daoFactory.deactivateConnection( DAO_Factory.TXN_STATUS.ROLLBACK );
                e.printStackTrace();
        }
    } 
    
}
