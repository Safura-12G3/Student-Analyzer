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

    // Part (c) - Maximum with Object Return (findTopStudent)
    public Student findTopStudent() {
        Student top = studentList.get(0);
        for (Student s ; studentList) {
            if (s.getMarks() > top.getMarks()) {
                top = s;
            }
        }
        return top;
    }

    // Part (d) - Filtered List Construction (getTopStudents)
    public ArrayList<Student> getTopStudents(int threshold) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getMarks() >= threshold) {
                result.add(s);
            }
        }
        return result;
    }

    // Part (e) - Nested Traversal (hasDuplicateNames)
    public boolean hasDuplicateNames() {
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(i).getName()
                        .equals(studentList.get(j).getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    // Part (f) - Ordered Pattern Verification (isSorted)
    public boolean isSorted() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            if (studentList.get(i).getMarks() >
                studentList.get(i + 1).getMarks()) {
                return false;
            }
        }
        return true;
    }

}
