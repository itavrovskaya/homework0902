package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
}
    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            }
        //1
        int sum = 0;
        for (int i:arr) {
            sum += i;
            System.out.print("Сумма трат за месяц составила " + sum + " рублей.");
        }

        System.out.println();
        //2
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();

        //3
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей.");
        System.out.println();
        //4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        return arr;
        }
    }
