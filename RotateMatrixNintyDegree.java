package com.crack.code.eamples;

public class RotateMatrixNintyDegree {

	/**Write a program to rotate a matrix by 90 degrees
	 * Logic: Find transpose of a matrix and swap first element with last element
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int row = 3;		
		int col = 3;
		
		// finding the transpose of a matrix
		for ( int i = 0; i < row; i++)

		{

		  for ( int j = i+1; j < col; j++ )

		  {

			  int tmp = matrix[i][j];
	          matrix[i][j] = matrix[j][i];
	          matrix[j][i] = tmp;

		  }

		}
		// swaping first element with last element
		for ( int i = 0; i < row; i++)

		{
			  int tmp = matrix[i][0];
	          matrix[i][0] = matrix[i][row-1];
	          matrix[i][row-1] = tmp;

		}
		
		
		// printing matrix
		
		for(int i = 0; i < row; i++){
			
			for(int j = 0; j < col; j++){
				
				System.out.print(matrix[i][j]+" ");
				
			}
			
			System.out.println("");
	    
	   }
		
		

	}

}
