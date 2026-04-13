import java.util.ArrayList;

public class StudentAnalyzer {
    private ArrayList<Student> studentList;

    public StudentAnalyzer(ArrayList<Student> list) {
        studentList = list;
    }

    // Part (a) - Conditional Counting (countAbove)
    /* Counts how many students have marks greater than the threshold.
    Traverses entire ArrayList using enhanced for loop. */
    public int countAbove(int threshold) {
        int count = 0;
        for (Student s : studentList) {
            if (s.getMarks() > threshold) {
                count++;
            }
        }
        return count;

    }

    // Part (b) - Safe Removal During Traversal (removeFailing)
    /* Removes students with marks below passMark.
    Uses while loop to avoid skipping elements during removal. */
    public void removeFailing(int passMark) {
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
    /* Finds and returns the student with the highest marks.
    Keeps track of current maximum while traversing. */
    public Student findTopStudent() {
        Student top = studentList.get(0);
        for (Student s : studentList) {
            if (s.getMarks() > top.getMarks()) {
                top = s;
            }
        }
        return top;
    }

    // Part (d) - Filtered List Construction (getTopStudents)
    /* Creates a new list of students meeting the threshold.
    Does not modify the orignal list. */
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
    /* Uses nested loops to compare each pair of students.
    Returns true if duplicate names are found. */
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
    /* Checks if marks are in ascending order.
    Compares each student with the next one. */
    public boolean isSorted() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            if (studentList.get(i).getMarks() >
                studentList.get(i + 1).getMarks()) {
                return false;
            }
        }
        return true;
    }

    // Part (g) - Consecutive Pair Analysis (countImprovingPairs)
    /* Counts how many times marks increase compared to the previous student.
    Uses index based traversal. */
    public int countImprovingPairs() {
        int count = 0;
        for (int i = 1; i < studentList.size(); i++) {
            if (studentList.get(i).getMarks() >
                studentList.get(i - 1).getMarks()) {
                count++;
            }
        }
        return count;
    }

}
