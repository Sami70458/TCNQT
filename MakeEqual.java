import java.util.*;

public class MakeEqual{
    public static void main(String[] args){
        int[] arr = {3,3,3};

        int result = moves(arr);

        System.out.println(result);
    }

    static int moves(int[] arr){
        if(allEqual(arr)) return 0;

        Arrays.sort(arr);

        for(int i = 0; i<arr.length-1; i++){
            arr[i]++;
        }

        arr[arr.length-1]--;

        return 1+moves(arr);
    }

    static boolean allEqual(int[] arr){
        for(int i = 1; i<arr.length ; i++){
            if(arr[i]!=arr[0]){
                return false;
            }
        }

        return true;
    }
}