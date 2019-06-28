import java.util.Scanner;
public class Task1_17{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int menu;
        do {
            do {
                System.out.println("\n\tList of actions");
                System.out.println("\t   Press 0-18:");
                System.out.println("1. Math.sqrt(x1*x1+x2*x2).");
                System.out.println("2. x1*x2+x1*x3+x2*x3.");
                System.out.println("3. v0*t+a*t*t/2.");
                System.out.println("4. m*v*v/2+m*g*h.");
                System.out.println("5. 1/R1+1/R2.");
                System.out.println("6. m*g*Math.cos(a).");
                System.out.println("7. 2*Math.PI()*R.");
                System.out.println("8. b*b-4*a*c.");
                System.out.println("9. Y*m1*m2/(r*r).");
                System.out.println("10. I*I*R.");
                System.out.println("11. a*b*Math.sin(c).");
                System.out.println("12. Math.sqrt(a*a+b*b-2*a*b*Math.cos(c)).");
                System.out.println("13. (a*d+b*c)/(a*d).");
                System.out.println("14. Math.sqrt(1-Math.sin(x)*Math.sin(x)).");
                System.out.println("15. 1/Math.sqrt(a*x*x+b*x+c).");
                System.out.println("16. (Math.sqrt(x+1)+Math.sqrt(x-1))/(2*Math.sqrt(x)).");
                System.out.println("17. Math.abs(x)+Math.abs(x+1).");
                System.out.println("18. Math.abs(1-Math.abs(x)).");
                System.out.println("0. QUIT");
                System.out.print("Make your choice: ");
                menu=in.nextInt();
            } while (menu<0 || menu>18);
            switch (menu){
                case 1: 
                    System.out.println("Input x: ");
                    int x=in.nextInt();
                    if(x<-1) System.out.println("õ="+x+"   y(x)=-1");
                    else if(x>-1) System.out.println("õ="+x+"   y(x)="+x);
                         else System.out.println("õ="+x+"   y(x)=1");
                    break;
                case 2:
                    break;
              }
           }while (menu != 0);
           in.close();

     } 
}