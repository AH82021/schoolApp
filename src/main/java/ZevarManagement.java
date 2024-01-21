import java.util.ArrayList;
import java.util.Scanner;

public class ZevarManagement implements StudentService {
    private ArrayList<Student> studentList;


    public ZevarManagement() {
        this.studentList = new ArrayList<Student>();
    }

    @Override
    public void addStudent(Student student) {
          studentList.add(student);
        System.out.println("Student added successfully");
    }

    @Override
    public void readStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void updateStudent() {
        if(studentList.isEmpty()){
            System.out.println("No students to update");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current student list");

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i+1)+"- "+ studentList.get(i));
        }
        System.out.println("Enter the index of the student to update (1- "+studentList.size()+" )");
        int indexToUpdate = scanner.nextInt();

        if(indexToUpdate <1 || indexToUpdate > studentList.size()){
            System.out.println("Invalid index , please enter a valid index ");
            return;
        }
   scanner.nextLine();// consume the new line
        System.out.println("Enter update name: ");
        String updateName = scanner.nextLine();
        System.out.println("Enter update age: ");
        int updateAge = scanner.nextInt();

        studentList.set(indexToUpdate -1 , new Student(updateName, updateAge));
        System.out.println("Student at index " + indexToUpdate +" updated successfully");



    }

    @Override
    public void deleteStudent() {

    }
}
