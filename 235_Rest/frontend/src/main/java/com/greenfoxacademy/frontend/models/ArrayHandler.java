package com.greenfoxacademy.frontend.models;

public class ArrayHandler {

    private String what;
    private int[] numbers;

    public ArrayHandler() {
    }

    public ArrayHandler(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int multiply() {
        int multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            multiply *= numbers[i];
        }
        return multiply;
    }

    public int[] doubleArray() {
        int[] doubledArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubledArray[i] = numbers[i] * 2;
        }
        return doubledArray;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
