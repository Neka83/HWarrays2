//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("// Task 1");

        int[] expenses = {12000, 15000, 11000, 13000, 14000};

        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");

        System.out.println("// Task 2");

        int[] monthlyExpenses = {12000, 15000, 11000, 13000, 14000};

        int min = monthlyExpenses[0];
        int max = monthlyExpenses[0];

        for (int expense : monthlyExpenses) {
            if (expense < min) {
                min = expense;
            }
            if (expense > max) {
                max = expense;
            }
        }
        System.out.println("Минимальная сумма за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма за неделю составила " + max + " рублей");

        System.out.println("// Task 3");

        int[] expensesForMonth = {12000, 15000, 11000, 13000, 14000};

        int totalSum = 0;
        for (int expense : expensesForMonth) {
            totalSum += expense;
        }

        double average = (double) totalSum / expenses.length;

        System.out.println("Средняя сумма за месяц составила " + average + " рублей.");

        System.out.println("// Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int length = reverseFullName.length;

        for (int letter = 0; letter < length / 2; letter ++) {
            char temp = reverseFullName[letter];
            reverseFullName[letter] = reverseFullName[length - 1 - letter];
            reverseFullName[length - 1 - letter] = temp;

        }

        System.out.print(reverseFullName);

}

}
