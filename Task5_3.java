import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int menu;
        do {
            do {
                System.out.println("\tList of actions");
                System.out.println("\tPress 1-5:");
                System.out.println("1. Show all integer numbers (from 25 to 30) one under another.");
                System.out.println("2. Show second degree of integer numbers from 10 to b (b>=10).");
                System.out.println("3. Show third degree of integer numbers from a to 50 (a<=50).");
                System.out.println("4. Show integer numbers from a to b (b>=a).");
                System.out.println("5. QUIT");
                System.out.print("Make your choice: ");
                menu=in.nextInt();
            } while (menu<1 || menu>5);
            switch (menu){
                case 1:
                    for(int i=25;i<=30;i++) System.out.println(i);
                    break;
                case 2:
                    int b;
                    do{
                        System.out.println("Input number b>=10");
                        b=in.nextInt();
                    }while (b<10);
                    for(int i=10;i<=b;i++)System.out.println(i*i);
                    break;
                case 3:
                    int a;
                    do{
                        System.out.println("Input number a<=50");
                        a=in.nextInt();
                    }while (a>50);
                    for(int i=a;i<=50;i++)System.out.println(i*i*i);
                    break;
                case 4:
                    int a1,b1;
                    do{
                        System.out.println("Input number a and b (b>=a)");
                        a1=in.nextInt();
                        b1=in.nextInt();
                    }while (b1<a1);
                    for(int i=a1;i<=b1;i++)System.out.println(i);
                    break;
                case 5:
                    break;
            }
        }while (menu != 5);

    }
}