public class konsru {
String name;
String dolj;
int zp;

    public konsru(String name, String dolj, int zp) {
        this.name = name;
        this.dolj = dolj;
        this.zp = zp;
    }
    String infa(int i){
return "Имя:" + name + "\n Должность: " + dolj + "\n Зарплата за " + i + " месяцев - " + zp*i;
    }
}
