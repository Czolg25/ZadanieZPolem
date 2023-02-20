package pl.epicserwer.functions;

import pl.epicserwer.functions.types.Exponential;
import pl.epicserwer.functions.types.Linear;
import pl.epicserwer.functions.types.Quadratic;
import pl.epicserwer.functions.types.Sinus;

import java.util.Arrays;
import java.util.List;

public enum Function {
    NONE,
    LINEAR(new Linear(),1),
    QUADRATIC(new Quadratic(),2),
    SINUS(new Sinus(),3),
    EXPONENTIAL(new Exponential(),4);

    private final pl.epicserwer.functions.types.Function function;
    private final int id;

    Function(pl.epicserwer.functions.types.Function function,int id){
        this.function = function;
        this.id = id;
    }

    Function(){
        this.function = null;
        this.id = 0;
    }

    public double getY(double x){
        assert this.function != null;
        return this.function.getY(x);
    }

    public int getId() {
        return id;
    }

    public String getName(){
        assert this.function != null;
        return this.function.getPattern();
    }

    public void init(){
        assert this.function != null;
        this.function.init();
    }

    public static List<Function> getFunctionTypes(){
        return Arrays.asList(LINEAR,QUADRATIC,SINUS,EXPONENTIAL);
    }

    public static Function getType(int typeNumber){
        for (Function functionType : getFunctionTypes()) {
            if(functionType.id == typeNumber) return functionType;
        }

        return NONE;
    }
}
