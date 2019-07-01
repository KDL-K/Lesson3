import java.util.Scanner;
public class Task7_20{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Input quantity of numbers:");
        int n=in.nextInt();
        int[] A=new int[n];
        System.out.println("Input some numbers:");
        for(int i=0;i<n;i++){
            System.out.print("a"+(i+1)+": ");
            A[i]=in.nextInt();
        }
        System.out.print("a) ");
        int sum=0;
        for(int i=0;i<n;i++){
            if((i+1)%2==0){
                System.out.print("-a"+(i+1));
                sum-=A[i];
            }
            else{
                if(i==0) System.out.print("a"+(i+1));
                else System.out.print("+a"+(i+1));
                sum+=A[i];
            }
 
        }
        System.out.println("="+sum);
        System.out.print("\nb) a1+a"+n+"="+(A[0]+A[n-1]));
        System.out.println("\nc) a1-a2="+(A[0]-A[1]));
       
        in.close();
     } 
}