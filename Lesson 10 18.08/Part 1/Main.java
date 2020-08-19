import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            for (; ; ) {
                try {
                System.out.println("Введіть Палером: ");
                String in = input.readLine();
                sb.reverse().equals(in.length());
                if ("q".equals(in)) break;
                    if (in.length() == 5) {
                        System.out.println("Палером є вірним!" + in);
                    } else System.out.println("Не вірно!, довжина Вашого слова: " + in.length());
            } catch(IOException e){
                System.out.println("Стопе, помилочка, перевір значення");
            }
        }
    }
}
