package Lesson7;

public class Su27 implements Danger {
    Su27() {
        Danger dng = new Danger() {
            public void Danger() {
            }

            public String bomb(String b) {
                return Danger.b;
            }

            public String forsage(String fors) {
                return fors;
            }

            public String fuel(String f) {
                return f;
            }

            public String stels(String s) {
                return s;
            }
        };
        Pilot plt = new Pilot();
        Plane pln = new Plane() {
            @Override
            protected int on(int min, int max) {
                return on;
            }

            public void gdown() {

            }
        };
        pln.Plane();
        plt.Pilot();
        Danger();
        pln.gdown(3, 5, 8);

    }

    public String bomb(String b) {
        return Danger.b;
    }

    public String forsage(String fors) {
        return fors;
    }

    public String fuel(String f) {
        return f;
    }

    public String stels(String s) {
        return s;
    }

    public void Danger() {
        System.out.println(b + " " + f + " " + s + " " + Forsage.fors + " ");
    }
}
