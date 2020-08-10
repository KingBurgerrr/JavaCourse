package pack;

public class Worker implements Zp {
    int month = 6000;
    int hour = 12;
    Worker(int month, int hour) {
        this.month = month;
        this.hour = hour;
    }
    public void Zp() {
        System.out.println("ЗП прцівника в місяць: " + month + " ЗП по шодинно: " + (hour * 12 * 30));
    }
}
