import java.util.*;

class Student implements Comparator<Student> {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

public class Test  {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student("xiaoming",18);
        student[1] = new Student("hhy",22);
        student[2] = new Student("gaofang",40);
        student[3] = new Student("aaa",26);
        student[4] = new Student("bde",19);
        System.out.println(Arrays.toString(student));
        NameComparator nameComparator = new NameComparator();
        Arrays.sort(student,nameComparator);
        System.out.println(Arrays.toString(student));

    }
}