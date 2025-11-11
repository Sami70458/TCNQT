import java.util.*;

public class DistinctORs{
    public static void main(String[] args){
        int[] arr = {0};

        System.out.println(countOrs(arr));
    }

    static int countOrs(int[] arr){
        Set<Integer> res = new HashSet<>();
        Set<Integer> curr = new HashSet<>();

        for(int x : arr){
            Set<Integer> next = new HashSet<>();

            next.add(x);

            for(int y : curr){
                next.add(x|y);
            }

            curr = next;

            res.addAll(curr);
        }

        return res.size();
    }
}