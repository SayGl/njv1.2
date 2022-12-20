public class SirLukIliKotleta {
    public static void main() {
        System.out.println("соболев придумывает песню про свой бургер!");
        int money = 100;
        boolean burger1 = money <= 100;
        boolean burger2 = money > 100 && money < 200;
        if (burger1) {
            System.out.println("сыр");
        }
        if (burger2) {
            System.out.println("лук");
        }
        if (!burger1 && !burger2) {
            System.out.println("котлета");

        }
    }
}
