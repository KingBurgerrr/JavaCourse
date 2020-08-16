public enum Month {
    JANUARY(31, "JANUARY"), FEBRUARY(28, "FEBRUARY"), MARCH(30, "MARCH"), APRIL(31, "APRIL"), MAY(30, "MAY"), JUNE(31, "JUNE"), JULY(30, "JULY"), AUGST(31, "AUGUST"), SEPTEMBER(30, "SEPTEMBER"), OCTOBER(31, "OCTOBER"), NOVEMBER(30, "NOVEMBER"), DECEMBER(31, "DECEMBER");
    private int day;
    private String name;

    public void setDay(int day) {
        this.day = day;
    }

    public void setName(String name) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public String getName() {
        return name;
    }
    public static Month[] get28() {
        return new Month[]{FEBRUARY};
    }
    public static Month[] get30() {
        return new Month[]{MARCH, MAY, JULY, SEPTEMBER, NOVEMBER};
    }
    public static Month[] get31() {
        return new Month[]{JANUARY, APRIL, JUNE, AUGST, OCTOBER, DECEMBER};
    }
    public static Month[] getWinterMonths() {
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSpringMonths() {
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMoths() {
        return new Month[]{JUNE, JULY, AUGST};
    }
    public static Month[] getFallMonths() {
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }

    Month(int day, String name) {
        this.day = day;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Month{" +
                "day=" + day +
                ", name='" + name + '\'' +
                '}';
    }
}
