package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Polynomial {

    public static int calc(String exp) {
        exp = exp.trim();
        if ( !exp.contains(" ") ) return Integer.parseInt(exp);

        exp = exp.replaceAll("- ", "+ -");
        boolean needToMulti = exp.contains(" * ");
        boolean needToPlus = exp.contains(" + ");
        boolean haveBracket = exp.contains("(")||exp.contains(")");
        boolean needToCompound = needToMulti && needToPlus;

        if( haveBracket ){
            if(!needToPlus&&!needToMulti){
                exp = exp.replaceAll("\\(","");
                exp = exp.replaceAll("\\)","");
            }
            String First_exp = exp.split("\\)",2)[0];
            String Second_exp = exp.split("\\)",2)[1];
            First_exp = First_exp.replaceAll("\\(","");
            Second_exp = Second_exp.replaceAll("\\)","");

            String sub_exp = calc(First_exp) + " " + Second_exp.trim();
            return calc(sub_exp);
        }
        if ( needToCompound ) {
            String[] bits = exp.split(" \\+ ");

            String newExp = Arrays.stream(bits)
                    .mapToInt(Polynomial::calc)
                    .mapToObj(e -> e + "")
                    .collect(Collectors.joining(" + "));

            return calc(newExp);
        }
        else if ( needToPlus ) {
            String[] bits = exp.split(" \\+ ");

            int sum = 0;

            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }

            return sum;
        }
        else if ( needToMulti ) {
            String[] bits = exp.split(" \\* ");

            int sum = 1;

            for (int i = 0; i < bits.length; i++) {
                sum *= Integer.parseInt(bits[i]);
            }

            return sum;
        }

        return -1;
    }
}
