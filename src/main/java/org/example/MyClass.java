package org.example;

public class MyClass {

//    public double add(double a, double b) {
//        return a + b;
//    }

    public boolean search(int[] a, int b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return true;
            }
        }

        return false;
    }
}
