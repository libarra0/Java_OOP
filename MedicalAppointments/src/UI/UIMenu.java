package UI;

import java.util.Scanner;

public class UIMenu
{
    public static  String[] MONTHS  = {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};

    public static void showMenu()
    {
        System.out.println("Welcome to my appointments");
        System.out.println("Select the desired option");

        int response = 0;

        do
        {
            System.out.println("1.- model.Doctor");
            System.out.println("2.- model.Patient");
            System.out.println("0.- Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response)
            {
                case 1:
                    System.out.println("model.Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }
        while (response != 0);
    }

    public static void showPatientMenu()
    {
        int response = 0;

        do
        {
            System.out.println("\n");
            System.out.println("model.Patient");
            System.out.println("1.- Book an appointment");
            System.out.println("2.- My appointments");
            System.out.println("0.- Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response)
            {
                case 1:
                    System.out.println(":: Book an appointment");
                    for(int i = 0; i < 4; i++)
                    {
                        System.out.println(i +". " + MONTHS[i]);
                    }

                    break;
                case 2:
                    System.out.println(":: My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }
        while (response != 0);
    }
}
