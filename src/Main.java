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

        System.out.println((vasya.vozrast + lera.vozrast + masha.vozrast) / 3);

    }

}