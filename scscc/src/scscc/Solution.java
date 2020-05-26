package scscc;
import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Book[] books=new Book[4];
		
		for(int i=0;i<books.length;i++) {
			int id=sc.nextInt();sc.nextLine();
			String title=sc.nextLine();
		     String author=sc.nextLine();
			double price=sc.nextDouble();
			 
			books[i]=new Book(id,title,author,price);
		}
		Book[] book =sortbookbyprice(books);
		
		for(Book i:book) {
			System.out.println(i.getId()+" "+i.getTitle()+" "+i.getAuthor()+" "+i.getPrice());
		}
		
		
	}
	
	public static Book[] sortbookbyprice(Book[] book )
	{
		
		for(int i=0;i<book.length-1;i++) {
			for(int j=0;j<book.length-i-1;j++)
			{
				if(book[j].getPrice()<book[j+1].getPrice()) {
					Book temp=book[j];
					book[j]=book[j+1];
					book[j+1]=temp;
					
				}
			}
			
		}
		return book;
		
	}

}




 class Book{
	 int id;
	 String title;
	 String author;
	 double price;
	 
public Book(int id ,String title, String author ,double price)
{
	 this.id=id;
	 this.title=title;
	 this.author=author;
	 this.price=price;
}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	
}

 
 
 
 
 
 
 
 
 
 
 
 
 