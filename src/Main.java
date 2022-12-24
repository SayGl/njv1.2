public class Main {
    public static void main(String[] args) {
        opana vasya = new opana();
        vasya.imya = "Вася";
        vasya.vozrast = 15;
        vasya.ves = 50;
        opana lera = new opana();
        lera.imya = "Лера";
        lera.ves = 45;
        lera.vozrast = 14;
        opana masha = new opana();
        masha.imya = "Маша";
        masha.ves = 40;
        masha.vozrast = 12;
        vasya.showtry();
        lera.showtry();
        masha.showtry();
        double rost1 = vasya.try1();
        double rost2 = lera.try1();
        double rost3 = masha.try1();
        System.out.println((vasya.vozrast + lera.vozrast + masha.vozrast) / 3);
        System.out.println(rost1);
        System.out.println(rost2);
        System.out.println(rost3);
    }

}