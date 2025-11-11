import java.util.*;

public class SortColorsBySwap {
    public static void main(String[] args) {
        int[] nums = {3,6,3,7,6,3,7};

        List<Integer> sorted = sortBySwap(nums,nums.length);

        for(int n : sorted){
            System.out.print(n+" ");
        }
    }

    static List<Integer> sortBySwap(int[] arr, int n){
        int left = 0;
        int mid = 0;
        int right = n-1;

        while(mid<=right){
            if(arr[mid]==3){
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;

                left++;
                mid++;
            }
            else if(arr[mid]==6){
                mid++;
            }
            else if(arr[mid]==7){
                int temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;
                right--;
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int num : arr){
            result.add(num);
        }

        return result;

    }
}
