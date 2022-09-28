import entity.Student;
import entity.Teacher;
import enums.CourseEnum;
import enums.StudentEnum;
import enums.TeacherEnum;
import map.SysMap;
import service.StudentService;
import service.TeacherService;

public class Main {

    public static void main(String[] args) {

        SysMap sysMap = new SysMap();

        TeacherService teacherService = new TeacherService(sysMap);
        Teacher one = teacherService.init(TeacherEnum.ONE.getName());
        teacherService.create(one, CourseEnum.MATH.getName(), CourseEnum.MATH.getDate());
        teacherService.create(one, CourseEnum.COMPUTER.getName(), CourseEnum.COMPUTER.getDate());
        System.out.println("-====================-");
        Teacher two = teacherService.init(TeacherEnum.TWO.getName());
        teacherService.create(two, CourseEnum.MATH.getName(), CourseEnum.MATH.getDate());
        teacherService.create(two, CourseEnum.COMPUTER.getName(), CourseEnum.COMPUTER.getDate());
        System.out.println("-====================-");

        StudentService studentService = new StudentService(sysMap);
        Student jerry = studentService.init(StudentEnum.JERRY.getName());
        Student tom = studentService.init(StudentEnum.TOM.getName());
        Student bob = studentService.init(StudentEnum.BOB.getName());
        Student jack = studentService.init(StudentEnum.JACK.getName());
        Student rose = studentService.init(StudentEnum.ROSE.getName());


        studentService.choose(rose, 0, "One");
        studentService.choose(jerry, 1, "One");
        studentService.choose(tom, CourseEnum.MATH.getName(), "One");
        studentService.choose(bob, 2, "Two");
        studentService.choose(jack, CourseEnum.COMPUTER.getName(), "Two");
        System.out.println("-====================-");
        teacherService.showCourseList(one);
        System.out.println("-====================-");
        teacherService.showCourseList(two);

    }

}
