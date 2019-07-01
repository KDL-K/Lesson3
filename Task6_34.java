public class Task6_34{
    public static void main(String[] args){
        int N=15;
        int n=0;
        int d=19;
        for(int i=100;;i++){
            if(i%d==0){
                System.out.print(i+" ");
                n++;
            }
            if(n==N) break;
        } 
    }
}