public class Task5_38{
    public static void main(String[] args){
        double dist=1.0;
        int N=100;
        double distFromHome=0.0;
        double amountDist=0.0;
        for(int n=1;n<=N;n++){
            if(n%2==1) distFromHome+=1/(double)n;
            else distFromHome-=1/(double)n;
            amountDist+=1/(double)n;
        }
        System.out.printf("After %d times the man will be in %.4f kilometers from house%n", N, distFromHome);
        System.out.printf("He will pass %.4f kilometers%n",amountDist);
    }
}