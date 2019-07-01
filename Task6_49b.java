import java.util.Scanner;
public class Task6_49b{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Please input some natural number: ");
        int n=in.nextInt();
        int ni=n, ni2;
        int quantity2=0,quantity5=0;
        for(int j=1;;j++){      //Looking for numbers 2 and 5
            ni2=ni;
            ni=ni/10*10;
            if(ni2-ni==2) {
                System.out.printf("The number %d have 2 in %d position%n",n,j);
                quantity2++;
            }
            if(ni2-ni==5) {
                System.out.printf("The number %d have 5 in %d position%n",n,j);
                quantity5++;
            }
            ni/=10;
            if(ni==0){
                System.out.printf("The number %d have %d numbers 2%n",n,quantity2);
                System.out.printf("The number %d have %d numbers 5%n",n,quantity5);
                break;
            }
            
        }
        in.close();

     } 
}