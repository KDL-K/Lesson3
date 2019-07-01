import java.util.Scanner;
public class Task7_2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Put a and b for the range of numbers:");
        System.out.print("a:");
        int a=in.nextInt();
        System.out.print("b:");
        int b=in.nextInt();
        System.out.println("Put some number c: ");
        System.out.print("c:");
        int c=in.nextInt();
        for(int i=a;i<=b;i++){
            if(i%c==0) System.out.print(i+" ");
        }
        in.close();
     } 
}