package Other;
import java.util.Scanner;
public class FreeClass {

    public void ten() {
       /* System.out.println("--------------10--------------");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("First number");
        int n = myObj.nextInt();  // Read user input


        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Second number");
        int n1 = myObj1.nextInt();  // Read user input


        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){
                if(rows==1 || rows==n || spaces==1 || spaces==n1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }

        System.out.println(" ");


        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){

                System.out.print("#");


            }
            System.out.println(" ");

        }

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Char");
        String e = myObj2.nextLine();  // Read user input

        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){
                if(rows==1 || rows==n || spaces==1 || spaces==n1){
                    System.out.print(e);
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }*/
/*
        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Month");
        int e = myObj2.nextInt();  // Read user input

        if ((e <= 12) && (1 <= e)) {
                if(e==1){
                    System.out.print("January");
                }
                if(e==2){
                    System.out.print("February");
                }
                if(e==3){
                    System.out.print("March");
                }
                if(e==4){
                    System.out.print("April");
                }
                if(e==5){
                    System.out.print("May");
                }
                if(e==6){
                    System.out.print("June");
                }
                if(e==7){
                    System.out.print("July");
                }
                if(e==8){
                    System.out.print("August");
                }
                if(e==9){
                    System.out.print("September");
                }
                if(e==10){
                    System.out.print("October");
                }
                if(e==11){
                    System.out.print("November");
                }
                if(e==12){
                    System.out.print("December");
                }

        } else {
            System.out.print("Zlý mesiac");
        }
        switch (e) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong number");
        }


        switch (e) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;


            default:
                System.out.println("Wrong number");
        }

        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Month");
        int d = myObj3.nextInt();  // Read user input

        switch (d) {
            case 1:
                System.out.println("Winter");
                break;

            default:
                System.out.println("Wrong number");
        }
*/

        System.out.println("Hi! I am java program and I am able to find roots of a quadratic equation");
        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter number one");
        double a = myObj2.nextDouble();  // Read user input


        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter number two");
        double b = myObj3.nextDouble();  // Read user input


        Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter number three");
        double c = myObj4.nextDouble();  // Read user input

        double root1;
        double root2;
        double d = b * b - 4 * a * c;

        //   a1 b-10 c16 = prvný koren 2 a druhy koren 8
        // a1 b10 c25 = -5
        // a1 b4 c7 = 0

        if (a != 0) {

            if (d > 0) {
                System.out.println(d);
                root1 = (-b + Math.sqrt(d)) / (2*a);
                root2 = (-b - Math.sqrt(d)) / (2*a);
                System.out.println("Root 1 is:"+root1);
                System.out.println("Root 2 is:"+root2);
            } else if (d == 0) {
                System.out.println(d);
                root1 = (-b) / (2*a);
                System.out.println("Root is:"+root1);
            } else {
                System.out.println("Not possible");
            }

        } else {
            System.out.println("Wrong number");
        }


    }
}