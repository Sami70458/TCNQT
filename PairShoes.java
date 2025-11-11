import java.util.*;

public class PairShoes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of shoes:");

        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Shoes");

        String[] shoes = sc.nextLine().split(" ");

        Map<Integer, Integer> leftCount = new HashMap<>();
        Map<Integer, Integer> rightCount = new HashMap<>();

        for(String s : shoes){
            int size = Integer.parseInt(s.substring(0, s.length()-1));
            char side = s.charAt(s.length() - 1);

            if(side=='L' || side=='l'){
                leftCount.put(size, leftCount.getOrDefault(size, 0) + 1);
            }else if (side == 'R' || side == 'r') {
                rightCount.put(size, rightCount.getOrDefault(size, 0) + 1);
            }
        }

        int totalPairs = 0;

        for(int size: leftCount.keySet()){
            if(rightCount.containsKey(size)){
                totalPairs += Math.min(leftCount.get(size), rightCount.get(size));
            }
        }

        System.out.println("Total pairs: " + totalPairs);
        sc.close();
    }
}