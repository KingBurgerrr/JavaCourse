package Lesson6.part4;

public class Bull extends Amphibia {
    Bull(String eat, String sleep, String swim, String walk) {
        super(eat, sleep, swim, walk);
        System.out.println("Хто це? - Bull" + "\n" + " Чи ість: " + eat + "\n" + " Чи спить? " + sleep + "\n" + " Чи плаває? " + swim + "\n" + " Чи гуляє? " + walk);
    }
}
