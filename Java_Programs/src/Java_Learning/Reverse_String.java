package Java_Learning;

public class Reverse_String {

	public static void main(String[] args) {
		
		//String name = "Sugan";
		
		//StringBuffer name1 = new StringBuffer();
		
		//name1.append(name);
		
		//System.out.println("Reverse Name : "+ name1.reverse());
		
		
		String name = "Sugan";
		
		char[]  Split=name.toCharArray();
		
		String reversed="";
		
		for(int i = Split.length-1;i>=0;i--) {
			
			reversed= reversed+Split[i];
		}
		
		System.out.println(reversed);
 
	}
	
	

}
