// Author: Travis Dowd
// Date: 2-26-2020
//
// Chapter 8, exercise 8-5

class Ex8_5 {
	public static void main(String[] args) {
		//double[][] a, b;
		//a = new double[3][3];
		//b = new double[3][3];
		double [][] a = {
			{1.0, 2.0, 3.0},
			{4.0, 5.0, 6.0},
			{7.0, 8.0, 9.0}
		};
		double[][] b = {
			{0.0, 2.0, 4.0},
			{1.0, 4.5, 2.2},
			{1.1, 4.3, 5.2}
		};
		addMatrix(a, b);
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c;
		c = new double[3][3];
		for (int i = 0; i < c.length; i++){
			for (int j = 0; j < c[i].length; j++){
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		// Make this a method to print out all the array
		for (int row = 0; row < c.length; row++){
			for (int col = 0; col < c[row].length; col++){
				System.out.print( c[row][col] + " ");
			}
		}
		return c;
	}
}