package UIUX;
import java.util.ArrayList;
import java.util.Scanner;

import HostelRoom.HostelRoom;
import RTPCR.RTPCR;
import UseCases.UseCase1.useCase1;
import UseCases.useCase4.useCase4;
import UseCases.useCase4.useCase4b;
import UseCases.useCase5.useCase5;
import UseCases.useCase7.useCase7a;
import UseCases.useCase7.useCase7b;
import UseCases.useCase8.useCase8;

public class ClientUI {
    public int displayIntialPrompt(String username)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************** OUTBREAK OBSERVER ********************************************************");
        System.out.println("                         \033[3m Track the spread, Fight covid-19, Protect your community.\033[0m\n"); 
        System.out.println("Hello " + username+"! Welcome to home screen of Outbreak Observer.\n What action would you like to take:\n");
        System.out.println("\t 1) Get Vaccination Details.");
        System.out.println("\t 2) Get RTPCR details.");
        System.out.println("\t 3) Quit");
        int i;
        while(true)
        {
            String s = sc.next();
            if(s.equals("quit")) s="-1";

            if(s.equals("-1") || s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") ) 
            {
                i = Integer.parseInt(s); 
                return i;
            }
        }       
    }
}
