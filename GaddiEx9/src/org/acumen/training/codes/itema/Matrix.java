package org.acumen.training.codes.itema;

public class Matrix<E extends Number> {

    private E[][] values;
    private Integer rows;
    private Integer cols;

    public void setRows(Integer rows) {
        this.rows = rows;
        initializeValues(); // Initialize values when setting rows
    }

    public Integer getRows() {
        return rows;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
        initializeValues(); // Initialize values when setting columns
    }

    public Integer getCols() {
        return cols;
    }

    @SuppressWarnings("unchecked")
    private void initializeValues() {
        if (rows != null && cols != null) {
            values = (E[][]) new Number[rows][cols]; // Initialize values array
        }
    }

    public E getValue(Integer r, Integer c) { // retrieval of matrix item
        return values[r][c];
    }

    @SuppressWarnings("unchecked")
    public void setValue(Integer r, Integer c, Number sum) { // for the creation of the matrix
    	
        try {
            checkValues(r, c, sum);
            values[r][c] = (E) sum;
        } catch (NoNegativeValuesException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addMatrices(Matrix<E> matrix1, 
			Matrix<E> matrix2) throws WrongMatrixDimensionException {

        Integer i = 0, j = 0;
        try {
            checkDimensions(matrix1, matrix2);
            checkMatrices(matrix1, matrix2);
            checkMatrixCount(matrix1, matrix2);
        } catch (WrongMatrixDimensionException e) {
            e.printStackTrace();
            return; 
        } catch (Exception e) {
            e.printStackTrace();
        }

        Matrix<Double> result = new Matrix<>();
        result.setRows(matrix1.getRows());
        result.setCols(matrix1.getCols());

        for (i = 0; i < matrix1.getRows(); i++) {
            for (j = 0; j < matrix1.getCols(); j++) {
				E value1 = (E) matrix1.getValue(i, j);
                E value2 = (E) matrix2.getValue(i, j);
                Number sum = value1.doubleValue() + value2.doubleValue();
                result.setValue(i, j, sum);
            }
        }

        printMatrix(result); 
    }

	private static void printMatrix(Matrix<Double> matrix) {
    	
    	System.out.println("Resulting matrix: ");
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                System.out.print(matrix.getValue(i, j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unchecked")
    public void checkValues(Integer r, Integer c, 
    		Number sum) throws NoNegativeValuesException, Exception { // for the setting of values
        
    	if (sum.doubleValue() < 0) {
            throw new NoNegativeValuesException();
        }
        values[r][c] = (E) sum;
    }

    public void checkDimensions(Matrix<E> matrix1, 
    		Matrix<E> matrix2) throws WrongMatrixDimensionException, Exception { // for the retrieval
        
    	if (matrix1.getRows() != matrix2.getRows() || matrix1.getCols() != matrix2.getCols()) {
            throw new WrongMatrixDimensionException();
        }
    }

    public void checkMatrices(Matrix<E> m1, Matrix<E> m2) 
    		throws NoMatrixException, Exception {
    	
        if (m1 == null || m2 == null) {
            throw new NoMatrixException();
        }
    }

    public void checkMatrixCount(Matrix<E> m1, Matrix<E> m2) 
    		throws InvalidMatrixOperationException, Exception {
    	
        if (m1.getRows() == 0 || m1.getCols() == 0) {
            throw new InvalidMatrixOperationException();
        }
    }
}
