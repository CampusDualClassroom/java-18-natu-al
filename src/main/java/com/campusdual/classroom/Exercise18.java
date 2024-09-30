package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.Arrays;

public class Exercise18 {

    public static void main(String[] args) {
        int n = Utils.integer("Introduce el tamaño del Array (número entero): ");
        int[] a = createAndInitializeArray(n);
        showInlineArray(a);
    }

    public static int[] createAndInitializeArray(int num) {
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void showInlineArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //     System.out.print(Arrays.toString(a) + " ");
    }
}


