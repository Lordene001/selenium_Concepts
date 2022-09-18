package intro1;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For Loop
		
				for(int i=5;i<=10;i++) 
				{
					System.out.println("Number " + i);
					
				}
				
			
				//while loop, when we don't know the number of iteration
				
				int p=3;
				while(p<=7)
				{
					System.out.println("Nums " + p);
					p++;
					//break;
				}
				
				//do while loop, code must be executed asleast once and the number of iteration is not known
				
				int x=1;
				do {
					System.out.println("Nim " + x);
					x++;
				}while (x<=5);
				
				
				//Enhanced for loop
				
				int [] lucky_No = {1,3,6,3,6,9,2,4};
				
				for (int pick:lucky_No) 
				{
					System.out.println(pick);
				}
	}

}
