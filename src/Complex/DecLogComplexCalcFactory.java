package Complex;

public class DecLogComplexCalcFactory implements IComplexCalcFactory {
    private iLoggable logger;

    public DecLogComplexCalcFactory(iLoggable logger) {
        this.logger = logger;
    }

    public iComplexCalc create(double primaryArgRe, double primaryArgIm) {
        return new DecLogComplexCalc(new ComplexCalc(primaryArgRe, primaryArgIm), logger);
    }
}
