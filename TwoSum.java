import java.util.*;

public class TwoSum{
    public static void main(String[] args){
        int[] arr = {-10,20,30,-5};
        int target = 25;
        int[] result = twoSum(arr,target);

        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> result = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            result.put(arr[i],i);
        }

        for(int i = 0; i<arr.length;i++){
            int diff = target - arr[i];

            if(result.containsKey(diff) && result.get(diff)!=i){
                return new int[]{i, result.get(diff)};
            }
        }

        return new int[]{-1,-1};
    }
}