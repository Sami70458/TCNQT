import java.util.*;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m  = sc.nextInt();

        for(int i = n; i<=m; i++){
            if(isPrime(i) && isPrime(calSum(i))){
                System.out.print(i+" ");
            }
        }
    }


    static boolean isPrime(int n){

        if(n<=1) return false;

        for(int i = 2; i<=(int)(Math.sqrt(n));i++){
            if(n%i==0){
                return false;
            }

            
        }

        return true;

    }

    static int calSum(int n){
        int sum = 0;
        while(n>0){
            int num = n%10;
            sum += num;
            n=n/10;
        }

        return sum;
    }
}
