package program;


public class Math {
    public static void main(String[] args) {
        int x;
        int y;
        int[] array = new int[]{12000,90,49,78,68,32};
        x = array[0];
        y = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= x) {
                x= array[i];
            }
            if(array[i] <= y)
                y = array[i];
        }
        System.out.println("Мінімальне значення: " + y + "\n" + "Максимальне значення: " + x);
    }
}
