import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class collections {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> students = new ArrayList<>();
        students.add("Neeraj");
        students.add("Rahul");
        students.add("Amit");

        System.out.println("Students (ArrayList):");
        for(String student : students) {
            System.out.println(student);
        }

        // HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Neeraj");
        studentMap.put(102, "Rahul");
        studentMap.put(103, "Amit");

        System.out.println("\nStudents (HashMap):");
        for(Integer id : studentMap.keySet()) {
            System.out.println(id + " : " + studentMap.get(id));
        }

        // HashSet
        HashSet<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java"); // Duplicate ignored

        System.out.println("\nCourses (HashSet):");
        for(String course : courses) {
            System.out.println(course);
        }
    }
}