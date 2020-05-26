package tcs;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Document[] docs =new Document[4];
		
		for(int i=0;i<docs.length;i++)
		{
			int id = sc.nextInt();sc.nextLine();
            String title = sc.nextLine();
            String foldername = sc.nextLine();
            int page = sc.nextInt();
            
            docs[i]=new Document(id ,page ,title ,foldername);
		}
		
		
		
		Document[] doc=Combinedoc(docs);
		for(int i=0;i<doc.length;i++)
		{
		System.out.println(doc[i].getId()+" "+doc[i].getTitle()+" "+doc[i].getFoldername()+" "+doc[i].getPage());
       
		}
		
	}
	
	public static Document[] Combinedoc(Document[] docs)
	
	{
		int n=0;
		for(Document doc:docs)
		{
			if(doc.getPage()%2!=0)
				n++;
		}
	
		Document[] doc =new Document[n];
		n=0;
			for(int i = 0;i<docs.length;i++)
	        {
	           if(docs[i].getPage()%2!=0) doc[n++]=docs[i];
	        }
			
			for(int i=0;i<doc.length-1;i++)
			{
				for(int j=0;j<doc.length-1-i;j++)
				{
					if(doc[j].getId()>doc[j+1].getId())
					{
						Document temp=doc[j];
						doc[j]=doc[j+1];
						doc[j+1]=temp;
					}
				}
			}
			return doc;
			
			
	        
	
	}
}









	class Document{
		private	int id,page;
		private	String title,foldername; 
			
			
			// setter
		public void setId(int id )
		{
			this.id=id;
		}
		public void setPage(int page )
		{
			this.page=page;
		}
		 
		public void setTitle(String title)
		{
			this.title=title;
		}
		
		public void setFoldername(String foldername )
		{
			this.foldername=foldername;
		}
		
		// getter
		public int  getId() {
			return id;
		}
		public int getPage( ) {
			return page;
		}
		
		public String getTitle() {
			return title;
			
		}
		
		public String getFoldername() {
			return foldername;
		}
		
		public Document(int id,int page,String title,String foldername) {
			
			this.foldername=foldername;
			this.title=title;
			this.id=id;
			this.page=page;
			
		}
		
		
		}
	


