package Complex;


public class Main {

    public static void main(String[] args) {
        // Создание фабрики калькуляторов комплексных чисел.
        IComplexCalcFactory calculableFactory = new DecLogComplexCalcFactory(new Logger());

        // Создание интерфейса взаимодействия с пользователем.
        ViewComplexCalc view = new ViewComplexCalc(calculableFactory);

        // Запуск приложения.
        view.run();
    }
}