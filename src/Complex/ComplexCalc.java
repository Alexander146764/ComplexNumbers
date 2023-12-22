package Complex;


public final class ComplexCalc implements iComplexCalc {

    private double primaryArgRe;
    private double primaryArgIm;


    public ComplexCalc(double primaryArgRe, double primaryArgIm) {

        this.primaryArgRe = primaryArgRe;
        this.primaryArgIm = primaryArgIm;
    }

    @Override
    public iComplexCalc sum(double argRe, double argIm) {
        primaryArgRe += argRe;
        primaryArgIm += argIm;
        return this;
    }

    @Override
    public iComplexCalc multi(double argRe, double argIm) {
        primaryArgRe = primaryArgRe * argRe - primaryArgIm * argIm;
        primaryArgIm = primaryArgIm * argRe + primaryArgRe * argIm;
        return this;
    }

    @Override
    public iComplexCalc divide(double argRe, double argIm) {
        primaryArgRe = (primaryArgRe * argRe + primaryArgIm * argIm) / (primaryArgIm * primaryArgIm + argIm * argIm);
        primaryArgIm = (primaryArgIm * argRe - primaryArgRe * argIm) / (primaryArgIm * primaryArgIm + argIm * argIm);
        return this;
    }

    @Override
    public String getResult() {
        String operator = primaryArgIm >= 0 ? "+" : "";
        return primaryArgRe + operator + primaryArgIm + "*i";
    }

    @Override
    public double getRe() {
        return primaryArgRe;
    }
    
    @Override
    public double getIm() {
        return primaryArgIm;
    }
}
