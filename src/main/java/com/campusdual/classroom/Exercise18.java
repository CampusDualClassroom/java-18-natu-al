package com.campusdual.classroom;

import com.campusdual.util.Utils;

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
            if(i != a.length -1)
            System.out.print(a[i]  + " ");
            else
                System.out.print(a[i]);
        }
    }
}


