package pl.epicserwer.functions.types;

import pl.epicserwer.util.Utils;

public class Sinus implements Function{
    private static final Utils UTILS = new Utils();
    private static final String PATTERN = "y=a sin(bx)";

    private double a = 0;
    private double b = 0;

    @Override
    public double getY(final double x){
        return a*Math.sin(b*x);
    }

    @Override
    public void init(){
        System.out.println(PATTERN);
        a= UTILS.getNumber("a");
        b= UTILS.getNumber("b");
        System.out.println("y="+a+"*sin("+b+"*x)");
    }

    @Override
    public String getPattern() {
        return PATTERN;
    }
}
