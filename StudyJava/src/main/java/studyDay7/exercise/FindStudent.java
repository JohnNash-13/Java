package studyDay7.exercise;

/**
 * FindStudent
 * 查询学生方法
 * @Author lhq
 * @Version 1.0
 * 2021/2/14 9:19
 **/
public class FindStudent {

    public void errorInfo() {
        System.out.println("no this student");
    }

    public boolean findStudentByName(Student[] students, String name) {

        var flag = 0;

        for (Student s : students) {
            if ( s.getName().equals(name) ) {
                System.out.println(s.getName());
                flag = 1;
                return true;
            }
        }
        if (flag != 1) {
            errorInfo();
            return false;
        }

        return true;
    }

    public boolean findStudentByAddress(Student[] students, String address) {

        var flag = 0;

        for (Student s : students) {
            if ( s.getAddress().equals(address) ) {
                System.out.println(s.getAddress());
                flag = 1;
                return true;
            }
        }
        if (flag != 1) {
            errorInfo();
            return false;
        }

        return true;
    }

    public boolean findStudentByEmail(Student[] students, String email) {

        var flag = 0;

        for (Student s : students) {
            if ( s.getEmail().equals(email) ) {
                System.out.println(s.getEmail());
                flag = 1;
                return true;
            }
        }
        if (flag != 1) {
            errorInfo();
            return false;
        }

        return true;
    }
}
