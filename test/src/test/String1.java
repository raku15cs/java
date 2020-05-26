package test;
import java.util.*;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String s1="";
		String s2="";
		for(int i=0;i<n;i++) {
			s1=s.next();
			s2=s.next();
			//checkstring(s1,s2);
			char[] arr1=s1.toCharArray();
			char[] arr2=s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			  if(Arrays.equals(arr1,arr2))
				  System.out.println("YES"); 
				  else 
					  System.out.println("NO");
				  
		}
	}

	

}
