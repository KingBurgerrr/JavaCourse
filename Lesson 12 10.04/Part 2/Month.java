package com.logos.lesson12.part2;

import java.util.*;

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
    List<Enum> Monthes = new List<Enum>() {
        public int size() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean contains(Object o) {
            return false;
        }

        public Iterator<Enum> iterator() {
            return null;
        }

        public Object[] toArray() {
            return new Object[0];
        }

        public <T> T[] toArray(T[] a) {
            return null;
        }

        public boolean add(Enum anEnum) {
            return false;
        }

        public boolean remove(Object o) {
            return false;
        }

        public boolean containsAll(Collection<?> c) {
            return false;
        }

        public boolean addAll(Collection<? extends Enum> c) {
            return false;
        }

        public boolean addAll(int index, Collection<? extends Enum> c) {
            return false;
        }

        public boolean removeAll(Collection<?> c) {
            return false;
        }

        public boolean retainAll(Collection<?> c) {
            return false;
        }

        public void clear() {

        }

        public Enum get(int index) {
            return null;
        }

        public Enum set(int index, Enum element) {
            return null;
        }

        public void add(int index, Enum element) {
            Monthes.add(0, JANUARY);
            Monthes.add(1, FEBRUARY);
            Monthes.add(2, MARCH);
            Monthes.add(3, APRIL);
            Monthes.add(4, MAY);
            Monthes.add(5, JUNE);
            Monthes.add(6, JULY);
            Monthes.add(7, AUGST);
            Monthes.add(8, SEPTEMBER);
            Monthes.add(9, OCTOBER);
            Monthes.add(10, NOVEMBER);
            Monthes.add(11, DECEMBER);
        }

        public Enum remove(int index) {
            return null;
        }

        public int indexOf(Object o) {
            return 0;
        }

        public int lastIndexOf(Object o) {
            return 11;
        }

        public ListIterator<Enum> listIterator() {
            return null;
        }

        public ListIterator<Enum> listIterator(int index) {
            return null;
        }

        public List<Enum> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

//    public ArrayList<Enum> getMonthes() {
//        return Monthes;
//    }
}
