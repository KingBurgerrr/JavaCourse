package com.logos.lesson12.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException {
        try {
            for (Season season : Season.values()) {
                    System.out.println("Enter a season for show all monthes in this season \n"+ "Enter a month to check info about that \n" + "Enter 'pair' to show pair monthes \n 'non pair' to show non pair" + "\n" + "To exit hit 'q' \n");
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
                        case "JANUARY":
                            System.out.println(Month.JANUARY.equals(Month.JANUARY));
                            break;
                        case "FEBRUARY":
                            System.out.println(Month.FEBRUARY.equals(Month.FEBRUARY));
                            break;
                        case "MARCH":
                            System.out.println(Month.MARCH.equals(Month.MARCH));
                            break;
                        case "APRIL":
                            System.out.println(Month.APRIL.equals(Month.APRIL));
                            break;
                        case "MAY":
                            System.out.println(Month.MAY.equals(Month.MAY));
                            break;
                        case "JUNE":
                            System.out.println(Month.JUNE.equals(Month.JUNE));
                            break;
                        case "JULY":
                            System.out.println(Month.JULY.equals(Month.JULY));
                            break;
                        case "AUGUST":
                            System.out.println(Month.AUGST.equals(Month.AUGST));
                            break;
                        case "SEPTEMBER":
                            System.out.println(Month.SEPTEMBER.equals(Month.SEPTEMBER));
                            break;
                        case "OCTOBER":
                            System.out.println(Month.OCTOBER.equals(Month.OCTOBER));
                            break;
                        case "NOVEMBER":
                            System.out.println(Month.NOVEMBER.equals(Month.NOVEMBER));
                            break;
                        case "DECEMBER":
                            System.out.println(Month.DECEMBER.equals(Month.DECEMBER));
                            break;
                        case "pair":
                            System.out.println("Monthes thats have pair days");
                            System.out.println(Arrays.toString(Month.get30()) + Month.FEBRUARY);
                            break;
                        case "non pair":
                            System.out.println("Monthes thats have NON-pair days");
                            System.out.println(Arrays.toString(Month.get31()));
                            break;
                    }
                    }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("U`r have a problems :D");
        }
    }
        }

