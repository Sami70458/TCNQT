import java.util.*;

public class FibSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = a+b;

        if(n==1){
            sum = a; 
        }else if(n==2){
            sum = a + b;
        }else{
            for(int i = 3; i<=n; i++){
                int c = a + b;
                sum+=c;
                a = b;
                b = c;
            }
        }

        System.out.println(sum);
    }
}