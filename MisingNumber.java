import java.util.*;

public class MisingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};

        int missingNumber = findMissing(arr);

        System.out.println(missingNumber);
    }

    static int findMissing(int[] arr){
        int totalSum = 0;
        int n = arr.length + 1;

        for(int num : arr){
            totalSum+=num;
        }

        int actualSum = (n*(n+1))/2;

        return actualSum - totalSum;
    }
}
