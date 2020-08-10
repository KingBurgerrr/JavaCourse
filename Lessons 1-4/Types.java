package JavaCore;

import java.util.Arrays;
import java.util.Collections;

public class Types {
    public static void main(String[] args) {
        System.out.println("Byte MAX " + Byte.MAX_VALUE);
        System.out.println("Byte MIN " + Byte.MIN_VALUE);
        System.out.println("Short MAX " + Short.MAX_VALUE);
        System.out.println("Short MIN " + Short.MIN_VALUE);
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Long MIN " + Long.MIN_VALUE);
        System.out.println("Float MAX " + Float.MAX_VALUE);
        System.out.println("Float MIN " + Float.MIN_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);
        System.out.println("Double MIN " + Double.MIN_VALUE);
        System.out.println("__________________________________");
        System.out.println("3 завдання, зробити масив і знайти мінімальне, і максимальне значення");
        Integer[] x = {167,2,30,44,5,60,79,83,19,101};
        int min = Collections.min(Arrays.asList(x));
        int max = Collections.max(Arrays.asList(x));

        System.out.println("Мінімальне значення: " + min + "\n" + "Максимальне значення: " + max);

    }
}
