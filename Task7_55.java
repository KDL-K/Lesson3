import java.util.Scanner;
public class Task7_55{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Input number of athletes:");
        int numbAthletes=in.nextInt();
        double time, timeBest=-1;
        int athlete=-1;
        for(int i=0;i<numbAthletes;i++){
            System.out.print("athlete #"+(i+1)+"  time:");
            time=in.nextDouble();
            if(i==0){
                timeBest=time;
                athlete=i+1;
            }
            if(time<timeBest) {
                timeBest=time;
                athlete=i+1;
            }
            System.out.println("The best time Athlete #"+athlete+"   "+timeBest);
        }
        
        in.close();
     } 
}