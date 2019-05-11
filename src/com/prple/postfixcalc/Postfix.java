package com.prple.postfixcalc;

import java.util.Scanner;

public class Postfix {


    public static int evaluatePostfix(String postfix) {

        LinkedStack calculatorStack = new LinkedStack<Integer>();

        Scanner sc = new Scanner(postfix);

        //scans the characters in the expression one by one
        while (sc.hasNext()) {

            //if statement to check if character is an operand or string,
            //if a number - pushed to stack
            if (sc.hasNext()) {

                String stringToInt = sc.next();

                switch (stringToInt) {
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
                }
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


        String postfix1 = "data1 data2 + data3 * data4 -";


        String postfix2 = "data1 data2 * data3 * data1 -/ data4 data5 +";

        System.out.println(evaluatePostfix(postfix1));

        System.out.println(evaluatePostfix(postfix2));



    }

}
