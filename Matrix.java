package com.crack.code.eamples;

public class Matrix {

	/**Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int row  = 3;
	int col = 4;
	int [][] matrix = {{1,2,3,4},{5,0,6,7},{0,2,3,0}};
	int [][] destination = new int[3][4];
	
	
	for ( int r = 0; r < row; r++)

	{

	  for ( int c = 0; c < col; c++ )

	  {

	    destination [ r ] [ c ] = matrix [ r ] [ c ];

	  }

	}

	for(int i = 0; i < row; i++){
		
		for(int j = 0; j < col; j++){
			
			if(matrix[i][j] == 0){
				
				int curr_col = 0;
				int curr_row = 0;
				
				while(curr_col < col && curr_row < row){
					
					destination[i][curr_col] = 0;
					destination[curr_row][j] = 0;
					curr_row++;
					curr_col++;
					
				}			
               
								
			}
			
		}
		
	}
	

  for(int i = 0; i < row; i++){
		
		for(int j = 0; j < col; j++){
			
			System.out.print(destination[i][j]+" ");
			
		}
		
		System.out.println("");
    
   }
		

	}
	
	

}
