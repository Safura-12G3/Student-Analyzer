// Welcome to my mini AP CS project!
// By: Safura | Class: 12G3 - F3

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int newMarks) {
        marks = newMarks;
    }
}