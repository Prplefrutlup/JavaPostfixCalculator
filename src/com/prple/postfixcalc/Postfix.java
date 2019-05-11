package com.prple.postfixcalc;

import java.util.Scanner;

enum data {

    data1, data2, data3, data4, data5;
}

public class Postfix {

    public static int evaluatePostfix(String postfix) {

        LinkedStack calculatorStack = new LinkedStack<Integer>();

        Scanner sc = new Scanner(postfix);

        //scans the characters in the expression one by one
        while (sc.hasNext()) {

            //if statement to check if character is an operand or number,
            //if a number - pushed to stack
            if (sc.hasNextInt()) {
                calculatorStack.push(sc.nextInt());
            }

                //if characters scanned are operators,
                // pop 2 elements and apply operator
            else {


                int operandOne = calculatorStack.pop();
                int operandTwo = calculatorStack.pop();

                String operands = sc.next();

                switch (operands) {

                    case "-":
                        calculatorStack.push(operandTwo - operandOne);
                        break;

                    case "+":
                        calculatorStack.push(operandTwo + operandOne);
                        break;

                    case "*":
                        calculatorStack.push(operandTwo * operandOne);
                        break;

                    case "/":
                        calculatorStack.push(operandTwo / operandOne);
                        break;
                }
            }
        }

        return calculatorStack.peek();

    }


    public static void main(String[] args) {

        int data1 = 1;
        int data2 = 2;
        int data3 = 4;
        int data4 = 5;
        int data5 = 3;

        String postfix1 = data1 + " " + data2 + "+" + data3 + "*" + data4 + "-";

        System.out.println(postfix1);

        //String postfix2 = "data1 data2 * data3 * data1 -/ data4 data5 +";

        System.out.println(evaluatePostfix(postfix1));

        //System.out.println(evaluatePostfix(postfix2));


    }

}
