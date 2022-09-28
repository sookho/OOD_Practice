package service;

import entity.Course;
import entity.Student;
import entity.Teacher;
import map.SysMap;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final SysMap sysMap;

    public StudentService(SysMap sysMap) {
        this.sysMap = sysMap;
    }

    public Student init(String name) {
        Student student = new Student(name);
        List<Object> students = sysMap.getMap().getOrDefault(Student.class, new ArrayList<>());
        students.add(student);
        sysMap.getMap().put(Student.class, students);
        return student;
    }

    public void choose(Student student, int courseId, String teacher) {
        int teacherId = -1;
        List<Object> teachers = sysMap.getMap().get(Teacher.class);
        for (Object o : teachers) {
            Teacher t = (Teacher) o;
            if (t.getName().equals(teacher)) {
                teacherId = t.getId();
                break;
            }
        }
        if (teacherId == -1) {
            System.out.println("No such a teacher");
            return;
        }
        List<Object> courses = sysMap.getMap().get(Course.class);
        for (Object o : courses) {
            Course course = (Course) o;
            if (course.getId() == courseId && course.getTeacherId() == teacherId) {
                course.getStudentList().add(student);
                System.out.println(student.getName() + " choose course successfully!");
                return;
            }
        }
        System.out.println("No such course!");
    }

    public void choose(Student student, String name, String teacher) {
        int teacherId = -1;
        List<Object> teachers = sysMap.getMap().get(Teacher.class);
        for (Object o : teachers) {
            Teacher t = (Teacher) o;
            if (t.getName().equals(teacher)) {
                teacherId = t.getId();
                break;
            }
        }
        if (teacherId == -1) {
            System.out.println("No such a teacher");
            return;
        }
        List<Object> courses = sysMap.getMap().get(Course.class);
        for (Object o : courses) {
            Course course = (Course) o;
            if (course.getName().equals(name) && course.getTeacherId() == teacherId) {
                course.getStudentList().add(student);
                System.out.println(student.getName() + " choose course successfully!");
                return;
            }
        }
        System.out.println("No such course!");
    }
}
