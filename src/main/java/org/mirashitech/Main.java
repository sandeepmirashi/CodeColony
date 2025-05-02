package org.mirashitech;

import org.mirashitech.stream.TaxService;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        PrintNumber printNumber = CalculatorImpl.LambdaCallWithParameter();
//        printNumber.printingNo(1212);
//
//        AddNos a = CalculatorImpl.AddNos();
//        System.out.println(a.add(1, 3));

        //Comparator a functional interface
//        BookService bookService = new BookService();
//        System.out.println(bookService.getBooksinSorted());

       //Consumer Example :
//       Consumer<Integer> consumer = (t) -> {
//            t = t+10; //processing something
//           System.out.println("Printing : " + t);
//       };
//       consumer.accept(10);
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        //list1.stream().forEach(consumer);
//
//        list1.stream().forEach(t-> {
//            t = t+ 1;
//            System.out.println("processing and printing : " + t);
//        });
        TaxService ts = new TaxService();
        System.out.println(ts.evaluateTaxableEmps("taxable"));

    }
}