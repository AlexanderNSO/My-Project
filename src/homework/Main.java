package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (!"q".equals(userInput)) {
            try {

                System.out.println("Введите число 1");
                int firstNumber = scanner.nextInt();
                System.out.println("Введите число 2");
                int secondNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Введите операцию из списка: +, -, *, /, ! - факториал. q - выход");
                userInput = scanner.nextLine();

                result(userInput, firstNumber, secondNumber);

            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
                scanner.nextLine();
            } catch (ArithmeticException e2) {
                System.out.println("Делить на ноль нельзя");
            }
        }
    }


    private static int plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private static int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    private static int ymn(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    private static int del(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    private static int factorial(int numberOne) {
        int res = 1;
        for (int i = 1; i < numberOne; i++) {
            res *= 1;
        }
        return res;
    }

    private static void result(String userInput, int firstNumber, int secondNumber) {
        double result = 0;
        if (userInput.equals("+") || userInput.equals("-") || userInput.equals("/") || userInput.equals("*") || userInput.equals("!")) {
            switch (userInput) {

                case "+":
                    result = plus(firstNumber, secondNumber);
                    break;
                case "-":
                    result = minus(firstNumber, secondNumber);
                    break;
                case "*":
                    result = ymn(firstNumber, secondNumber);
                    break;
                case "/":
                    result = del(firstNumber, secondNumber);
                    break;
                case "!":
                    result = factorial(firstNumber);
                    break;
                default:
                    break;
            }
            System.out.println(result);
        } else {
            System.out.println("Введите корректную операцию");
        }
    }
}
