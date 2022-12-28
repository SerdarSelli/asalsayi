public class Main {
    public static void main(String[] args) {
        for (long i =10000;i<=1000000;i++){
            long sayac=0;
            for (long j=1;j<=i;j++){
                if (i%j==0){
                    sayac++;
                }
            }
            if (sayac==2){
                System.out.print(i+" ");
            }
        }
    }
}