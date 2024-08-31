package model;

public class Student {
    private String id;
    private String nameStudent;
    private String dob;
    private int age;
    private String classs;
    private int weight;
    private int height;
    public Student(String id, String nameStudent, String dob, int age, String classs, int weight, int height) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.dob = dob;
        this.age = age;
        this.classs = classs;
        this.weight = weight;
        this.height = height;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNameStudent() {
        return nameStudent;
    }
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getClasss() {
        return classs;
    }
    public void setClasss(String classs) {
        this.classs = classs;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", nameStudent=" + nameStudent + ", dob=" + dob + ", age=" + age + ", classs="
                + classs + ", weight=" + weight + ", height=" + height + "]";
    }
    public String printValue(int age){
        return "Tuoi la: "+age;
    }

    public String printValue(int age, String name){
        return name+": "+age;
    }
}

