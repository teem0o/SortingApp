package com.elearn;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        try {
            for (i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("this is an illegal argument: "+args[i], ex);
        }
        Sorting s = new Sorting();
        s.sort(array);
        for (int el : array) {
            System.out.println(el);
        }
    }
}
