package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(8, 4, "Acer", Computer.OperatingSystem.Windows);
        System.out.println(computer);

        Computer computer1 = Computer.builder()
                .ram(16)
                .cores(4)
                .name("Kali Linux")
                .operatingSystem(Computer.OperatingSystem.Linux)
                .number()
                .build();
        System.out.println(computer1);

        int[] arr = new int[10];
        Random intRandomizer = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = intRandomizer.nextInt(2);
            sum = sum + arr[i];
        }

        int result = 0;
        if (arr.length > 0) {
            result = sum / arr.length;
        }
        System.out.println("\n"+ Arrays.toString(arr));
        System.out.println(result);
        System.out.println(Arrays.toString(deleteElement(arr, 1)));

        System.out.println("\n Дані щодо першого комп'ютеру -" + computer);
        System.out.println("Швидкий?\t" + computer.isFast());
        System.out.println("Бісячий Шиндовс?\t" + computer.updatesWindowsDefenderEveryFiveMins());
        System.out.println("Для тру хацкерів?\t" + computer.isForHackermans());

        System.out.println("\n Дані щодо першого комп'ютеру -" + computer1);
        System.out.println("Швидкий?\t" + computer1.isFast());
        System.out.println("Бісячий Шиндовс?\t" + computer1.updatesWindowsDefenderEveryFiveMins());
        System.out.println("Для тру хацкерів?\t" + computer1.isForHackermans());
    }

    public static int[] deleteElement(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        int[] result = new int[arr.length - count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }


}