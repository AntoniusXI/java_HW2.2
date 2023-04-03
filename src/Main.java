public class Main {
    public static void main(String[] args) {

        int initialAmount = 0;
        int topupAmount = 1001;
        int bonusAmount = 0;
        int totalAmount = 0;

        if (topupAmount > 1000) {
            bonusAmount = topupAmount / 100;
            totalAmount = initialAmount + topupAmount + bonusAmount;
        }
        System.out.println("Итоговая сумма на счету клиента: " + totalAmount);
        System.out.println("Количество бонусных рублей: " + bonusAmount);

    }
}