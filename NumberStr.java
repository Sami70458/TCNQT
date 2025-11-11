import java.util.*;

public class NumberStr{
    public static void main(String[] args){
        int[] arr = {3,15,4,6,2};

        System.out.println(toStringOutput(arr));
    }

    static String toStringOutput(int[] num){
        StringBuilder result = new StringBuilder();

        for(int n : num){
            if(n%3==0 && n%5==0){
                result.append("ThreeFive ");
            }else if(n%5==0){
                result.append("Five ");
            }else if(n%3==0){
                result.append("Three ");
            }else{
                result.append(n+" ");
            }
        }

        return result.toString();
    }
}