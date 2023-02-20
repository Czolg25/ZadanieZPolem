package pl.epicserwer.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public double getNumber(String letter){
        System.out.println("Podaj "+letter+". Wpisz liczbe.");
        Scanner scanner = new Scanner(System.in);

        try {
            return scanner.nextDouble();
        }catch (ArithmeticException| InputMismatchException exception){
            return getNumber(letter);
        }
    }
}
