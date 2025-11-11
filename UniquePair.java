import java.util.*;

public class UniquePair {
    public static void main(String[] args){
        int[] arr = {1,2,3};

        findPairs(arr);
        findCount(arr);

    }

    static void findPairs(int[] arr){
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();

        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                int sum = arr[i]+arr[j];
                if(sum%2==0){
                    int a = Math.min(arr[i], arr[j]);
                    int b = Math.max(arr[i], arr[j]);

                    String pair  = a + "," +b;

                    if(!seen.contains(pair)){
                        seen.add(pair);
                        result.add("("+a+","+b+")");
                    }
                }
            }
        }

        System.out.println(result);
    }


    static void findCount(int[] arr){
        Set<String> seen = new HashSet<>();
        int count = 0;

        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                int sum = arr[i]+arr[j];
                if(sum%2==0){
                    int a = Math.min(arr[i], arr[j]);
                    int b = Math.max(arr[i], arr[j]);

                    String pair  = a + "," +b;

                    if(!seen.contains(pair)){
                        seen.add(pair);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
