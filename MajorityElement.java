import java.util.*;

public class MajorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int  i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Map<Integer,Integer> freq = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();

        for(int num : arr){
                freq.put(num, freq.getOrDefault(num,0)+1);
        }

        for(int key : freq.keySet()){
            if(freq.get(key) >= n/2){
                result.add(key);
            }
        }

        for(int num : result){
            System.out.print(num+" ");
        }
    }
}
