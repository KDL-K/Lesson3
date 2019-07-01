public class Task5_71{
    public static void main(String[] args){
        double amount0=1000.0;
        double per=0.02;
        double[] amountN=new double[12];
        amountN[0]=amount0*(1+per);
        for(int i=1;i<12;i++) amountN[i]=amountN[i-1]*(1+per);
        for(int i=0;i<10;i++) 
            System.out.printf("The gain of money in the %d month: %.2f%n",(i+1),(amountN[i]-amount0));
        for(int i=2;i<12;i++){
            System.out.printf("Amount of money in the %d month: %.2f%n",(i+1),amountN[i]);
        }
    }
}