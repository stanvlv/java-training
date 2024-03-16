import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[2] = new Student(5421, "Carl Friedrich Gauss");
        students[1] = new Student(1234, "Gottfried Wilhelm Leibniz");
        // 00 treated as octal(base-8) number
        // students[0] = new Student(0054, "Albert Einstein");
        students[0] = new Student(54, "Albert Einstein");

        // sort the students: a-z
        Arrays.sort(students, Comparator.comparing(Student::getStudentName));


        System.out.println("ID\tName");
        for (Student student : students) {
            System.out.println(student.getStudentId() + "\t" + student.getStudentName());
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}


// import java.util.Arrays;
// import java.util.Comparator;

// public class Student {
//     private String studentId;
//     private String studentName;

//     public Student(String studentId, String studentName) {
//         this.studentId = studentId;
//         this.studentName = studentName;
//     }

//     public static void main(String[] args) {
//         Student[] students = new Student[3];
//         students[2] = new Student("5421", "Carl Friedrich Gauss");
//         students[1] = new Student("1234", "Gottfried Wilhelm Leibniz");
//         // 00 treated as octal(base-8) number
//         // students[0] = new Student(0054, "Albert Einstein");
//         students[0] = new Student("0054", "Albert Einstein");

//         // sort the students: a-z
//         Arrays.sort(students, Comparator.comparing(Student::getStudentName));


//         System.out.println("ID\tName");
//         for (Student student : students) {
//             System.out.println(student.getStudentId() + "\t" + student.getStudentName());
//         }
//     }

//     public String getStudentId() {
//         return studentId;
//     }

//     public String getStudentName() {
//         return studentName;
//     }
// }