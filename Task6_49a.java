import java.util.Scanner;
public class Task6_49a{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Please input some natural number: ");
        int n=in.nextInt();
        int ni=n, ni2;
        int quantity3=0,quantity2=0,quantity5=0;
        for(int j=1;;j++){      //Looking for number 3
            ni2=ni;
            ni=ni/10*10;
            if(ni2-ni==3) {
                System.out.printf("The number %d have 3 in %d position%n",n,j);
                quantity3++;
            }
            ni/=10;
            if(ni==0){
                System.out.printf("The number %d have %d numbers 3",n,quantity3);
                break;
            }
            
        }
        in.close();

     } 
}