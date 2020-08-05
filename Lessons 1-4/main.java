package program;

public class main{
    public static void main(String[] args) {
        /*Програма для визначення НСД за лопомогою алгортиму Евкілда*/
        /*оголошуємо змінні*/
        int num1;
        int num2;
        int res;
        /*задаємо значення змінним*/
        num1 = 251;
        num2 = 105;
        /*проводимо перевірку чисел для коректної роботи наступного циклу
        * так само оголошоємо, що ДРУГЕ число не може дорівнювати нулю*/
        if (num1 < num2) {
            int buf = num1;
            num1 = num2;
            num2 = buf;
        }
        /*оголошуємо цикл роботи програми*/
        while (num2 != 0) {
            res = num1 % num2;
            num1 = num2;
            num2 = res;
        }
        /*Виводимо результат роботи програми*/
        System.out.println("НСД:" + " " + num1);

        /*Програма для розрахунку НСК*/
        /*оголошуємо змінні для розрахунку НСК*/
        int frag1;
        int frag2;
        int frag3;
        /*задаємо значення для розрахунку НСК*/
        frag1 = 152;
        frag2 = 105;
        /*проводимо перевірку для значень*/
        if (frag1 < frag2) {
            int buf = frag1;
            frag1 = frag2;
            frag2 = buf;
        }
        /*оголошуємо робочий цикл розрахунку*/
        frag3 = frag1 * frag2;
        do {
            res = frag1 % frag2;
            frag1 = frag2;
            frag2 = res;
            /*оголошуємо, що результат не може бути нульовим*/
        } while(res!=0);
        /*вводимо змінну результату*/
        int resultNSK = frag3 / frag1;
        /*виводимо результат роботи програми*/
        System.out.println("НСК:" + " " + resultNSK);
    }
}
