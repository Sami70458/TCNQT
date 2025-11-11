import java.util.*;

public class StudentStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        List<String> grades = new ArrayList<>();
        List<String> genders = new ArrayList<>();

        System.out.println("Enter student details: name age grade gender");
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            names.add(input[0]);
            ages.add(Integer.parseInt(input[1]));
            grades.add(input[2]);
            genders.add(input[3]);
        }

        // Task 1: Print names of students older than 20
        for (int i = 0; i < n; i++) {
            if (ages.get(i) > 20) {
                System.out.print(names.get(i) + " ");
            }
        }
        System.out.println();

        // Task 2: Average ASCII of grades for female students
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (genders.get(i).equalsIgnoreCase("Female")) {
                sum += (int)grades.get(i).charAt(0);
                count++;
            }
        }

        int avg = count > 0 ? sum / count : 0;
        System.out.println(avg);
    }
}
