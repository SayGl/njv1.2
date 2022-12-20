public class Jumoreska {
    public static void main(String[] args) {
        float a = 2;
        int n = 1;
        while (a!=0) {
            a = a/2;
            System.out.println ("Заходит мужик в бар и говорит: налейте мне "+ a + " кружку пива ");
            n +=1;
        }
        System.out.println ("А бармен отвечает: да вам " +n+ "-м и двух кружек на всех хватит ");
    }
}
