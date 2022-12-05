import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork Lesson 8 Массивы часть 1");
        System.out.println("Part 1");
        int[] arraySimpleNumbers = {1, 2, 3};
        float[] arrayRealNumbers = {-1.57f, 7.654f, 9.986f};
        boolean[] arrayIsWhiteZebraStrips = new boolean[]{true, false, true, false, true, false};

        System.out.println("\nPart 2");
        for (int i = 0; i < arraySimpleNumbers.length; i++) {
            System.out.print(arraySimpleNumbers[i]);
            if (i < arraySimpleNumbers.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayRealNumbers.length; i++) {
            System.out.print(arrayRealNumbers[i]);
            if (i < arrayRealNumbers.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayIsWhiteZebraStrips.length; i++) {
            System.out.print(arrayIsWhiteZebraStrips[i]);
            if (i < arrayIsWhiteZebraStrips.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n\nPart 3");
        for (int i = arraySimpleNumbers.length - 1; i >= 0; i--) {
            System.out.print(arraySimpleNumbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayRealNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayRealNumbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayIsWhiteZebraStrips.length - 1; i >= 0; i--) {
            System.out.print(arrayIsWhiteZebraStrips[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\n\nPart 4");
        for (int i = 0; i < arraySimpleNumbers.length; i++) {
            if (arraySimpleNumbers[i] % 2 != 0) {
                arraySimpleNumbers[i]++;
            }
            System.out.print(arraySimpleNumbers[i]);
            if (i < arraySimpleNumbers.length - 1) {
                System.out.print(", ");
            }
        }

    }
}