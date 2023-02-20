package pl.epicserwer.functions.types;

public interface Function {
    double getY(final double x);
    void init();
    String getPattern();
}
