public class Task5_12{
    public static void main(String[] args){
        System.out.println("Table of dependence of density of air on height");
        for(int i=0;i<20;i++) System.out.print("_");
        System.out.println();
        System.out.println("| Height | Density |");
        for(int i=0;i<20;i++) System.out.print("_");
        System.out.println();
        for(int h=0;h<=1000;h+=100){
           if(h<10) System.out.print("| "+h+"      | ");
           else if(h>=1000) System.out.print("| "+h+"   | ");
                else System.out.print("| "+h+"    | "); 
           System.out.printf("%.4f  |%n",(1.29*Math.pow(Math.E,(-h*1.25*Math.pow(10,-4)))));
        }
        for(int i=0;i<20;i++) System.out.print("_");
        System.out.println();
    }
}