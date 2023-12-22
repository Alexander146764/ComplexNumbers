package Complex;


public interface iComplexCalc {

    iComplexCalc sum(double argRe, double argIm);

    iComplexCalc multi(double argRe, double argIm);

    iComplexCalc divide(double argRe, double argIm);

    String getResult();

    double getRe();

    double getIm();

}
