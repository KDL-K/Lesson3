import java.util.Scanner;
public class Task6_71{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String[] names={"Alex","Andrew","Kate","Lucie","Mark"};
        int[] heigth=new int[names.length];
        System.out.println("Input heigth of pupils:");
        for(int i=0;i<heigth.length;i++){
            System.out.print(names[i]+" ");
            heigth[i]=in.nextInt();
        }
        int i;
        for(i=0;i<heigth.length-1;i++){
            if(heigth[i]<heigth[i+1]) {
                System.out.println("The list is NOT in decreasing order of pupils' heigth");
                break;
            }
        }
        if(i==heigth.length-1) System.out.println("The list is in decreasing order of pupils' heigth");
        in.close();
    }
}