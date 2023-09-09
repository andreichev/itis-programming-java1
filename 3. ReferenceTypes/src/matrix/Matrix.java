package matrix;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("First matrix:");
        double[][] firstMatrix = {
                { 1, 3, 4 },
                { 2, 3, 4 },
                { 7, 8, 9 }
        };
        printMatrix(firstMatrix);
        System.out.println();

        System.out.println("Second matrix:");
        double[][] secondMatrix = {
                { 1, 3, 4 },
                { 2, 3, 4 },
                { 7, 8, 9 }
        };
        printMatrix(secondMatrix);
        System.out.println();

        System.out.println("first * second matrix:");
        double[][] result = multiplyMatrices(firstMatrix, secondMatrix);
        printMatrix(result);
    }

    static void printMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }

    static double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }

        return result;
    }
}
