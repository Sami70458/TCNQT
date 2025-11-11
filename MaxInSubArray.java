import java.util.*;

public class MaxInSubArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int  i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Value of k:");
        int k = sc.nextInt();

        int max = 0;
        StringBuilder result = new StringBuilder();
        int[] newResult =  new int[n-k+1];

        for(int i = 0; i<=n-k; i++){
            max = arr[i];

            for(int j = i; j<i+k; j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }

            result.append(max);
            newResult[i] = max;
        }

        System.out.println(result);
        System.out.println(Arrays.toString(newResult));
    }
}