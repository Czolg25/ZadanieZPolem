package pl.epicserwer.functions.types;

import pl.epicserwer.util.Utils;

public class Linear implements Function{
    private static final Utils UTILS = new Utils();
    private static final String PATTERN = "y=ax+b";

    private double a = 0;
    private double b = 0;

    @Override
    public double getY(final double x){
        return a*x+b;
    }

    @Override
    public void init(){
        System.out.println(PATTERN);
        a= UTILS.getNumber("a");
        b= UTILS.getNumber("b");
        System.out.println("y="+a+"*x+"+b);
    }

    @Override
    public String getPattern() {
        return PATTERN;
    }
}
