import java.util.Date;

public class Student {
    private static int idStudent = 1;
    private int id = idStudent++;
    private String surname;
    private String name;
    private String patronymic;
    private Date birthday;
    private String address;
    private int phone_Number;
    private String faculty;
    private int course;
    private String group;

    Student(String surname, String name, String patronymic, Date birthday, String address, int phone_Number, String faculty, int course, String group) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phone_Number = phone_Number;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday.setYear(birthday);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String toString() {
        return getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getFaculty();
    }
}
