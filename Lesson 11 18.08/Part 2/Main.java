package com.main.part2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Auto auto = new Auto(" Ford" ,1999, 290);
        Rudder rd = new Rudder("Ford", 1990, 240, "Дерево", 21);
        Engine eng = new Engine("FOrd", 1990, 290, "V8",6 );

        System.out.println(auto.toString()+'\n'+ rd.toString()+"\n"+ eng.toString());
    }
}
