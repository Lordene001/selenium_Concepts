package intro1;

public class Core_java_concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// NOTES
		
		//Variables  (Variable_type  variable name = value)
		int Mynum =5;
		String nick_name = "Lord Ene";
		char alpha = 'p';
		double decimal = 5.55;
		boolean careless = true;
		
		//To print on the console
		//System.out.println(careless + " is the second name of anybody from xyz");
		//System.out.println(Mynum + " " + nick_name + " " + alpha + " " + decimal + " " + careless +" " + " are my declared variables.");
		
		//Arrays ( Can store multiple values in one single variable.)
		//Method_1
		int[] arr = new int[5]; 
		arr[0] = 1;
		arr[1] = 3;
		arr [2] = 5;
		arr [3] = 8;
		arr [4] = 12;
		//System.out.println(arr[0]);
		
		//Method_2
		int[] box = {1,5,10,12,14};
		//System.out.println(box[3]);
		
		String[] name1 = {"Bayo","Tomy","Ian","Jesse","Josiah"};
		//System.out.println(name1[3]);
		
		//For loop
		for(int i = 0; i<box.length; i++) 
		{
		//	System.out.println(box[i]);
		}
		
		for(int i = 0; i<name1.length; i++)
		{
		//	System.out.println(name1[i]);
			
		}
 
		//Enhanced For loops with conditional statements
		for (String x: name1)
		{
		System.out.println(x);
		}
		
	
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10,15,16,20};
		//print 3,5,7,9 on the console
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i]/3 <2 ) {
				System.out.println(arr1[i]);
				//break;
			}
			else
			{
				System.out.println("Go and sit down");
			}
			
		}
		
		
	}

}
