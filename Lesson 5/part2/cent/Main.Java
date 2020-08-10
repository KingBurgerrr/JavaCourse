package cent;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
        int m = rnd.ints(0,2).limit(100).sum();
        System.out.println("Орел випав " + m + " раз із 100 раз, решка " + (100-m));
	}
}
		