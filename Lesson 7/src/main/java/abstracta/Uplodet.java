package abstracta;

public class Uplodet {
    private int age;
    private int wight;

    private int getAge() {
        return age;
    }
    private void setAge(int age) {
        this.age = age;
    }
    private int getWight() {
        return wight;
    }
    private void setWight(int wight) {
        this.wight = wight;
    }
    public Uplodet(int age, int wight) {
        this.age = age;
        this.wight = wight;
    }
    public void calculate() {
        System.out.println("Вік: " + this.age + "Зріст: " + this.wight);
    }

}
