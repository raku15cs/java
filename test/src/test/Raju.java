package test;
import java.util.*;
public class Raju {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {
				int p=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						p++;
						
					}
						
				}if(p==0) {
				System.out.print(i+" "); 
				}
			}
			
				
		}
	}


