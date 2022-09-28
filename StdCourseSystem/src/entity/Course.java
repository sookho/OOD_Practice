package entity;

import java.util.List;

public class Course {
    private int id;
    private String name;
    private String date;
    private int teacherId;
    private List<Student> studentList;
    private static int idCounter = 0;

    public Course(String name, String date, int teacherId, List<Student> studentList) {
        this.id = idCounter++;
        this.name = name;
        this.date = date;
        this.teacherId = teacherId;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", teacherId=" + teacherId +
                ", studentList=" + studentList +
                '}';
    }
}
