public class TestTeacher extends Teacher {
    String mainSubject = "Testing";


    public static void main(String[] args) {
        TestTeacher testTeacher = new TestTeacher();
        System.out.println(testTeacher.getSchool());
        System.out.println(testTeacher.getJob());
        System.out.println(testTeacher.mainSubject);
    }
    /*
    AIT
Teacher
Testing
     */
}
