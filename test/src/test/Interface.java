package test;

//there are three type of interface 
// 1  maker interface --- no method
// 2  single abstract interface or functional interface :in this interface we can use the concept of the lambada expression
//  3 normal 

// interface new features  in java 8
// 1 default method
// 2 static method

interface Abc{
	//void show();
	
	default void raju() {
		System.out.println("hello  aa   RAju");

	}
	
	static void Sha() {
		System.out.println("hello sha");
	}
}

class Third_rule_of_java{
	
	public void raju() {
		System.out.println("hello   third RAju");

	}
}

class CRGV  extends Third_rule_of_java implements Abc {
	
	
}
class Abcin  implements Abc{
	public void show()
	{
		System.out.println("hello");
	}
}


class Iterface{
	
	public static void main(String[] arg)
	{
		Abc obj=new Abcin();
		//obj.show();
		//obj.raju();
		//Abc.Sha();
		CRGV aa=new CRGV();
		aa.raju();
		
	}
}

























