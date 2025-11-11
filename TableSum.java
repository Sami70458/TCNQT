import java.util.*;

public class TableSum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;


        //brute force
        for(int i = 1; i<=10; i++){
            sum = sum + n * i;
        }

        //direct 

        int newSum = n * 55;

        System.out.println(newSum);
    }
}