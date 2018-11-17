package main.java.avramenko;

import java.util.Scanner;

public class View {

    public void menu() {
        System.out.println("0. Generate car list");
        System.out.println("1. Create car list");
        System.out.println("2. Exit");
    }

    public void subMenu(){
        System.out.println("0. Get list of cars of my brand");
        System.out.println("1. Get list of cars of my model which are used for more than N years");
        System.out.println("2. Get list of cars of my year that cost for more my price");
        System.out.println("3. Return to menu");
        System.out.println("4. Exit");
    }

    public void printMessage(int param) {
        switch (param) {
            case 1:
                System.out.println("How many cars do you want to add?");
                break;
            case 2:
                System.out.println("Enter name of brand: ");
                break;
            case 3:
                System.out.println("Enter name of model: ");
                break;
            case 4:
                System.out.println("Enter number of years: ");
                break;
            case 5:
                System.out.println("Enter price: ");
                break;
            case 6:
                System.out.println("I can generate 10 cars. How many cars do you want?: ");
                break;
            case 7:
                System.out.print("Identification Number: ");
                break;
            case 8:
                System.out.print("Brand: ");
                break;
            case 9:
                System.out.print("Model: ");
                break;
            case 10:
                System.out.print("Year: ");
                break;
            case 11:
                System.out.print("Color: ");
                break;
            case 12:
                System.out.print("Number: ");
                break;
            case 13:
                System.out.print("Price, $: ");
                break;
            case 14:
                System.out.println("Sorry, no results.");
            default:
                break;
        }
    }

    public int readNumber(int param) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            while (!sc.hasNextInt()) {
                switch (param) {
                    case 1:
                        System.out.println("Not a number. Please, choose number from 0 to 2.");
                        sc.next();
                        break;
                    case 2:
                        System.out.println("Not a number. Please, choose number from 1 to 10.");
                        sc.next();
                        break;
                    case 3:
                        System.out.println("Not a number. Please, choose number from 0 to 4.");
                        sc.next();
                        break;
                    case 4:
                        System.out.println("Not a year. Please, choose year from 1918 to 2018.");
                        sc.next();
                        break;
                    case 5:
                        System.out.println("Not a number. Please, enter price from 0 to 1000000000.");
                        sc.next();
                        break;
                    default:
                        break;
                }
            }
            n = sc.nextInt();
        } while (n < 0);
        return n;
    }

    public String readString() {
        Scanner sc = new Scanner(System.in);
        String string = new String(sc.nextLine());
        return string;
    }


    public void printCar(Car[] cars) {
        System.out.println(" Identification Number |      Brand      |    Model    |  Year  |  Color  |  Number  |   Price, $   ");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
