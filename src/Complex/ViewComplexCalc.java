package Complex;

import java.util.Scanner;


public class ViewComplexCalc {
    private IComplexCalcFactory calculableFactory;


    public ViewComplexCalc(IComplexCalcFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }


    public void run() {
        while (true) {

            double firstArgRe = promptRead("Введите вещественную часть первого аргумента: ");
            double firstArgIm = promptRead("Введите мнимую часть первого аргумента: ");

            // Создание калькулятора.
            iComplexCalc calculator = calculableFactory.create(firstArgRe, firstArgIm);

            while (true) {
                // Чтение команды от пользователя.
                String cmd = prompt("Введите команду (*, +, /, =) : ");

                // Обработка команды.
                if (cmd.equals("*")) {
                    // Умножение на введенные вещественную и мнимую части.
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.multi(argRe, argIm);
                    continue;
                }
                if (cmd.equals("/")) {
                    // Деление на введенные вещественную и мнимую части.
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.divide(argRe, argIm);
                    continue;
                }
                if (cmd.equals("+")) {
                    // Сложение с введенными вещественной и мнимой частями.
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.sum(argRe, argIm);
                    continue;
                }
                if (cmd.equals("=")) {
                    // Вывод результата.
                    String result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }

            // Запрос на продолжение вычислений.
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }


    private double promptRead(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
