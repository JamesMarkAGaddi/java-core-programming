package org.acumen.training.codes.itema;

public class TestMatrix {
    public static void main(String[] args) throws NoNegativeValuesException {

        Matrix<Number> matrix1 = new Matrix<>();
        matrix1.setRows(2);
        matrix1.setCols(2);
        matrix1.setValue(0, 0, 1.0);
        matrix1.setValue(0, 1, 2.0);
        matrix1.setValue(1, 0, 3.0);
        matrix1.setValue(1, 1, 4.0);

        Matrix<Number> matrix2 = new Matrix<>();
        matrix2.setRows(2);
        matrix2.setCols(2);
        matrix2.setValue(0, 0, 5.0);
        matrix2.setValue(0, 1, 6.0);
        matrix2.setValue(1, 0, 7.0);
        matrix2.setValue(1, 1, 8.0);

        // Test Adding Incompatible Matrices
        Matrix<Number> matrix3 = new Matrix<>();
        matrix3.setRows(3);
        matrix3.setCols(3);
        matrix3.setValue(0, 0, 1.0);
        matrix3.setValue(0, 1, 2.0);
        matrix3.setValue(0, 2, 3.0);
        matrix3.setValue(1, 0, 4.0);
        matrix3.setValue(1, 1, 5.0);
        matrix3.setValue(1, 2, 6.0);
        matrix3.setValue(2, 0, 7.0);
        matrix3.setValue(2, 1, 8.0);
        matrix3.setValue(2, 2, 9.0);

        //Test WrongMatrixDimensionException
        try {
            matrix1.addMatrices(matrix1, matrix3);
        } catch (WrongMatrixDimensionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Test NoNegativeValuesException
        try {
            matrix1.setValue(0, 0, -1.0); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Test Addition of Matrices
        Matrix<Number> resultMatrix = new Matrix<Number>();
        try {
            resultMatrix.addMatrices(matrix1, matrix2);
        } catch (WrongMatrixDimensionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
