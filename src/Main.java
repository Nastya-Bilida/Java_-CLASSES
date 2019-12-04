import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student [] studentArray = new Student[3];
        Date date = new Date();

        studentArray[0] = new Student("Bilida", "Nastya", "Andreevna", new Date(1999,11,29), " Lenina, 14", 56789,"FITiU", 3, "720604");
        studentArray[1] = new Student("Osipow", "Anton", "Sergeevich", new Date(1999,7,1), " Gagaa, 13", 52469,"FITiU", 4, "722403");

        StudentsList list = new StudentsList();

        for (Student student: studentArray){
            list.addStudent(student);
        }

        System.out.println("List of students FITiU:");
        list.sortByFaculty("FITiU");

        System.out.println("\nStudent lists for each FITiU and 3 course:");
        list.sortByFacultyCourse("FITiU", 3);

        System.out.println("\nList of students born after 1998:");
        list.sortBirthdayYear(1998);

        System.out.println("\nList of students 720604 group:");
        list.sortByGroup("720604");
    }
}
