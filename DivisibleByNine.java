import java.util.*;

public class DivisibleByNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n>=100 && n<=999){
            if(n%9==0){
                System.out.println("Number "+n+" is divisible by 9");
            }else{
                System.out.println("Number "+n+" is not divisible by 9");
            }
        }
    }
}
