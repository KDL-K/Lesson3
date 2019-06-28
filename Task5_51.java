import java.util.Scanner;
public class Task5_51{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("\n(a1+a2+..+an)/n");
        System.out.print("Input n: ");
        int n=in.nextInt();
        double[] arrayA=new double[n];
        for(int i=0;i<n;i++){
            System.out.printf("Input a%d: ",(i+1));
            arrayA[i]=in.nextDouble();
        } 
        double res=arrayA[0];
        System.out.print("(a1+");
        for(int i=1;i<(n-1);i++){
            System.out.printf("a%d+",(i+1));
            res+=arrayA[i];
        }
        res+=arrayA[n-1];
        System.out.printf("a%d)/n=%.4f%n",n,(res/n));

        in.close();

     } 
}