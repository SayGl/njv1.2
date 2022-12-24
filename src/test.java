public class test {
    double dlina;
    double shirina;
    double visota;
    int square(int i){
        return i*i;
    }
    void set(double dlina, double shirina, double visota){
        this.dlina = dlina;
        this.shirina = shirina;
        this.visota = visota;
    }
    double volume(){
        return dlina*shirina*visota;
    }
}
