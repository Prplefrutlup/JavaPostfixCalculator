package com.prple.postfixcalc;

import java.util.Scanner;

public class Postfix {

    public static int evaluatePostfix(String postfix) {

        //initialize stack to use for postfix expression
        LinkedStack calculatorStack = new LinkedStack<Integer>();

        //scanner to read the postfix expression
        Scanner sc = new Scanner(postfix);

        /**scans the characters in the expression one by one
         * if string is scanned , push the integer to the stack
         * if an operand is scanned, pop two ints and use operand to evaluate,
         * then push result back to stack
         */
        while (sc.hasNext()) {

                String operands = sc.next();

                switch (operands) {

                    case "data1":
                        int data1 = 1;
                        calculatorStack.push(data1);
                        break;

                    case "data2":
                        int data2 = 2;
                        calculatorStack.push(data2);
                        break;

                    case "data3":
                        int data3 = 4;
                        calculatorStack.push(data3);
                        break;

                    case "data4":
                        int data4 = 5;
                        calculatorStack.push(data4);
                        break;

                    case "data5":
                        int data5 = 3;
                        calculatorStack.push(data5);
                        break;

                    case "-":
                        int operandTwo = calculatorStack.pop();
                        int operandOne = calculatorStack.pop();
                        int result = operandOne - operandTwo;
                        calculatorStack.push(result);
                        break;

                    case "+":
                        operandTwo = calculatorStack.pop();
                        operandOne = calculatorStack.pop();
                        result = operandOne + operandTwo;
                        calculatorStack.push(result);
                        break;

                    case "*":
                        operandTwo = calculatorStack.pop();
                        operandOne = calculatorStack.pop();
                        result = operandOne * operandTwo;
                        calculatorStack.push(result);
                        break;

                    case "/":
                        operandTwo = calculatorStack.pop();
                        operandOne = calculatorStack.pop();
                        result = operandOne / operandTwo;
                        calculatorStack.push(result);
                        break;
                }
            }
        return calculatorStack.peek();
    }

    public static void main(String[] args) {
        //test postfix strings
        String postfix1 = "data1 data2 + data3 * data4 -";

        String postfix2 = "data1 data2 * data3 * data1 -/ data4 data5 +";

        //evaluatePostfix function call
        System.out.println("The postfix expression, " + postfix1 + " \n" +
                "evaluates to " + evaluatePostfix(postfix1));

        System.out.println("The postfix expression, " + postfix2 + "\n" +
                "evaluates to " + evaluatePostfix(postfix2));
    }

}
