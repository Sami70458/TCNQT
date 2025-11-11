import java.util.*;

public class Nearest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Y = in.nextInt();

        double nearest = (double)(X/Y);

        int roundedNumber = customRounded(nearest);

        System.out.println(roundedNumber * Y);
    }

    static int customRounded(double n){
        int integerPart = (int)n;
        double decimalPart = n - integerPart;

        if(decimalPart>=0.5){
            return integerPart + 1;
        }else{
            return integerPart;
        }
    }
}