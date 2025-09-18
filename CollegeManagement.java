public class CollegeManagement {
    public static void main(String[] args) {
        // Create a new college
        College myCollege = new College();

        // Create and add students
        Student student1 = new Student("John Doe", 20, "Computer Science");
        Student student2 = new Student("Jane Smith", 21, "Engineering");
        Student student3 = new Student("Mike Johnson", 19, "Mathematics");

        myCollege.addStudent(student1);
        myCollege.addStudent(student2);
        myCollege.addStudent(student3);

        // Display all students
        myCollege.displayStudents();
    }
}

class Student {
    private String name;
    private int age;
    private String faculty;

    public Student(String name, int age, String faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}

class College {
    private java.util.List<Student> students;

    public College() {
        this.students = new java.util.ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("College Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public java.util.List<Student> getStudents() {
        return new java.util.ArrayList<>(students);
    }
}
