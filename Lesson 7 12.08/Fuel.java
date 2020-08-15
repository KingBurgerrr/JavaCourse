package Lesson7;

//import java.util.Random;

public interface Fuel {
    double k = Math.random() * 999;
    String f = "Палива вистарчить на: " + k + "Километрів ";
    String fuel(String f);
}
