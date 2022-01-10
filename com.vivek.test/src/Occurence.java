

public class Occurence {
	
	void find(int arr[],int b , int x){
		double first = -1; double last = -1;
		for(int i = 0 ; i<b ; i++)
		{
			
			if(x!=arr[i])
				continue;
			if(first==-1)
			first = i;
			last = i ;
		}
		if(first!=-1) {
			System.out.println(first);
			System.out.println(last);
		}
		else
		{
			System.out.println("error");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5 ;
	
		int arr[] = {1,45,5,8,5,5,4444,5}; 
		Occurence o = new Occurence();
		
		o.find(arr, arr.length, x);

	}

}
