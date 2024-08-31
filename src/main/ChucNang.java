package main;

public class ChucNang {

    public static int parseStringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static double calculateBMIOfStudent(double height, double weight) {
        Double heightincentimet = height / 100;
        return weight / (heightincentimet * heightincentimet);

    
}
}
