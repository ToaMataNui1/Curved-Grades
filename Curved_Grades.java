import java.util.Arrays;
import java.util.Scanner;

public class Curved_Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the names of the students: ");
        String line = input.nextLine();
        String[] names = line.split(",");
        
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
        }

        //System.out.println(Arrays.toString(names));

        double[] grades = new double[names.length];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter grade for " + names[i] + ":");
            double grade = input.nextDouble();
            grades[i] = grade;
        }

        //System.out.println(Arrays.toString(grades));
        
        double highScore = grades[0];
        String result = "F";

        for (int i = 0; i <= grades.length-1; i++) {
            if (grades[i] > highScore) {
                highScore = grades[i];
            }
        }

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > (highScore - 5)) {
                result = "A";
            } else if (grades[i] > (highScore - 15)) {
                result = "B";
            } else if (grades[i] > (highScore - 25)) {
                result = "C";
            } else if (grades[i] > (highScore - 35)) {
                result = "D";
            } else if (grades[i] <= (highScore - 35)) {
                result = "F";
            }
            System.out.println(names[i] + "'s grade is : " + result);
        }

    }

}
