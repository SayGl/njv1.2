public class Peremennie {
    public static void main() {
        final int vr = 60;
        int SECUNDI = 5000;
        int MINUTI = 5000/vr;
        int CHASI = MINUTI/vr;
        int DNI = CHASI/24;
        System.out.println("секунды "+SECUNDI);
        System.out.println("минуты "+MINUTI);
        System.out.println("часы "+CHASI);
        System.out.println("дни "+DNI);
    }

}
