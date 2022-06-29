package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j<=5; j++) {
                int product = i*j;
                if (j == 5){
                    sb.append(String.format("%3d |\n",product));
                } else {
                    sb.append(String.format("%3d |",product));
                }
            }
        }
        return sb.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j<=10; j++) {
                int product = i*j;
                if (j == 10){
                    sb.append(String.format("%3d |\n",product));
                } else {
                    sb.append(String.format("%3d |",product));
                }
            }
        }
        return sb.toString();
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {

            for (int j = 1; j<=tableSize; j++) {
                int product = i*j;
                if (j == tableSize){
                    sb.append(String.format("%3d |\n",product));
                } else {
                    sb.append(String.format("%3d |",product));
                }
            }
        }
        return sb.toString();
    }
}
