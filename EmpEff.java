import java.util.*;

public class EmpEff {
    public static void main(String[] args) {
        int[] eff = {3,-2,-8,4,1};
        int n = eff.length;
        Arrays.sort(eff);

        int emp1 = eff[n-1];
        int emp2 = eff[n-2];
        int emp3 = eff[n-3];

        int neg0 = eff[0];
        int neg1 = eff[1];

        System.out.println(Math.max(emp1*emp2*emp3, neg0*neg1*emp1));
    }
}
