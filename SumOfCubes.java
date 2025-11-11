
import java.util.*;

public class SumOfCubes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long s1 = (long) (m*(m+1))/2;

        long s2 = (long) (n*(n-1))/2;

        long sum = s1*s1 - s2*s2;

        System.out.println(sum);

    }
}
