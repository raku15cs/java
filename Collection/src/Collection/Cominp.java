package Collection;

import java.util.Comparator;

public class Cominp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		if(o1%100>o2%100)
			 return 1;
		return -1;
	}

}

