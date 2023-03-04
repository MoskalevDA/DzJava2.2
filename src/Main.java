public class Main {
    public static void main(String[] args) {

        int balance = 431;
        int replenishment = 9_000;

        if (replenishment > 1000) {
            int bonus = replenishment / 100 * 1;
            int finalBalance = bonus + replenishment + balance;
            System.out.println(finalBalance);
        } else {
            int balanceNoBonus = replenishment + balance;
            System.out.println(balanceNoBonus);
        }


    }
}