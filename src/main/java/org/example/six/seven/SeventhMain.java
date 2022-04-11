package org.example.six.seven;


public class SeventhMain {
    public static void main(String[] args) {
        final Double[][] someMatrix = {
            {3.0, 3.0, 3.0}, {4.0, 4.0, 4.0}, {5.0, 5.0, 5.0}
        };
        final Matrix<Double, Integer> matrix = new Matrix(someMatrix, 3, 3);

        matrix.additionMatrixToNumber(2);
        matrix.printMatrix();

        matrix.additionMatrix(new Matrix(someMatrix, 3, 3));
        matrix.printMatrix();
    }
}
