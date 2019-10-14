import java.util.ArrayList;
import java.util.Date;

public class StudentsList {
    //private ArrayList<Student> studentList = new ArrayList<>();
    private Student[] studentList = new Student[5];
    int count = 0;

    public void addStudent(Student student) {
        studentList[count++] = student;
    }

    public void sortByFaculty(String faculty) {
        for (Student student : studentList) {
            if (student != null) {
                if (faculty.equalsIgnoreCase(student.getFaculty())) {
                    System.out.println(student.toString());
                }
            }
        }
    }
    public void sortByFacultyCourse(String faculty, int course){
        for(Student student : studentList) {
            if (student != null) {
                if (faculty.equalsIgnoreCase(student.getFaculty()) && student.getCourse() == course)
                    System.out.println(student.toString());
            }
        }
    }

    public void sortBirthdayYear(int year) {
        for (Student student : studentList) {
            if (student != null) {
                if (student.getBirthday().getYear() >= year)
                    System.out.println(student.toString());
            }
        }
    }

    public  void sortByGroup(String group) {
        for (Student student : studentList) {
            if (student != null) {
                if (group.equalsIgnoreCase(student.getGroup()))
                    System.out.println(student.toString());
            }
        }
    }


        }

