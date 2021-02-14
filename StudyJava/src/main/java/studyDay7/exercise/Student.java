package studyDay7.exercise;

/**
 * ex1
 * 编写一个学生类，提供name,age,gender,phone,address,email成员变量
 * 且为每个提供set，get方法。
 * 为学生类提供默认和带所有参数的构造器
 * 并且提供吃喝玩乐方法
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 12:41
 **/
public class Student {

    private String name;
    private int age;
    private String gender;
    private int phone;
    private String address;
    private String email;

    public Student() {}

    public Student(String name, int age, String gender, int phone, String address, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void eat() {
        System.out.println("吃东西");
    }

    public void drink() {
        System.out.println("喝水");
    }

    public void play() {
        System.out.println("玩耍");
    }

    public void relax() {
        System.out.println("放松");
    }
}
