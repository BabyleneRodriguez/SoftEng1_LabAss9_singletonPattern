package SoftEng1_LabAss9_singletonPattern;

import java.util.Scanner;

public class HelpDesk
{
    public static void main(String args[])
    {
            System.out.println("SOFTWARE ENGINEERING 1");
            System.out.print("LABORATORY ASSIGNMENT 9 - SINGLETON PATTERN\n");
            System.out.print("RODRIGUEZ, BABYLENE G.\n");
            System.out.print("3-BSCS-1\n");
            System.out.println();


            CentralizedQueuingSystem monitoringQueuingSystem = new CentralizedQueuingSystem();


            System.out.println("\nPAG-IBIG OFFICE CENTRALIZED QUEUING SYSTEM\n");


            int option;
            while (true)
            {
              System.out.print("\n[1] --> Inquire with the Pag-Ibig Office");
              System.out.print("\n[2] --> Helpdesk Stations");
              System.out.print("\n[3] --> Reset Queue");
              System.out.print("\n[4] --> Exit Program");

              Scanner scanner = new Scanner(System.in);
              System.out.print("\n\nPlease enter the number of your choice: ");
              option = scanner.nextInt();


              switch (option)
              {
                  case 1:
                      monitoringQueuingSystem.addEnqueue();
                      monitoringQueuingSystem.displayQueue();
                      break;

                  case 2:
                      System.out.print("\n\n-- We currently have 3 Helpdesk Stations --\n");
                      System.out.print("\nPlease Enter the Number of Helpdesk Station that are Currently Available for Use: ");
                      int helpDeskStationNumber = scanner.nextInt();
                      monitoringQueuingSystem.helpDesk(helpDeskStationNumber);
                      monitoringQueuingSystem.displayQueue();
                      break;

                  case 3:
                      System.out.print("\n-- Queue Number Reset --");
                      System.out.print("\n\nPlease enter a new queue number: ");
                      int newQn = scanner.nextInt();
                      monitoringQueuingSystem.resetQueue(newQn);
                      break;

                  case 4:
                      System.out.print("\n\nEXITING PROGRAM...\n");
                      System.exit(5);
                      break;

                  default:
                      System.out.println("The input you have made is invalid. Please try again with a valid input.");
                    }
                }
            }
        }

