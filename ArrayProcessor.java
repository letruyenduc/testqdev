package table;

import java.lang.reflect.Array;

public class ArrayProcessor {
    private int[] array;

    public ArrayProcessor(int[] array) {
        this.array = array;
    }

    public void sort() {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int currentValue = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }
    }

    public int[] merge(int[] secondArray) {
        int[] mergedArray = new int[array.length + secondArray.length];
        System.arraycopy(array, 0, mergedArray, 0, array.length);

        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[array.length + i] = secondArray[i];
        }
        return mergedArray;
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void removeElement(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Indice hors des limites du tableau.");
        }

        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        this.array = newArray;
    }
}

//Duc
