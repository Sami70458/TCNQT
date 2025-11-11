import java.util.*;

public class TextAnalyzer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        HashMap<Character,Integer> freqMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(ch==' ') continue;
            ch = Character.toLowerCase(ch);
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);

        }

        List<Character> keys = new ArrayList<>(freqMap.keySet());
        Collections.sort(keys);

        for(char key : keys){
            System.out.println(key+":"+freqMap.get(key));
        }
    }
}