import java.util.*;
import java.io.*;

public class InputTaking{
    public static void main(String[] args) throws IOException{
        /*
         Type 1 : - Array Size is given
         */

         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

         int arr[] = new int[n];

         for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
         }

         for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
         }

         /*
          Type 2 : -  Dynamic Array
          */

        //   int n1 = sc.nextInt();

        //   ArrayList<Integer> list = new ArrayList<>();

        //   for(int i = 0; i<n1; i++){
        //     list.add(sc.nextInt());
        //   }

        //    for(int i = 0; i<n1; i++){
        //     System.out.print(list.get(i)+" ");
        //   }


        /*
         Type - 3 : - If array size is not given, we will take
         input as String (Space Separated)
         */

        //  String str = sc.nextLine();
        //  String nums[] = str.split(" ");

        //  ArrayList<Integer> list1 = new ArrayList<>();

        //  for(String num: nums){
        //     list1.add(Integer.parseInt(num));
        //  }

        //  for(int ele : list1){
        //     System.out.print(ele + " ");
        //  }


        /*
         Type - 4 : - If array size is not given, we will take
         input as String (Comma Separated)
         */

        // String str1 = sc.nextLine();
        // String nums[] = str1.split(",");

        // ArrayList<Integer> list1 = new ArrayList<>();

        // for(String num: nums){
        //      list1.add(Integer.parseInt(num));
        //   }

        //  for(int ele : list1){
        //    System.out.print(ele + " ");
        //   }


          
        /*
         Type - 5 : - If array size is not given, we will take
         input as String (Comma Separated with Brackets)
         */

        // String str2 = sc.nextLine();
        
        // if(str2.startsWith("{") && str2.endsWith("}")){
        //     str2 = str2.substring(1, str2.length()-1);
        // }

        // String nums[] = str2.split(",");



        // ArrayList<Integer> list2 = new ArrayList<>();

        // for(String num: nums){
        //      list2.add(Integer.parseInt(num));
        //   }

        //  for(int ele : list2){
        //    System.out.print(ele + " ");
        //   }


        /*
         BufferReader
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        System.out.println(word);

        int num1 = Integer.parseInt(br.readLine());

        System.out.println(num1);

        double num2 = Double.parseDouble(br.readLine());

        System.out.println(num2);

        /*
         When you enter number then string

         Scanner sc = new Scanner(System.in);
         int n = sc.nextLine();
         String s = sc.nextLine();
         System.out.print(n+" "+s);
         */

         
    }
}