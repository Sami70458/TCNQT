import java.util.*;

public class Duplicate{
    public static void main(String[] args){
        int[] arr = {10,2,2,3,4,5,3,4,2,5,3};

        int result = findUnique(arr);

        System.out.println(result);
    }

    static int findUnique(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        for(int key : freq.keySet()){
            if(freq.get(key) == 1){
                return key;
            }
        }

        return -1;
    }
}