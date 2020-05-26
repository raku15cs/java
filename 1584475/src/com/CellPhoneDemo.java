package com;

public class CellPhoneDemo {

	public static void main(String[] args) {
		
		Cell[] cells = new Cell[5];      
		cells[0] = new Cell(1,"aaa",50,0.5,"mum");   
		cells[1] = new Cell(2,"aaa",40,0.5,"ahd");   
		cells[2] = new Cell(3,"aaa",30,0.5,"pne");   
		cells[3] = new Cell(4,"aaa",55,0.5,"mum");   
		cells[4] = new Cell(5,"aaa",60,0.5,"pne");   
		
		System.out.println(deductBalance(cells[2],10));  
		
		Cell[] newCells = searchCircle(cells,"mum");    
		
		for(Cell cell:newCells)   
		    {    
			System.out.println(cell.getCellNo());  
			} 
	}

		public static double deductBalance(Cell a, int b)
		{
			double balance;
			balance=a.getBalance()-a.getRatePerSecond()*b;
			return balance;
		}
		
		public static Cell[] searchCircle(Cell[] a, String b)
		{
			int c=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i].getCircle()==b)
				{
					c++;
				}
			}
			Cell[] n=new Cell[c];
			int j=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i].getCircle()==b)
				{
				n[j]=a[i];
				
					j++;
				}
			
			}
			return n;
			

	}

}

	
