package com.prple.postfixcalc;


import java.util.Scanner;

public class Main {

    public static Object evaluatePostfix(String postfix) {

        LinkedStack calculatorStack = new LinkedStack<Integer>();

        Scanner sc = new Scanner(postfix);

        while (sc.hasNext()) {
            int result;

            char nextCharacter = ' ';
            switch (nextCharacter) {

                case //variable:
                        calculatorStack.push();
                    ;
                    break;

                case '-':
                    int operandOne = calculatorStack.pop();
                    int operandTwo = calculatorStack.pop();
                    result = operandOne - operandTwo;
                    calculatorStack.push(result);
                    break;

                case '+':
                    operandOne = calculatorStack.pop();
                    operandTwo = calculatorStack.pop();
                    result = operandOne + operandTwo;
                    calculatorStack.push(result);
                    break;

                case '*':
                    operandOne = calculatorStack.pop();
                    operandTwo = calculatorStack.pop();
                    result = operandOne * operandTwo;
                    calculatorStack.push(result);
                    break;

                case '/':
                    operandOne = calculatorStack.pop();
                    operandTwo = calculatorStack.pop();
                    result = operandOne / operandTwo;
                    calculatorStack.push(result);
                    break;

                default:
                    break;
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




    }

}
