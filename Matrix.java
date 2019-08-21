/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author Alexander Chelpanov
 * Date: 21.08.2019
 * 
 * Matrix Determinant
 * 
 * Write a function that accepts a square matrix (N x N 2D array) and returns 
 * the determinant of the matrix. How to take the determinant of a matrix -- 
 * it is simplest to start with the smallest cases:
 * A 1x1 matrix |a| has determinant a.
 * A 2x2 matrix [ [a, b], [c, d] ] or
 * |a  b|
 * |c  d|
 * has determinant: a*d - b*c.
 * The determinant of an n x n sized matrix is calculated by reducing the 
 * problem to the calculation of the determinants of n matrices ofn-1 x n-1 size.
 * For the 3x3 case, [ [a, b, c], [d, e, f], [g, h, i] ] or
 * |a b c|  
 * |d e f|  
 * |g h i|  
 * the determinant is: a * det(a_minor) - b * det(b_minor) + c * det(c_minor) 
 * where det(a_minor) refers to taking the determinant of the 2x2 matrix 
 * created by crossing out the row and column in which the element a occurs:
 * |- - -|
 * |- e f|
 * |- h i|  
 * Note the alternation of signs.
 * The determinant of larger matrices are calculated analogously, e.g. if M 
 * is a 4x4 matrix with first row [a, b, c, d], then:
 * det(M) = a * det(a_minor) - b * det(b_minor) + c * det(c_minor) - 
 * d * det(d_minor)
 * 
 */
public class Matrix {
    public static void main(String[] args) {
        int [][] matrix1 = {{1}};
        int [][] matrix2 = {{1, 3}, {2,5}};
        int [][] matrix3 = {{2,5,3}, {1,-2,-1}, {1, 3, 4}};
        System.out.println(determinant(matrix1));
        System.out.println(determinant(matrix2));
        System.out.println(determinant(matrix3));
    }
    public static int determinant(int[][] matrix) {
        int calcResult = 0;
        if (matrix.length==1) {
            calcResult = matrix[0][0];
        }
        if (matrix.length == 2) {
            calcResult = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        } else {
            int koeff;
            for (int i = 0; i < matrix.length; i++) {
                if (i % 2 == 1) { 
                    koeff = -1;
                } else {
                    koeff = 1;
                }            
                calcResult += koeff * matrix[0][i] * determinant(GetMinor(matrix, 0, i));
            }
        }
        return calcResult;
    }
    
    private static int[][] GetMinor(int[][] matrix, int row, int column){
        int minorLength = matrix.length-1;
        int [][] minor = new int[minorLength][minorLength];
        int dI=0;
        int dJ;
        for(int i=0; i<=minorLength; i++){
            dJ=0;
            for(int j=0; j<=minorLength; j++){
                if(i==row){
                    dI=1;
                }
                else{
                    if(j==column){
                        dJ=1;
                    }
                    else{
                        minor[i-dI][j-dJ] = matrix[i][j];
                    }
                }
            }
        }      
        return minor;       
    }
}
