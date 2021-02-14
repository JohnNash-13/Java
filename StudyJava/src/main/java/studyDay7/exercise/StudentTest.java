package studyDay7.exercise;

/**
 * StudentTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/14 9:32
 **/
public class StudentTest {

    public static void main(String[] args) {

        var s1 = new Student("kiki1", 1, "女", 12223, "临海", "1@ww.com");
        var s2 = new Student("kiki2", 2, "女", 12223, "北京", "2@ww.com");
        var s3 = new Student("kiki3", 3, "女", 12223, "湖南", "3@ww.com");
        var s4 = new Student("kiki4", 4, "女", 12223, "上海", "4@ww.com");
        var s5 = new Student("kiki5", 5, "女", 12223, "深圳", "5@ww.com");

        var student = new Student[] {s1, s2, s3, s4, s5};

        var fs = new FindStudent();

        System.out.println(fs.findStudentByName(student, "kiki1"));
        System.out.println("---------");
        System.out.println(fs.findStudentByAddress(student, "北京"));
        System.out.println("---------");
        System.out.println(fs.findStudentByEmail(student, "4@ww.com"));
    }
}
