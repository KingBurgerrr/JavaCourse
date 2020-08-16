import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException {
        //System.out.println(Season.WINTER);
        //Season ss = Season.WINTER;
        //for (Season season : Season.values()) {
        //System.out.println(season.ordinal() + ":" + season);
        //while (true) {
        for (Season season : Season.values()) {
                System.out.println("Enter a season :" + "\n" + "To exit hit 'q' ");
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                String in = input.readLine();
                if ("q".equals(in)) break;
                {
                    System.out.println("exit");
                }
                switch (in) {
                    case "WINTER":
                        System.out.println("WINTER`s days");
                        System.out.println(Arrays.toString(Month.getWinterMonths()));
                        break;
                    case "SUMMER":
                        System.out.println("SUMMER`s days");
                        System.out.println(Arrays.toString(Month.getSummerMoths()));
                        break;
                    case "FALL":
                        System.out.println("FALL`s dayz winter is comming");
                        System.out.println(Arrays.toString(Month.getFallMonths()));
                        break;
                    case "SPRING":
                        System.out.println("SPRING`s days");
                        System.out.println(Arrays.toString(Month.getSpringMonths()));
                        break;
                    case "28":
                        System.out.println("28 days monthes");
                        System.out.println(Arrays.toString(Month.get28()));
                        break;
                    case  "30":
                        System.out.println("30 days monthes");
                        System.out.println(Arrays.toString(Month.get30()));
                        break;
                    case "31":
                        System.out.println(Arrays.toString(Month.get31()));
                        break;
                }
                for (int i = 0; i < 12; i++){
                    System.out.println();
                }
            }
        }
    }

