package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> value= new ArrayList<Integer>();
		value.add(108);
		value.add(521);
		value.add(533);
		value.add(214);
		value.add(584);
		
		Comparator<Integer> comp=new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1%10>o2%10)
					 return 1;
				return -1;
			}
			
		};
	
		Collections.sort(value,comp);
		value.forEach(System.out::println);
		
		
		Collections.reverse(value);
		Iterator i=value.iterator();
		
	/*	While(i.hasNext())
		
		{
			System.out.println(i.next());
		} */
		Collections.sort(value);
		for(Integer j :value) {
			System.out.println(j);
		}
		
		

	}

}
