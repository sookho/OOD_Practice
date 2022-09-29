package service;

import entity.Course;
import entity.Teacher;
import map.SysMap;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private final SysMap sysMap;

    public TeacherService(SysMap sysMap) {
        this.sysMap = sysMap;
    }

    public Teacher init(String name){
        Teacher teacher = new Teacher(name);
        List<Object> teachers = sysMap.getMap().getOrDefault(Teacher.class, new ArrayList<>());
        teachers.add(teacher);
        sysMap.getMap().put(Teacher.class, teachers);
        return teacher;
    }

    public void create(Teacher teacher, String name, String date){
        Course course = new Course(name, date, teacher.getId(), new ArrayList<>());
        List<Object> courses = sysMap.getMap().getOrDefault(Course.class, new ArrayList<>());
        courses.add(course);
        sysMap.getMap().put(Course.class, courses);
        System.out.println(teacher.getName() + " Create Course Successfully!");
    }

    public void showCourseList(Teacher teacher){
        System.out.println("Course of Teacher " + teacher.getName() + ": ");
        int teacherId = -1;
        List<Object> teachers = sysMap.getMap().get(Teacher.class);
        for (Object o : teachers) {
            Teacher t = (Teacher) o;
            if(t.getName().equals(teacher.getName())){
                teacherId = t.getId();
                break;
            }
        }
        if(teacherId == -1){
            System.out.println("No such a teacher");
            return;
        }
        List<Object> courses = sysMap.getMap().get(Course.class);
        for (Object o : courses) {
            Course course = (Course) o;
            if(course.getTeacherId()==teacherId){
                System.out.println(course.toString());
            }
        }
    }


}
