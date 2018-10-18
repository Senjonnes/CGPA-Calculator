import java.util.ArrayList;
import java.util.Scanner;

public class CgpaCalc {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<String>();
        System.out.print("Enter the number of courses offered: ");
        int coursesNum = input.nextInt();
        int count = 1;
        Scanner CourseInput = new Scanner(System.in);
        while (coursesNum > 0) {
            System.out.print("Type Course" + count + ": ");
            String CourseCode = CourseInput.nextLine();
            System.out.println();
            courses.add(CourseCode);
            count++;
            coursesNum--;
        }
        System.out.println(courses);
        System.out.println();

        ArrayList<Integer> coursesUnit = new ArrayList<>();
        System.out.println("Enter unit for each of the courses entered");
        for (int i = 0; i < courses.size(); i++) {
            System.out.print(courses.get(i) + ": ");
            int score = input.nextInt();
            coursesUnit.add(score);
        }

        ArrayList<Integer> ScoreList = new ArrayList<>();
        System.out.println("\nEnter score for each of the courses entered");
        for (int i = 0; i < courses.size(); i++) {
            System.out.print(courses.get(i) + ": ");
            int score = input.nextInt();
            ScoreList.add(score);
        }
        String CourseGrade = "";
        double points = 0;
        for (int i = 0; i < ScoreList.size(); i++) {
            if (ScoreList.get(i) >= 70) {
                points += (5 * coursesUnit.get(i));
                CourseGrade += courses.get(i) + "\t\t" + coursesUnit.get(i) + "\t\t" + ScoreList.get(i) + "\t\t" +
                        "A\t\t" + (5 * coursesUnit.get(i)) + "\n";
            } else if (ScoreList.get(i) <= 69 && ScoreList.get(i) >= 60) {
                points += (4 * coursesUnit.get(i));
                CourseGrade += courses.get(i) + "\t\t" + coursesUnit.get(i) + "\t\t" + ScoreList.get(i) + "\t\t" +
                        "B\t\t" + (4 * coursesUnit.get(i)) + "\n";
            } else if (ScoreList.get(i) >= 50 && ScoreList.get(i) <= 59) {
                points += (3 * coursesUnit.get(i));
                CourseGrade += courses.get(i) + "\t\t" + coursesUnit.get(i) + "\t\t" + ScoreList.get(i) + "\t\t" +
                        "C\t\t" + (3 * coursesUnit.get(i)) + "\n";
            } else if (ScoreList.get(i) >= 40 && ScoreList.get(i) <= 49) {
                points += (2 * coursesUnit.get(i));
                CourseGrade += courses.get(i) + "\t\t" + coursesUnit.get(i) + "\t\t" + ScoreList.get(i) + "\t\t" +
                        "D\t\t" + (2 * coursesUnit.get(i)) + "\n";
            } else if (ScoreList.get(i) <= 39) {
                points += (coursesUnit.get(i));
                CourseGrade += courses.get(i) + "\t\t" + coursesUnit.get(i) + "\t\t" + ScoreList.get(i) + "\t\t" +
                        "E\t\t" + (coursesUnit.get(i)) + "\n";
            }
        }
        System.out.println("Courses scores and grades\n");
        System.out.println("COURSES\t\tUNIT\tSCORE\tGRADE\tPOINT");
        System.out.println(CourseGrade);
        System.out.println("=======================================\nTOTAL POINT\t\t\t\t\t\t " + points);
        double unitsAdd = 0;
        for (int i = 0; i < coursesUnit.size(); i++) {
            unitsAdd += coursesUnit.get(i);
        }
        System.out.printf("CGPA\t\t\t\t\t\t\t %.2f", (points / unitsAdd));
    }
}
