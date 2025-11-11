import java.util.*;

public class MajorityElement2{
    public static void main(String[] args){
        int[] nums = {2,2,1,0,1,2,2,2,2};
        int n = nums.length;

        Map<Integer,Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        int limit = (int) (Math.ceil(n/3.0));

        for(int key : freq.keySet()){
            if(freq.get(key)>=limit){
                result.add(key);
            }
        }

        for(int e : result){
            System.out.println(e+" ");
        }

    }
}