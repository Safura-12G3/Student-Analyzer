import java.util.ArrayList;

public class StudentAnalyzer {
    private ArrayList<Student> studentList;

    public StudentAnalyzer(ArrayList<Student> list) {
        studentList = list;
    }

    // Part (a): Conditional Counting (countAbove)
    public int countAbove(int threshold) {
        int count = 0;
        for (Student s : studentList) {
            if (s.getMarks() > threshold) {
                count++;
            }
        }
        return count;

    }

}