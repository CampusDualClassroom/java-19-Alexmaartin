package com.campusdual.classroom;

public class Exercise19 {

    private static String getTridimensionalString(int[][][] intArrayTri, int[][] flatMatrix) {

        int rows = intArrayTri[0].length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(stringFlatMatrixRow(flatMatrix, i));
            sb.append("   →   ");
            sb.append(stringTriMatrixRow(intArrayTri, i));
            sb.append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();

    }

    private static String stringTriMatrixRow(int[][][] intArrayTri, int row) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArrayTri.length-1; i++){
            sb.append(getUnidimensionalString(intArrayTri[i][row]));
            sb.append("   ");
        }
        sb.append(getUnidimensionalString(intArrayTri[intArrayTri.length-1][row]));

        return sb.toString();
    }

    private static String stringFlatMatrixRow(int[][] flatMatrix, int row) {
        return getUnidimensionalString(flatMatrix[row]);
    }

    public static String getTridimensionalString(int[][][] intArrayTri) {
        int[][] flatMatrix = flatTridimensionalArray(intArrayTri);
        return getTridimensionalString(intArrayTri, flatMatrix);
    }

    //TODO
    public static int[][] flatTridimensionalArray(int[][][] intArrayTri) {
        int depth = intArrayTri.length;
        int rows = intArrayTri[0].length;
        int columns = intArrayTri[0][0].length;

        int[][] bidimensionalArray= new int [rows][columns];
        for (int j = 0; j < rows; j++) {
            for (int k = 0; k < columns; k++) {
                for (int i = 0; i < depth; i++) {
                    bidimensionalArray[j][k] += intArrayTri[i][j][k];
                }
            }
        }
        return bidimensionalArray;
    }


    // TODO
    public static String getBidimensionalString(int[][] intArrayBi) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < intArrayBi.length; i++) {
            sb2.append(stringFlatMatrixRow(intArrayBi, i));
            if (i < intArrayBi.length - 1) {
                sb2.append("\n");
            }
        }
            return sb2.toString();
    }


        // TODO
        public static String getUnidimensionalString ( int[] uniArray){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < uniArray.length; i++) {
                sb.append(uniArray[i]);
                if (i < uniArray.length - 1) {
                    sb.append(" ");
                }
            }
            return sb.toString();
        }


    // TODO
    public static int[] createAndPopulateUnidimensionalArray(int columns) {
        int[] unidimensionalArray = new int[columns];
        for (int i = 0; i < columns; i++) {
            unidimensionalArray[i] = i + 1;
        }
        return unidimensionalArray;
    }
    // TODO
    public static int[][] createAndPopulateBidimensionalArray(int rows, int columns) {
        int[][] bidimensionalArray = new int[rows][columns];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                bidimensionalArray[i][j]= value++;
            }
        }
        return bidimensionalArray;
    }
    // TODO
    public static int[][][] createAndPopulateTridimensionalArray(int depth, int rows, int columns) {
        int[][][] tridimensionalArray = new int[depth][rows][columns];
        int value = 1;
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    tridimensionalArray[i][j][k] = value++;
                }
            }
        }
        return tridimensionalArray;
    }


        public static void main (String[]args){
            int[] uniArray = createAndPopulateUnidimensionalArray(5);
            System.out.println(getUnidimensionalString(uniArray));
            System.out.println("===================");
            int[][] intArrayBi = createAndPopulateBidimensionalArray(5, 5);
            System.out.println(getBidimensionalString(intArrayBi));
            System.out.println("===================");
            int[][][] intArrayTri = createAndPopulateTridimensionalArray(3, 3, 3);
            System.out.println(getTridimensionalString(intArrayTri));
        }
    }

