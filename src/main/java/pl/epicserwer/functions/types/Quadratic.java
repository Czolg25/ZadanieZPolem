package pl.epicserwer.functions.types;

import pl.epicserwer.util.Utils;

public class Quadratic implements Function{
    private static final Utils UTILS = new Utils();
    private static final String PATTERN = "y=ax^2+bx+c";

    private double a = 0;
    private double b = 0;
    private double c = 0;

    @Override
    public double getY(final double x){
        return a*Math.pow(x,2)+b*x+c;
    }

    @Override
    public void init(){
        System.out.println(PATTERN);
        a= UTILS.getNumber("a");
        b= UTILS.getNumber("b");
        c= UTILS.getNumber("c");
        System.out.println("y="+a+"*x^2+"+b+"*x+"+c);
    }

    @Override
    public String getPattern() {
        return PATTERN;
    }
}
