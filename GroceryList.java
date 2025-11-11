import java.util.*;

public class GroceryList{
    public static void main(String[] args){
        String[][] items = {
            {"apple","1.0","5"},
            {"mango","2.0","10"},
            {"banana","3.0","4"}
        };

        double total = 0;
        double maxSell = 0;
        String maxItem = "";

        for(String[] item: items){
            double qty = Double.parseDouble(item[1]);
            double price = Double.parseDouble(item[2]);
            double sell = qty * price;
            total+=sell;

            if(sell>maxSell){
                maxItem = item[0];
            }

            
        }


        double avg = total/items.length;

        System.out.println(maxItem);
        System.out.printf("%.2f%n",total);
        System.out.printf("%.2f%n",avg);
    }
}