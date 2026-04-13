import java.util.ArrayList;

public class StudentAnalyzer {
    private ArrayList<Student> studentList;

    public StudentAnalyzer(ArrayList<Student> list) {
        studentList = list;
    }

    // Part (a) - Conditional Counting (countAbove)
    public int countAbove(int threshold) {
        int count = 0;
        for (Student s : studentList) {
            if (s.getMarks() > threshold) {
                count++;
            }
        }
        return count;

    }

    // Part (b) - Safe Removal During Traversal (removeFalling)
    public void removeFalling(int passMark) {
        int i = 0;
        while (i < studentList.size()) {
            if (studentList.get(i).getMarks() < passMark) {
                studentList.remove(i);
            } else {
                i++;
            }
        }
    }

}
