package program;

import java.util.Scanner;


class Plan {
    public static void main(String[] args) {
        System.out.println("Напишіть день тижня\nз великої літерм");
        Scanner dayOW = new Scanner(System.in);
        String day = dayOW.nextLine();
        System.out.println("ви написали: " + day);
        switch (day) {
            case "Понеділок": {
                System.out.println("Понеділок \n");
                System.out.println("9 ранку, прокинутись");
                System.out.println("10 ранку, вийти на прогулянку з собакою");
                System.out.println("13 дня, приготувати обід");
                System.out.println("13 дня, пообідати");
                System.out.println("15:10 вийти на урок");
                System.out.println("15^30 урок");
                break;
            }
            case "Вівторок": {
                System.out.println("Вівторок\n");
                System.out.println("10 ранку, прокинутися");
                System.out.println("11 ранку, вийти на прогулянку з собакою");
                System.out.println("13 дня зробити обід, пообідати");
                System.out.println("13:30 почати робити домашнє завдання");
                System.out.println("");
                break;
            }
            case "Середа": {
                System.out.println("Середа\n");
                System.out.println("9 ранку прокинутися");
                System.out.println("10 ранку вийти на прогулянку з собакою");
                System.out.println("12 дня, почати готувати обід");
                System.out.println("13: 30 перевірити ДЗ");
                System.out.println("14:00 Скласти перелік запитань на заняття\n");
                System.out.println("15: 10 вийти на заняття");
                System.out.println("21:00 вийти на прогулянку з собакою");
                break;
            }
            case "Четвер": {
                System.out.println("Четвер\n");
                System.out.println("10 ранку, прокинутися");
                System.out.println("11 ранку, вийти на прогулянку з собакою");
                System.out.println("13 дня зробити обід, пообідати");
                System.out.println("13:30 почати робити домашнє завдання");
                System.out.println("");
                break;
            }
            case "П'ятниця": {
                System.out.println("П'ятниця\n");
                System.out.println("9 ранку прокинутися");
                System.out.println("10 ранку вийти на прогулянку з собакою");
                System.out.println("12 дня, почати готувати обід");
                System.out.println("13: 30 перевірити ДЗ");
                System.out.println("14:00 Скласти перелік запитань на заняття\n");
                System.out.println("15: 10 вийти на заняття");
                System.out.println("21:00 вийти на прогулянку з собакою");
                break;
            }
            case "Субота": {
                System.out.println("Субота\n");
                System.out.println("Можна прокинутись об 11 годині");
                System.out.println("11 рануц, вийти з собакоою");
                System.out.println("13-14 почати готувати обід, пообідати");
                System.out.println("15:00 Почати розбиратися з дз");
                System.out.println("16:00 повиконувати хатні обов'язки");
                System.out.println("Придылити час сым'ї");
                break;
            }
            case "Неділя": {
                System.out.println("Неділя\n");
                System.out.println("14:00 почати робити дз");
                System.out.println("До 20:00 зробити все дз, провести аналітику");
                System.out.println("21: 00 вийти з собакою");
                System.out.println("22:00 можна і в Доту, або КС зіграти :-)");
                break;
            }
            default: {
                System.out.println("Have a nice day :-)");
            }
        }
    }
}
