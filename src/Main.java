public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        byte[] paymentsA = new byte[] {31, 49, 23, 10, 88};
        int amountOfPayments = 0;
        for (int i = 0; i < paymentsA.length; i++) {
            amountOfPayments = amountOfPayments + paymentsA[i];
        }
        System.out.println("Сумма трат за месяц составила " + amountOfPayments + " рублей");

        //Задача №2
        System.out.println("Задача №2");
        byte[] paymentsB = new byte[] {45, 70, 69, 18, 99};
        byte minimumCost = paymentsB[0];
        byte maximumCost = paymentsB[0];
        for (int i = 1; i < paymentsB.length; i++) {
            if (minimumCost > paymentsB[i]){
                minimumCost = paymentsB[i];
            }
            if (maximumCost < paymentsB[i]) {
                maximumCost = paymentsB[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minimumCost + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maximumCost + " рублей");

        //Задача №3
        System.out.println("Задача №3");
        byte[] paymentsC = new byte[] {13, 11, 59, 30, 81};
        float averageAmount = 0F;
        for (int i = 0; i < paymentsC.length; i++) {
            averageAmount = averageAmount + paymentsC[i];
        }
        averageAmount = averageAmount / paymentsC.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        //Задача №4
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char sort;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            sort = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - (i + 1)];
            reverseFullName[reverseFullName.length - (i + 1)] = sort;
        }
        System.out.println(reverseFullName);
    }
}