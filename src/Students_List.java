import java.util.ArrayList;
import java.util.Date;

public class Students_List {
    private ArrayList<Student> studentList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }



    public ArrayList<Student> print_Faculty(String faculty){
        ArrayList<Student> student = new ArrayList<>();
        for (Student st : studentList) {
            if (st.getFaculty() == faculty){
                System.out.println(st.toString());
            }
        }
        return  student;
    }

    public ArrayList<Student> print_Faclt_Course(String faculty, int course){
       ArrayList<Student> student = new ArrayList<>();
        for(Student st : studentList){
            if(st.getFaculty() == faculty && st.getCourse() == course)
                System.out.println(st.toString());
        }
        return  student;
    }

    public ArrayList<Student> print_Birthyear(int year){
        ArrayList<Student> student = new ArrayList<>();
        for(Student st : studentList){
            if(st.getBirthday().getYear() > year)
                System.out.println(st.toString());
        }
        return  student;
    }

    public  ArrayList<Student> print_Group(String group){
        ArrayList<Student> student = new ArrayList<>();
        for(Student st : studentList){
            if(st.getGroup() == group)
                System.out.println(st.toString());
        }
        return  student;
    }

    public void addStuudent(Student student){
        studentList.add(student);
    }
}
