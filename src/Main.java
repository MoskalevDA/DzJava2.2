public class Main {
    public static void main(String[] args) {

        int balance = 431;
        int replenishment = 9_000;

        if (replenishment > 1000) {
            int bonus = replenishment / 100 * 1;
            int finalBalance = bonus + replenishment + balance;
            System.out.println("Итоговый счет:" + finalBalance);
            System.out.println( "Бонус:" + bonus);
        } else {
            int balanceNoBonus = replenishment + balance;
            System.out.println("Итоговый счет" + balanceNoBonus);
        }


    }
}