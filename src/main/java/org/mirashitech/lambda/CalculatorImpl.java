package org.mirashitech.lambda;

public abstract class CalculatorImpl {

    public static PrintNumber LambdaCallWithParameter(){
        PrintNumber printno = (input) -> System.out.println(input);
        return printno;
    }

    public static void LambdaCall(){
        Calculator calculator = () -> {
            System.out.println("Switch is On");
        };
        calculator.switchon();
    }

    public static AddNos AddNos(){
        AddNos addNos = (a, b) -> a + b;//Integer::sum;
        return addNos;
    }
}
