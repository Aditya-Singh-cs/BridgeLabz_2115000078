import java.util.Random;
class MatrixOperations{
    public static void main(String[] args){
        int rows = 3, cols = 3;
        double[][] matrixA = generateMatrix(rows, cols);
        double[][] matrixB = generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("Addition of Matrices:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("Subtraction of Matrices:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("Multiplication of Matrices:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));
        
        if (rows == 2 && cols == 2){
            System.out.println("Determinant of Matrix A: " + determinant2x2(matrixA));
            System.out.println("Inverse of Matrix A:");
            displayMatrix(inverse2x2(matrixA));
        } else if (rows == 3 && cols == 3){
            System.out.println("Determinant of Matrix A: " + determinant3x3(matrixA));
            System.out.println("Inverse of Matrix A:");
            displayMatrix(inverse3x3(matrixA));
        }
    }

    public static double[][] generateMatrix(int rows, int cols){
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static double[][] addMatrices(double[][] A, double[][] B){
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static double[][] subtractMatrices(double[][] A, double[][] B){
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static double[][] multiplyMatrices(double[][] A, double[][] B){
        int rows = A.length, cols = B[0].length, sumLength = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                for (int k = 0; k < sumLength; k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] transposeMatrix(double[][] A){
        int rows = A.length, cols = A[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }

    public static double determinant2x2(double[][] A){
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    public static double determinant3x3(double[][] A){
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1]) -
               A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0]) +
               A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    public static double[][] inverse2x2(double[][] A){
        double det = determinant2x2(A);
        if (det == 0) return null;
        return new double[][]{
            { A[1][1] / det, -A[0][1] / det },
            { -A[1][0] / det, A[0][0] / det }
        };
    }

    public static double[][] inverse3x3(double[][] A){
        double det = determinant3x3(A);
        if(det == 0) return null;
        double[][] adj = new double[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                adj[i][j] = ((A[(j + 1) % 3][(i + 1) % 3] * A[(j + 2) % 3][(i + 2) % 3]) -
                             (A[(j + 1) % 3][(i + 2) % 3] * A[(j + 2) % 3][(i + 1) % 3])) / det;
            }
        }
        return adj;
    }

    public static void displayMatrix(double[][] matrix){
        if(matrix == null){
            System.out.println("Matrix is not invertible.");
            return;
        }
        for(double[] row : matrix){
            for (double value : row){
                System.out.printf("%8.2f ", value);
            }
            System.out.println();
        }
    }
}
