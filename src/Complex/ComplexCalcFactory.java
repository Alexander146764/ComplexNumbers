package Complex;

public class ComplexCalcFactory implements IComplexCalcFactory {

    @Override
    public iComplexCalc create(double argRe, double argIm) {
        return new ComplexCalc(argRe, argIm);
    }
}
