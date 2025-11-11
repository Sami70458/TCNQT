import java.util.*;

public class PasswordCreation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the password:");
        String password = sc.next();

        System.out.print("Enter value:");
        int value = sc.nextInt();

        String output = createPassword(password,value);

        System.out.println(output);
    }

    static String createPassword(String password, int value){
        StringBuilder result = new StringBuilder();

        for(char ch : password.toCharArray()){
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    result.append((char)(((ch-'a'+value)%26)+'a'));
                }else{
                    result.append((char)(((ch-'A'+value)%26)+'A'));
                }
            }else if(Character.isDigit(ch)){
                result.append((char)(((ch-'0'+value)%10)+'0'));
            }else{
                if(ch=='@'){
                    result.append('#');
                }else if(ch=='#'){
                    result.append('@');
                }
            }
        }
        

        return result.toString();
    }
}