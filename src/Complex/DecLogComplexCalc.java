package Complex;

public class DecLogComplexCalc implements iComplexCalc {
    private iComplexCalc decorated;
    private iLoggable logger;

    public DecLogComplexCalc(iComplexCalc decorated, iLoggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public iComplexCalc sum(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода sum"));
        logger.log(String.format("Вещественная часть первого значения калькулятора: %f", firstAgrRe));
        logger.log(String.format("Мнимая часть первого значения калькулятора: %f", firstAgrIm));
        iComplexCalc result = decorated.sum(argRe, argIm);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public iComplexCalc multi(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода multi"));
        logger.log(String.format("Вещественная часть первого значения калькулятора: %f", firstAgrRe));
        logger.log(String.format("Мнимая часть первого значения калькулятора: %f", firstAgrIm));
        iComplexCalc result = decorated.multi(argRe, argIm);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }


    @Override
    public iComplexCalc divide(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода divide"));
        logger.log(String.format("Вещественная часть первого значения калькулятора: %f", firstAgrRe));
        logger.log(String.format("Мнимая часть первого значения калькулятора: %f", firstAgrIm));
        iComplexCalc result = decorated.divide(argRe, argIm);
        logger.log(String.format("Вызов метода divide произошел"));
        return result;
    }

    @Override
    public String getResult() {
        String result = decorated.getResult();
        logger.log(String.format("Получение результата: %s", result));
        return result;
    }

    @Override
    public double getRe() {
        double result = decorated.getRe();
        logger.log(String.format("Получение вещественной части результата: %f", result));
        return result;
    }

    @Override
    public double getIm() {
        double result = decorated.getIm();
        logger.log(String.format("Получение мнимой части результата: %f", result));
        return result;
    }
}
