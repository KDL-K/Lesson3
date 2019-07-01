import java.util.Scanner;
public class Task6_82{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Please input some natural number: ");
        int n=in.nextInt();
        int ni=n, ni2, d;
        int max=-1, min=-1;
        while(ni!=0){     
            ni2=ni;
            ni=ni/10;
            d=ni2-ni*10;
            if(min==-1) min=d;
            if(max==-1) max=d;
            if(d<min) min=d;
            if(d>max) max=d;  
        }
        System.out.println("min="+min+" max="+max);
        if((max-min)%2==0) System.out.println("Difference between max and min is even");
        else System.out.println("Difference between max and min is NOT even");
        in.close();

     } 
}