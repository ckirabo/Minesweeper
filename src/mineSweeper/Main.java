package mineSweeper;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] multiArray = new int[5][5];
	
		int array [] = {0,1};
		
		for(int i = 0; i < multiArray.length; i++) {

            for(int j = 0; j < multiArray[i].length; j++) {
            
                	
            	int r = new Random().nextInt(array.length);
            	System.out.print(r);
            	
               /*if(r == 1) {
            		System.out.println("its a bomb");
            	}*/
            
			}
            
            System.out.println();
			
		}
		
		
		
	}

}
