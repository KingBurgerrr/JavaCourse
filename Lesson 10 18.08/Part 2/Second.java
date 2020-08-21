import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            for (;; ) {
                System.out.println("Введіть слово: ");
                String in = input.readLine();
                //in.replaceAll("['а','и','о','у','е','і']", "-");
                System.out.println(in.replaceAll("['а','и','о','у','е','і']", "-"));
            }
        } catch (IOException e) {
            System.out.println("Стопе, помилочка, перевір значення");
        }
    }
}
