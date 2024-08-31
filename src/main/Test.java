package main;

import model.Student;
import model.Teacher;

public class Test {
    
    public static void main(String[] args){
  

    Student student1 = new Student("10", "Nguyen Van A" , "01/01/2001", 19, "SE1234", 69, 180);
    Teacher teacher1 = new Teacher("20", "Nguyen Van B", "Software Engineering", 30);
    System.out.println("Student1 :" + student1);
    student1.setNameStudent("Nguyen Van C");
    student1.setId("30");
    student1.setAge(21);
    student1.setClasss("SE5678");
    student1.setDob("02/02/2002");
    student1.setHeight(190);
    student1.setWeight(70);
    System.out.println("Student1 sau khi thay doi: ");
    System.out.println(student1);
    Double BMI = ChucNang.calculateBMIOfStudent(student1.getHeight(), student1.getWeight());
    System.out.println("BMI cua student1 la: " + BMI);
    System.out.println();
    System.out.println("Test method overload");
    System.out.println(student1.printValue(student1.getAge()));
    System.out.println(student1.printValue(student1.getAge(),student1.getNameStudent()));
    System.out.println();

    System.out.println("Teacher1: " + teacher1);
        teacher1.setAge(46);
        teacher1.setiD("40");
        teacher1.setTeacherName("Nguyen Van D");
        teacher1.setMajor("Data base");
        System.out.println("Teacher1 sau khi thay doi: ");
        System.out.println(teacher1);
        System.out.println();
       
       
    
}
}
