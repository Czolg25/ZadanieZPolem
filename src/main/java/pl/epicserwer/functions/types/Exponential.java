package pl.epicserwer.functions.types;

import pl.epicserwer.util.Utils;

public class Exponential implements Function{
    private static final Utils UTILS = new Utils();
    private static final String PATTERN = "y=ab^x";

    private double a = 0;
    private double b = 0;

    @Override
    public double getY(final double x){
        return a*Math.pow(b,x);
    }

    @Override
    public void init(){
        System.out.println(PATTERN);
        a= UTILS.getNumber("a");
        b= UTILS.getNumber("b");
        System.out.println("y="+a+"*"+b+"^x");
    }

    @Override
    public String getPattern() {
        return PATTERN;
    }
}
