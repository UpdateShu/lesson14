package ru.geekbrains.lessons;

import ru.geekbrains.lessons.server.MyServer;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 4, 2, 3, 4, 1, 7 };
        System.out.println(Arrays.toString(arr));

        int[] arrCopy = getMassAfter4(arr);
        System.out.println(Arrays.toString(arrCopy));

        int[] arr2 = { 1, 1, 4, 1, 4, 4, 1, 4, 1, 4, 4, 1 };
        System.out.println(isArrayFrom1And4(arr2));

        MyServer server = new MyServer();
    }

    public static int[] getMassAfter4(int[] arr)
            throws RuntimeException  {

        if (arr == null || arr.length == 0)
            throw new RuntimeException();

        int lastIndexOf4 = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                lastIndexOf4 = i;
                break;
            }
        }
        if (lastIndexOf4 == -1)
            throw new RuntimeException();
        int[] arrCopy = new int[arr.length - lastIndexOf4 - 1];
        if (lastIndexOf4 < arr.length - 1) {
            System.arraycopy(arr, lastIndexOf4 + 1, arrCopy, 0, arrCopy.length);
        }
        return arrCopy;
    }

    public static boolean isArrayFrom1And4(int[] arr) {
        if (arr == null || arr.length == 0)
            return false;

        boolean find1 = false;
        boolean find4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                find1 = true;
            }
            else if (arr[i] == 4) {
                find4 = true;
            }
            else {
                return false;
            }
        }
        return find1 && find4;
    }
}
