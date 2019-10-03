import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectSorting {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Afroza Akter Mitu", 4.00f);
        Student s2 = new Student(4, "Tanvir Ahamed Akash", 3.50f);
        Student s3 = new Student(3, "Sagar Mahamud Salim", 3.98f);
        Student s4 = new Student(2, "Tahamina Akter", 3.88f);
        Student s5 = new Student(5, "Abdullah-Al-Mamun", 3.25f);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("Before sorting : ");
        for (Student s : list) {
            System.out.println(s);
        }
        /* 
         * Sorted by ID
         */
        Collections.sort(list, new SortById());

        System.out.println("\nAfter sorting by ID : ");
        for (Student s : list) {
            System.out.println(s);
        }
        /* 
         * Sorted by CGPA
         */
        Collections.sort(list, new SortByGPA());

        System.out.println("\nAfter sorting by GPA : ");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
