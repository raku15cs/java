package test;

public class Test {
	public static void main(String[ ]arg)
	{
		String test = "Tahasufiyan";
		//test=test.toLowerCase();
		char small,large;
		small=test.charAt(0);
		large=test.charAt(0);
		
		for(int i=1;i<test.length();i++)
		{
			if(small> test.charAt(i))
				small=test.charAt(i);
		}
		for(int i=1;i<test.length();i++)
		{
			if(large< test.charAt(i))
				large=test.charAt(i);
		}
		System.out.println(small);
		System.out.println(large);
		int a=small;
		System.out.println(a);
	}

}
