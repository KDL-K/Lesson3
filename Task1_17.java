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
                System.out.println("7. 2*Math.PI*R.");
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
                case 0:
                    break;
                case 1: {
                    System.out.println("Input x1: ");
                    double x1=in.nextDouble();
                    System.out.println("Input x2: ");
                    double x2=in.nextDouble();
                    System.out.println("Math.sqrt(x1*x1+x2*x2)="+(Math.sqrt(x1*x1+x2*x2)));
                }
                    break;
                case 2: {
                    System.out.println("Input x1: ");
                    double x1=in.nextDouble();
                    System.out.println("Input x2: ");
                    double x2=in.nextDouble();
                    System.out.println("Input x3: ");
                    double x3=in.nextDouble();
                    System.out.println("x1*x2+x1*x3+x2*x3="+(x1*x2+x1*x3+x2*x3));
                }
                    break;
                case 3: {
                    System.out.println("Input v0: ");
                    double v0=in.nextDouble();
                    System.out.println("Input a: ");
                    double a=in.nextDouble();
                    System.out.println("Input t: ");
                    double t=in.nextDouble();
                    System.out.println("v0*t+a*t*t/2="+(v0*t+a*t*t/2));
                }
                    break;
                case 4: {
                    System.out.println("Input m: ");
                    double m=in.nextDouble();
                    System.out.println("Input v: ");
                    double v=in.nextDouble();
                    System.out.println("Input g: ");
                    double g=in.nextDouble();
                    System.out.println("Input h: ");
                    double h=in.nextDouble();
                    System.out.println("m*v*v/2+m*g*h="+(m*v*v/2+m*g*h));
                }
                    break;
                case 5: {
                    System.out.println("Input R1: ");
                    double R1=in.nextDouble();
                    System.out.println("Input R2: ");
                    double R2=in.nextDouble();
                    System.out.println("1/R1+1/R2="+(1/R1+1/R2));
                }
                    break;
                case 6: {
                    System.out.println("Input m: ");
                    double m=in.nextDouble();
                    System.out.println("Input g: ");
                    double g=in.nextDouble();
                    System.out.println("Input a: ");
                    double a=in.nextDouble();
                    System.out.println("m*g*Math.cos(a)="+(m*g*Math.cos(a)));
                }
                    break;
                case 7: {
                    System.out.println("Input R: ");
                    double R=in.nextDouble();
                    System.out.println("2*Math.PI*R="+(2*Math.PI*R));
                }
                    break;
                case 8: {
                    System.out.println("Input b: ");
                    double b=in.nextDouble();
                    System.out.println("Input a: ");
                    double a=in.nextDouble();
                    System.out.println("Input c: ");
                    double c=in.nextDouble();
                    System.out.println("b*b-4*a*c="+(b*b-4*a*c));
                }
                    break;
                case 9: {
                    System.out.println("Input Y: ");
                    double Y=in.nextDouble();
                    System.out.println("Input m1: ");
                    double m1=in.nextDouble();
                    System.out.println("Input m2: ");
                    double m2=in.nextDouble();
                    System.out.println("Input r: ");
                    double r=in.nextDouble();
                    System.out.println("Y*m1*m2/(r*r)="+(Y*m1*m2/(r*r)));
                }
                    break;
                case 10: {
                    System.out.println("Input I: ");
                    double I=in.nextDouble();
                    System.out.println("Input R: ");
                    double R=in.nextDouble();
                    System.out.println("I*I*R="+(I*I*R));
                }
                    break;
                case 11: {
                    System.out.println("Input a: ");
                    double a=in.nextDouble();
                    System.out.println("Input b: ");
                    double b=in.nextDouble();
                    System.out.println("Input c: ");
                    double c=in.nextDouble();
                    System.out.println("a*b*Math.sin(c)="+(a*b*Math.sin(c)));
                }
                    break;
                case 12: {
                    System.out.println("Input a: ");
                    double a=in.nextDouble();
                    System.out.println("Input b: ");
                    double b=in.nextDouble();
                    System.out.println("Input c: ");
                    double c=in.nextDouble();
                    System.out.println("Math.sqrt(a*a+b*b-2*a*b*Math.cos(c))="+(Math.sqrt(a*a+b*b-2*a*b*Math.cos(c))));
                }
                    break;
                case 13: {
                    System.out.println("Input a: ");
                    double a=in.nextDouble();
                    System.out.println("Input b: ");
                    double b=in.nextDouble();
                    System.out.println("Input c: ");
                    double c=in.nextDouble();
                    System.out.println("Input d: ");
                    double d=in.nextDouble();
                    System.out.println("(a*d+b*c)/(a*d)="+((a*d+b*c)/(a*d)));
                }
                    break;
                case 14: {
                    System.out.println("Input x: ");
                    double x=in.nextDouble();
                    System.out.println("Math.sqrt(1-Math.sin(x)*Math.sin(x))="+(Math.sqrt(1-Math.sin(x)*Math.sin(x))));
                }
                    break;
                case 15: {
                    System.out.println("Input a: ");
                    double a=in.nextDouble();
                    System.out.println("Input x: ");
                    double x=in.nextDouble();
                    System.out.println("Input b: ");
                    double b=in.nextDouble();
                    System.out.println("Input c: ");
                    double c=in.nextDouble();
                    System.out.println("1/Math.sqrt(a*x*x+b*x+c)="+(1/Math.sqrt(a*x*x+b*x+c)));
                }
                    break;
                case 16: {
                    System.out.println("Input x: ");
                    double x=in.nextDouble();
                    System.out.println("(Math.sqrt(x+1)+Math.sqrt(x-1))/(2*Math.sqrt(x))="+((Math.sqrt(x+1)+Math.sqrt(x-1))/(2*Math.sqrt(x))));
                }
                    break;
                case 17: {
                    System.out.println("Input x: ");
                    double x=in.nextDouble();
                    System.out.println("Math.abs(x)+Math.abs(x+1)="+(Math.abs(x)+Math.abs(x+1)));
                }
                    break;
                case 18: {
                    System.out.println("Input x: ");
                    double x=in.nextDouble();
                    System.out.println("Math.abs(1-Math.abs(x))="+(Math.abs(1-Math.abs(x))));
                }
                    break;
              }
           }while (menu != 0);
           in.close();

     } 
}