package UIUX;

import java.util.ArrayList;
import java.util.Scanner;

import UseCases.UseCase1.useCase1;
import UseCases.useCase4.useCase4;
import UseCases.useCase4.useCase4b;
import UseCases.useCase5.useCase5;
import UseCases.useCase7.useCase7a;
import UseCases.useCase7.useCase7b;

public class AdminUI
{
    public int displayIntialPrompt()
    {

        //while(true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n What action would you like to take:\n");
        System.out.println("\t 1) Enter RTPCR details of a student.");
        System.out.println("\t 2) Get RTPCR details of students.");
        System.out.println("\t 3) Update Vaccination details of a student.");
        System.out.println("\t 4) Get Vaccination details of students.");
        System.out.println("\t 5) Get list of infected students and details.");
        System.out.println("\t 6) Update infected students data.");
        System.out.println("\t 7) Get list of students who are roommates of Infected students.");
        System.out.println("\t 8) Get Data about hostel & qurantine facilities.");
        System.out.println("\t 9) Get Analytics of infections, vaccinations, and RTPCR testing.");

        int i;
        while(true)
        {
            String s = sc.next();
            if(s.equals("quit")) s="-1";

            if(s.equals("-1") || s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") ) 
            {
                i = Integer.parseInt(s); 
                return i;
            }
        }
        //System.out.print("\033[H\033[2J");  
        //System.out.flush();
        //}          
    }

    public ArrayList<String> displayRTPCRPrompt1()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Enter the RTPCR details (keep in mind that the RTPCR testId must be unique, sid must exist) :\n\n");
        System.out.println("testId: ");
        list.add( sc.nextLine() );
        System.out.println("studentId: ");
        list.add( sc.nextLine() );  
        System.out.println("testDate: ");
        list.add( sc.nextLine() );
        System.out.println("test_result: ");
        list.add( sc.nextLine() );
        
        return list;
    }

    public int displayRTPCRPrompt2()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner sc = new Scanner(System.in);

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Chose an option to fetch RTPCR details in the way you want:\n");
        System.out.println("\t 1) Get details of all the RTPCRs of a student, by Id.");
        System.out.println("\t 2) Get RTPCR details of a student, by Id, on a given Date.");
        System.out.println("\t 3) Get RTPCR details of all students in institute on a given Date.");
        System.out.println("\t 4) Get RTPCR details of all students of a batch.");
        
        int i = sc.nextInt();
        return i;
    }

    public String displayRTPCRPrompt2a()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome. Enter the details: \n\n");
    
        System.out.println("Enter studentId: ");
        s = sc.nextLine();
        
        return s;
    }

    public ArrayList<String> displayRTPCRPrompt2b()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome. Enter the details:\n\n");
    
        System.out.println("Enter studentId: ");
        list.add(sc.nextLine());
        
        System.out.println("Enter date Taken: ");
        list.add(sc.nextLine());
        return list;
    }

    public String displayRTPCRPrompt2c()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome. Enter the details:\n\n");
        
        System.out.println("Enter date Taken: ");
        s = sc.nextLine();

        return s;
    }

    public String displayRTPCRPrompt2d()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome. Enter the details:\n\n");
    
        System.out.println("Enter batch (IMTXXXX/MTXXXX): ");
        s=sc.nextLine();
        return s;
    }

    public void displayRTPCRdetails(useCase1 uc1)
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Here are the RTPCR test details of student " + uc1.getstudentId() + ", conducted on Date: "+ uc1.getDate() +"\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("| Student Id\t| Student Name\t\t\t| Test Id\t| Test Date\t| Test Result\t| Hostel Room |");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("| %s\t| %-25s\t| %-10s\t| %-10s\t| %-10s\t| %-11s |", uc1.getstudentId(),uc1.getName(),uc1.getTestId(),uc1.getDate(),uc1.getTestResult(),uc1.getRoomNo()));
        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

    public void displayRTPCRdetails(ArrayList<useCase1> ucList)
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        ArrayList<Integer> rlist = new ArrayList<Integer>();
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n\n Here are the RTPCR test details of all students of batch 2021:\n\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("| Student Id\t| Student Name\t\t\t| Test Id\t| Test Date\t| Test Result\t| Hostel Room |");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        
        int pos_count=0; int tr=0;
        
        try{
            for(int i=0; i<ucList.size(); i++)
            {
                System.out.println(String.format("| %s\t| %-25s\t| %-10s\t| %-10s\t| %-10s\t| %-11s |", ucList.get(i).getstudentId(),ucList.get(i).getName(),ucList.get(i).getTestId(),ucList.get(i).getDate(),ucList.get(i).getTestResult(),ucList.get(i).getRoomNo()));
                System.out.println("---------------------------------------------------------------------------------------------------------------");
                if(ucList.get(i).getTestResult().equals("Positive")) {pos_count++; rlist.add(i);}
                tr++;
            }
        } catch(IndexOutOfBoundsException e){
            System.out.println("There is no data for that date. Please check the date you entered.\n");
        }
            System.out.println("\n\n*************************************************************************************************************************");
            System.out.println("|Total number of rows printed: \t\t\t\t\t\t|" + String.format("%5d",tr) + "\t\t\t\t\t\t|");
            System.out.println("\n|Total number of postive results: \t\t\t\t\t|" + String.format("%5d",pos_count) + "\t\t\t\t\t\t|");
        
        // int c=0; 
        // while(c<rlist.size()){
    
        //     if(c==0)System.out.print("\n|List of rows that have positive in Test result column: \t\t| [ ");
        //     else    System.out.print("\n                                                        \t\t|   ");

        //     int i=0;
        //     for(i=0; i<rlist.size() && i<13; i++)
        //     {    
        //         System.out.print(rlist.get(i) + ", ");
        //         c++;
        //     }
        //     if(c==rlist.size()){
        //         System.out.print(" ]");
        //         //System.out.println(String.format("%30s","|"));
        //         System.out.print("\t|\n");
        //     }
        //     else{ 
        //         System.out.print("  ");
        //         //System.out.println(String.format("%20s","|"));
        //         String s= "";
        //         for(int j=0; j<(i/4+1); j++)
        //             s+="\t";
        //         System.out.print(s+"|\n");
        //     }
        // }
        
        System.out.println("*************************************************************************************************************************\n\n");
    }


    public void displayRTPCRDetailsOnDate(ArrayList<useCase1> ucList)
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        ArrayList<Integer> rlist = new ArrayList<Integer>();
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
        
        int pos_count=0; int tr=0;

        try{
            System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n\n Here are the RTPCR test details of all students, conducted on date: "+ucList.get(0).getDate()+":\n\n");
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("| Student Id\t| Student Name\t\t\t| Test Id\t| Test Date\t| Test Result\t| Hostel Room |");
            System.out.println("---------------------------------------------------------------------------------------------------------------");

            for(int i=0; i<ucList.size(); i++)
            {
                System.out.println(String.format("| %s\t| %-25s\t| %-10s\t| %-10s\t| %-10s\t| %-11s |", ucList.get(i).getstudentId(),ucList.get(i).getName(),ucList.get(i).getTestId(),ucList.get(i).getDate(),ucList.get(i).getTestResult(),ucList.get(i).getRoomNo()));
                System.out.println("---------------------------------------------------------------------------------------------------------------");
                if(ucList.get(i).getTestResult().equals("Positive")) pos_count++;
                tr++;
                rlist.add(i);
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("There is no data for that date. Please check the date you entered.\n");
        }
        System.out.println("\n\n*************************************************************************************************************************");
        System.out.println("|Total number of rows printed: \t\t\t\t\t\t|" + String.format("%5d",tr) + "\t\t\t\t\t\t|");
        System.out.println("\n|Total number of postive results: \t\t\t\t\t|" + String.format("%5d",pos_count) + "\t\t\t\t\t\t|");
        
        // int c=0;
        // while(c<rlist.size()){
    
        //     if(c==0)System.out.print("\n|List of rows that have positive in Test result column: \t\t| [ ");
        //     else    System.out.print("\n                                                        \t\t|   ");
            
        //     int i=0;
        //     for(i=0; i<rlist.size() && i<13; i++)
        //     {    
        //         System.out.print(rlist.get(i) + ", ");
        //         c++;
        //     }
        //     if(c==rlist.size()){
        //         System.out.print(" ]");
        //         //System.out.println(String.format("%30s","|"));
        //         System.out.print("\t|\n");
        //     }
        //     else{ 
        //         System.out.print("  ");
        //         //System.out.println(String.format("%20s","|"));
        //         String s= "";
        //         for(int j=0; j<(i/4+1); j++)
        //             s+="\t";
        //         System.out.print(s+"|\n");
        //     }
        // }
        
        System.out.println("*************************************************************************************************************************\n\n");
    }

    public void displayRTPCRDetailsOfStudent(ArrayList<useCase1> ucList)
    {
        ArrayList<Integer> rlist = new ArrayList<Integer>();
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
        
        int pos_count=0; int tr=0;
        try{
            System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n\n Here are the RTPCR test details of student "+ucList.get(0).getstudentId()+ ":\n\n");
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("| Student Id\t| Student Name\t\t\t| Test Id\t| Test Date\t| Test Result\t| Hostel Room |");
            System.out.println("---------------------------------------------------------------------------------------------------------------");
        
            for(int i=0; i<ucList.size(); i++)
            {
                System.out.println(String.format("| %s\t| %-25s\t| %-10s\t| %-10s\t| %-10s\t| %-11s |", ucList.get(i).getstudentId(),ucList.get(i).getName(),ucList.get(i).getTestId(),ucList.get(i).getDate(),ucList.get(i).getTestResult(),ucList.get(i).getRoomNo()));
                System.out.println("---------------------------------------------------------------------------------------------------------------");
                if(ucList.get(i).getTestResult().equals("Positive")) pos_count++;
                tr++;
                rlist.add(i);
            }

            System.out.println("\n\n*************************************************************************************************************************");
            System.out.println("|Total number of rows printed: \t\t\t\t\t\t|" + String.format("%5d",tr) + "\t\t\t\t\t\t|");
            System.out.println("\n|Total number of postive results: \t\t\t\t\t|" + String.format("%5d",pos_count) + "\t\t\t\t\t\t|");
        } catch(IndexOutOfBoundsException e){
            System.out.println("There is no data for that date. Please check the date you entered.\n");
        }
        // int c=0; 
        // while(c<rlist.size()){
    
        //     if(c==0)System.out.print("\n|List of rows that have positive in Test result column: \t\t| [ ");
        //     else    System.out.print("\n                                                        \t\t|   ");
            
        //     int i=0;
        //     for(i=0; i<rlist.size() && i<13; i++)
        //     {    
        //         System.out.print(rlist.get(i) + ", ");
        //         c++;
        //     }
        //     if(c==rlist.size()){
        //         System.out.print(" ]");
        //         //System.out.println(String.format("%30s","|"));
        //         System.out.print("\t|\n");
        //     }
        //     else{ 
        //         System.out.print("  ");
        //         //System.out.println(String.format("%20s","|"));
        //         String s= "";
        //         for(int j=0; j<(i/4+1); j++)
        //             s+="\t";
        //         System.out.print(s+"|\n");
        //     }
        // }
        
        System.out.println("*************************************************************************************************************************\n\n");
    }

    public String displayVaccinationPrompt3a()
    {
        Scanner sc = new Scanner(System.in);
        String sId;

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Update the Vaccination details (enter \"null\" if vaccination status need not be updated):\n\n");
    
        System.out.println("studentId: ");
        sId = sc.nextLine();
        return sId;
    }

    public ArrayList<String> displayVaccinationPrompt3b(int doseNo)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("current Dose number is: "+doseNo+"\n\n Enter details:\n");
        System.out.println("dateTaken (yyyy-mm-dd): ");
        list.add( sc.nextLine());  
        System.out.println("vaccineName: ");
        list.add( sc.nextLine());
        System.out.println("want to update vaccination status? ");
        list.add( sc.nextLine() );

        return list;
    }

    public int displayVaccinationPrompt4()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Chose an option to fetch the RTPCR details the way you want: \n");  
        System.out.println("\t 1) Get details of all the doses of a student, by Id.");
        System.out.println("\t 2) Get dose details of all students.");
        System.out.println("\t 3) Get vaccination details of all students in institute.");
        System.out.println("\t 4) Get vaccination details of all students of a batch.");

        int i = sc.nextInt();
        return i;
    }

    public String displayVaccinationPrompt4a()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome.\n Enter student ID: \n");  
        String s = sc.next();
        return s;
    }

    public String displayVaccinationPrompt4d()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome.\n Enter batch No: \n");  
        String s = sc.next();
        return s;
    }

    public void displayVaccinationDetailsOfStudent(ArrayList<useCase4> ucList)
    {
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n\n Here are the dose test details of student" + ucList.get(0).getstudentId() +":\n\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("| Student Id\t| Student Name\t\t\t\t| doseNo\t| DateTaken\t\t| vaccineName\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        
        int dose_count=0;
        for(int i=0; i<ucList.size(); i++)
        {
            System.out.println(String.format("| %s\t| %-30s\t| %-10s\t| %-15s\t| %-10s\t|", ucList.get(i).getstudentId(),ucList.get(i).getName(),ucList.get(i).getdoseNo(),ucList.get(i).getDate(),ucList.get(i).getvaccineName()));
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            dose_count++;
        }

        System.out.println("\n\n*****************************************************************************************************************");
        System.out.println("|                                                                                                               |");
        System.out.println("|Total number of dosesTaken: \t\t\t\t\t|" + String.format("%5d",dose_count) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                               |");
        System.out.println("*****************************************************************************************************************");
    }

    public void displayVaccinationDetails(ArrayList<useCase4b> ucList)
    {
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n\n Here are the vaccination details of all the students :\n\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Student Id\t| Student Name\t\t\t\t| vaccination_status\t\t\t\t\t| DosesTaken\t|");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
        int vcount=0, ccount=0, nvcount=0;
        for(int i=0; i<ucList.size(); i++)
        {
            System.out.println(String.format("| %s\t| %-30s\t| %-50s\t| %-10s\t|", ucList.get(i).getstudentId(),ucList.get(i).getName(),ucList.get(i).getVaccinationStatus(),ucList.get(i).getDate()));
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            if(ucList.get(i).getVaccinationStatus()!=null && ucList.get(i).getVaccinationStatus().equals("completed")) vcount++; 
            if(ucList.get(i).getVaccinationStatus()!=null && ucList.get(i).getVaccinationStatus().equals("1st dose Taken")) nvcount++;
            if(ucList.get(i).getVaccinationStatus()!=null && ucList.get(i).getVaccinationStatus().equals("2nd dose Taken")) ccount++;
        }

        System.out.println("\n\n*************************************************************************************************************************");
        System.out.println("|                                                                                                                       |");
        System.out.println("|  Total number of vaccinated students: \t\t\t\t|" + String.format("%5d",vcount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("|  Total number of non-vaccinated students: \t\t\t\t|" + String.format("%5d",nvcount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("|  Total number of students Taken 2 or more doses: \t\t\t|" + String.format("%5d",ccount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("*************************************************************************************************************************");
    }

    public void displayVaccinationDetailsOfBatch(ArrayList<useCase4b> ucList, String batch)
    {
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n\n Here are the vaccination details of batch "+ batch + ":\n\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Student Id\t| Student Name\t\t\t\t\t| vaccination_status\t\t\t\t| DosesTaken\t|");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
        int vcount=0, ccount=0, nvcount=0;
        for(int i=0; i<ucList.size(); i++)
        {
            System.out.println(String.format("| %s\t| %-40s\t| %-40s\t| %-10s\t|", ucList.get(i).getstudentId(),ucList.get(i).getName(),ucList.get(i).getVaccinationStatus(),ucList.get(i).getDate()));
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            if(ucList.get(i).getVaccinationStatus()!=null && ucList.get(i).getVaccinationStatus().equals("completed")) vcount++; 
            if(ucList.get(i).getVaccinationStatus()!=null && ucList.get(i).getVaccinationStatus().equals("1st dose Taken")) nvcount++;
            if(ucList.get(i).getVaccinationStatus()!=null && ucList.get(i).getVaccinationStatus().equals("2nd dose Taken")) ccount++;
        }

        System.out.println("\n\n*************************************************************************************************************************");
        System.out.println("|                                                                                                                       |");
        System.out.println("|  Total number of vaccinated students: \t\t\t\t|" + String.format("%5d",vcount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("|  Total number of non-vaccinated students: \t\t\t\t|" + String.format("%5d",nvcount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("|  Total number of students Taken 2 or more doses: \t\t\t|" + String.format("%5d",ccount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("*************************************************************************************************************************");
    }

    public int displayInfectedPrompt5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Chose an option to fetch the RTPCR details the way you want: \n");  
        System.out.println("\t 1) Get all infected students details list.");
        System.out.println("\t 2) Get infected students details list batch-wise .");
        
        int i=-1;
        while(true){
            String s = sc.next();
            if(s.equals("quit")) s="-1";
            if(s.equals("-1") || s.equals("1") || s.equals("2") ) { i=Integer.parseInt(s); return i;} 
        }
    }

    public void displayInfectedDetailsList(ArrayList<useCase5> ucList)
    {
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n\n Here is the list of infected students:\n\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Student Id\t| Student Name\t\t\t| diagnosis_Date\t\t| testId\t| qroomNo\t| healthStatus\t|");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
        int icount=0;
        for(int i=0; i<ucList.size(); i++)
        {
            System.out.println(String.format("| %s\t| %-25s\t| %-25s\t| %-10s\t| %-10s\t| %-10s\t|", ucList.get(i).getstudentId(),ucList.get(i).getName(),ucList.get(i).getDate(),ucList.get(i).getTestId(), ucList.get(i).getqRoomNo(), ucList.get(i).getHealthStatus()));
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            
            icount++;
            
        }

        System.out.println("\n\n*************************************************************************************************************************");
        System.out.println("|                                                                                                                       |");
        System.out.println("|Total number of infected students: \t\t\t\t\t|" + String.format("%5d",icount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("*************************************************************************************************************************");
    }

    public String displayInfectedPrompt5b()
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome.\n\n Enter batch No (IMTXXXX/MTXXXX):\n");
        s=sc.next();
        return s;
    }

    public void displayInfectedDetailsListByBatch(ArrayList<useCase5> ucList, String batch)
    {
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n\n Here is the list of infected students of batch " + batch + ":\n\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Student Id\t| Student Name\t\t\t| diagnosis_Date\t\t| testId\t\t| qroomNo\t\t| healthStatus\t\t|");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        int icount=0;
        for(int i=0; i<ucList.size(); i++)
        {
            System.out.println(String.format("| %s\t| %-25s\t| %-25s\t| %-20s\t| %-15s\t| %-15s\t|", ucList.get(i).getstudentId(),ucList.get(i).getName(),ucList.get(i).getDate(),ucList.get(i).getTestId(), ucList.get(i).getqRoomNo(), ucList.get(i).getHealthStatus()));
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
            icount++;
        }

        System.out.println("\n\n*************************************************************************************************************************");
        System.out.println("|                                                                                                                       |");
        System.out.println("|Total number of infected students: \t\t\t\t\t|" + String.format("%5d",icount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("*************************************************************************************************************************");
    }

    public int displayInfectedPrompt6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Chose an option to fetch the RTPCR details the way you want: \n");  
        System.out.println("\t 1) Enter infected students details list.");
        System.out.println("\t 2) Update infected students details list.");
        System.out.println("\t 3) Remove a case from the infected students List. Since the case is no longer valid");
        
        int i=-1;
        while(true){
            String s = sc.next();
            if(s.equals("quit")) s="-1";
            if(s.equals("-1") || s.equals("1") || s.equals("2") || s.equals("3") ) { i=Integer.parseInt(s); return i;} 
        }
    }

    public ArrayList<String> displayUpdateInfected_Prompt1()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Enter the infected details details (keep in mind that the caseId must be unique, sid must exist) :\n\n");
        System.out.println("caseId: ");
        list.add( sc.nextLine() );
        System.out.println("studentId: ");
        list.add( sc.nextLine() );  
        System.out.println("qroomNo: ");
        list.add( sc.nextLine() );
        System.out.println("testId: ");
        list.add( sc.nextLine() );
        System.out.println("diagnosisDate: ");
        list.add( sc.nextLine() );
        System.out.println("startDate: ");
        list.add( sc.nextLine() );
        System.out.println("endDate: ");
        list.add( sc.nextLine() );
        System.out.println("healthStatus: ");
        list.add( sc.nextLine() );

        return list;
    }

    public ArrayList<String> displayUpdateInfected_Prompt2()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Here you can update the infected details. Please mention the caseId of the case. And proceed to update. Enter \"NULL\" wherever you don't want to modify:\n\n");
        System.out.println("caseId: ");
        list.add( sc.nextLine() );
        System.out.println("qroomNo: ");
        list.add( sc.nextLine() );
        System.out.println("testId: ");
        list.add( sc.nextLine() );
        System.out.println("diagnosisDate: ");
        list.add( sc.nextLine() );
        System.out.println("startDate: ");
        list.add( sc.nextLine() );
        System.out.println("endDate: ");
        list.add( sc.nextLine() );
        System.out.println("healthStatus: ");
        list.add( sc.nextLine() );

        return list;
    }

    public ArrayList<String> displayUpdateInfected_Prompt3()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Here you can remove Remove a case from the infected students List, if the case is no longer valid. Please mention the caseId of the case you wish to remove\n\n");
        System.out.println("caseId: ");
        list.add( sc.nextLine() );

        return list;
    }
     
    
    public void displayRoomatesOfInfectedStudents(ArrayList<ArrayList<useCase7b>> uc7b, ArrayList<useCase7a> uc7a)
    {
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
            
        System.out.println("Hello Admin! Welcome to home screen of Outbreak Observer.\n Here is the list of infected students followed bytheir roommates status:\n\n");
        
        int vcount=0, ccount=0, nvcount=0;
        for(int i=0; i<uc7a.size(); i++)
        {
            System.out.println(String.format("\n Infected Student : %s \t name: %s \t caseId: %s \t\n\n hroomNo: %s \t qroomNo: %s \t healthStatus: %s\n",uc7a.get(i).getstudentId(), uc7a.get(i).getName(), uc7a.get(i).getCaseId(), uc7a.get(i).gethroomNo(), uc7a.get(i).getqRoomNo(), uc7a.get(i).getHealthStatus()));
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| Student Id\t| Student Name\t\t\t| vaccination_status\t| rtpcr_recent_result\t\t| rtpcr_date\t\t|");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
            for(int j=0; j<uc7b.get(i).size(); j++)
            {
                System.out.println(String.format("| %s\t| %-25s\t| %-20s\t| %-24s\t| %-18s\t|", uc7b.get(i).get(j).getstudentId(),uc7b.get(i).get(j).getName(),uc7b.get(i).get(j).getVaccinationStatus(),uc7b.get(i).get(j).getRTPCRResult(),uc7b.get(i).get(j).getRTPCRDate()));
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                //if(uc7b.get(i).get(j).getVaccinationStatus().equals("completed")) vcount++; 
                //if(uc7b.get(i).get(j).getVaccinationStatus().equals("1st dose Taken")) nvcount++;
                //if(uc7b.get(i).get(j).getVaccinationStatus().equals("2nd dose Taken")) ccount++;
            }
            
        }

        System.out.println("\n\n*************************************************************************************************************************");
        System.out.println("|                                                                                                                       |");
        System.out.println("| Total number of vaccinated students: \t\t\t\t\t|" + String.format("%5d",vcount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("| Total number of non-vaccinated students: \t\t\t\t|" + String.format("%5d",nvcount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("| Total number of students Taken 2 or more doses: \t\t\t|" + String.format("%5d",ccount) + "\t\t\t\t\t\t|");
        System.out.println("|                                                                                                                       |");
        System.out.println("*************************************************************************************************************************");        
    }
}