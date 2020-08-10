package anim;

public class Animal {
    private String animal;
    private int speed;
    private int age;

    private String getAnimal() {
        return animal;
    }

    private void setAnimal(String animal) {
        this.animal = animal;
    }

    private int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }
    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Назва тварини= " + this.animal + "Швидкість тварини= " +  this.speed + "вік тварини= " + this.age + "\n<==================================================================>" + " \n";
    }

    Animal(String animal, int speed, int age) {
        this.animal = animal;
        this.speed = speed;
        this.age = age;
    }
}