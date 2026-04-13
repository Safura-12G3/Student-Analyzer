import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        // 10+ students (includin duplicates and mixed marks)
        list.add(new Student("Fatima", 75));
        list.add(new Student("Sara", 82));
        list.add(new Student("Maya", 45));
        list.add(new Student("Lina", 90));
        list.add(new Student("Hannah", 60));
        list.add(new Student("Noora", 30));
        list.add(new Student("Alina", 88));
        list.add(new Student("Aisha", 55));
        list.add(new Student("Fatima", 95)); // duplicate name
        list.add(new Student("Jana", 70));

        StudentAnalyzer analyzer = new StudentAnalyzer(list);

        System.out.println("Count above 70: " + analyzer.countAbove(70));

        System.out.println("Top student: " +
            analyzer.findTopStudent().getName());

        System.out.print("Has duplicates: " +
            analyzer.hasDuplicateNames());
        
        System.out.println("Is sorted: " + 
            analyzer.isSorted());

        System.out.println("improving pairs: " +
            analyzer.countImprovingPairs());

        System.out.println("Top students >= 80:");
        for (Student s : analuzer.getTopStudents(80)) {
            System.out.println(s.getName() + " " + s.getMarks());
        }

        analyzer.removeFailing(50);
        System.out.println("After removing failing (<50):");
        for (Student s : list) {
            System.out.println(s.getName() + " " + s.getMarks());
        }
    }
}