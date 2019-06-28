import java.util.Scanner;
public class Task5_64{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int nRegion=12;
        int[] area=new int[nRegion];
        int[] population=new int[nRegion];
        int areaSum=0, populationSum=0;
        for(int i=0;i<nRegion;i++){
            area[i]=(i+1)*7520;
            areaSum+=area[i];
        }
        for(int i=0;i<nRegion;i++){
            System.out.print("Input population for region "+(i+1)+":");
            population[i]=in.nextInt();
            System.out.println();
            populationSum+=population[i];
        }
        for(int i=0;i<nRegion;i++){
            System.out.println("Region #"+(i+1)+"  area "+area[i]+"km  population "+population[i]);
        }
        double densityAll=(double)populationSum/areaSum;
        System.out.printf("Average density of all regions: %.2f",densityAll);

        in.close();

     } 
}