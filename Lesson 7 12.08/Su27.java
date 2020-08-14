package Lesson7;

public class Su27 implements Danger {
    Su27() {
        Pilot plt = new Pilot();
        Plane pln = new Plane() {
            @Override
            protected int on(int min, int max) {
                return on;
            }

            public void gdown() {

            }
        };
        pln.gdown(3, 5, 8);
        plt.Pilot();
        pln.Plane();
    }

    public String bomb(String b) {
        return null;
    }

    public String forsage(String fors) {
        return null;
    }

    public String fuel(String f) {
        return null;
    }

    public String stels(String s) {
        return null;
    }
}
