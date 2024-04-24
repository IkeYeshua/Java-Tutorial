package org.example;

import javax.swing.plaf.basic.BasicComboBoxUI;

public class Main {
    public static void main(String[] args) {
        //Constants
        final float PI = 3.14F;
        System.out.println(PI);

        //Arithmetic expressions
        //additions
        int result = 10 + 3;
        System.out.println(result);

        //divisions
        int divisionResult = 10 / 3;
        System.out.println(divisionResult);

        //multiplication
        int multiplicationResult = 10 * 3;
        System.out.println(multiplicationResult);

        //expressions
        int theResult = (10 + 3) * 2 / 2;
        System.out.println(theResult);

        //Casting
        double showResult = (double) 10 / (double) 3;
        System.out.println(showResult);

        //Postfix increment operators
        int x = 1;
        int y = x++;
        System.out.println(x + "," + y);

        //Prefix increment operator;

        int z = 1;
        int a = ++z;
        System.out.println(z + "," + a);

        //implicit casting: automatic casting
        // or converting values of small data types to a big data types
        short b = 6;
        int c = b + 2;
        System.out.println(c);

        //explicit casting: manual casting or conversion of values of
        // bigger data types to smaller data types.
        double d = 3;
        int e = (int)d + 5;
        System.out.println(e);

        //Explicit when not compatible...
        String f = "1";
        int g = Integer.parseInt(f) + 3;
        System.out.println(g);

        String h = "1.1";
        double i = Double.parseDouble(h) + 2;
        System.out.println(i);

      //Math Class/library for performing mathematical operations
      int j =   Math.round(1.1F);
        System.out.println(j);





    }
}