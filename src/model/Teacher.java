package model;

public class Teacher {
    private String iD, teacherName, major;
    private int age;
    public Teacher(String iD, String teacherName, String major, int age) {
        this.iD = iD;
        this.teacherName = teacherName;
        this.major = major;
        this.age = age;
    }
    public String getiD() {
        return iD;
    }
    public void setiD(String iD) {
        this.iD = iD;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Teacher [iD=" + iD + ", teacherName=" + teacherName + ", major=" + major + ", age=" + age + "]";
    }
}
