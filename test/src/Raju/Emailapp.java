package Raju;

import java.util.*;

public class Emailapp {
	String firstname="";
	String lastname="";
	private String department="";
	

	public  Emailapp(String firstname ,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Name:"+this.firstname+ " "+this.lastname);
		System.out.println("Departmen");
		this.department=setdepartment();
		System.out.println("Department:-"+this.department);
		System.out.println("Departmendddddd");
		
		
	}
	
	
	private String setdepartment() {
		String deptname="";
		Scanner sc=new Scanner(System.in);
		int dep=sc.nextInt();
		if(dep==1)   {  
			return "sales";
		}
		else if (dep==2) {
			return "digital";
		}
		else if(dep==3) {
			return "IT";
		}
		else return "unknown";
		
		
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Emailapp name=new Emailapp("raju","mehtatfygh");
}}
