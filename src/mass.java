public class mass {
    public static void main(String[] args) {

        int[] chisla = new int[900];
            for (int k = 0; k < chisla.length; k++) {
            chisla[k]=k+100;
        }

        int[] chisla1 = new int[chisla.length];

        for (int k = 0, j  = chisla.length - 1; k < chisla.length; k++, j--) {
            chisla1[k]=chisla[j];
        }
        for (int k: chisla1){
            System.out.println(k);
        }
    }
}
