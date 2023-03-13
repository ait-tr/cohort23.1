import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        JavaTeacher javaTeacher = new JavaTeacher();

        System.out.println(javaTeacher.school);
        System.out.println(javaTeacher.job);
        System.out.println(javaTeacher.mainSubject);
        javaTeacher.work();



        FrontEndTeacher frontEndTeacher = new FrontEndTeacher();
        System.out.println("FrontEnd teacher");
        System.out.println(frontEndTeacher.school);
        System.out.println(frontEndTeacher.job);
        System.out.println(frontEndTeacher.mainSubject);
        javaTeacher.work();

        Teacher teacher = new Teacher();
      //  teacher.
      //  javaTeacher.
      //  frontEndTeacher.

        Teacher javaTeacher1 = new JavaTeacher();
        Teacher frontEndTeacher1 = new FrontEndTeacher();

      //  javaTeacher1.

        List list = new ArrayList();
        ArrayList arrayList = new ArrayList();

       // JavaTeacher javaTeacher2 = new Teacher();- так нельзя
    }
    /*
    AIT
Teacher
Java
Teaching

FrontEnd teacher
AIT
Teacher
JavaScript
Teaching

     */


}