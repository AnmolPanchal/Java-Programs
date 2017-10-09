import java.io.*;
import java.lang.*;
class brasil
{
    public static void main(String ap[]) throws IOException
	{
  	String src;

  	int a;

	 System.out.println("Enter Purchase price");

	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     	src=br.readLine();
	a=Integer.parseInt(src);
	//System.out.println(a);


	
	if(a<101)
	a=1;
	else if(a<201)
	a=2;
	else if(a<301)
	a=3;
	else if(a>300)
	a=4;

switch(a)
{
	case 1:  
	{
	System.out.println("no discount on mill cloth 5% discount on handloom cloth");
	}
	break;

                   case 2:  
	{
	System.out.println("5% discount on mill cloth 7.5% discount on handloom cloth");
	}
	break;
                   case 3: 
	{
	System.out.println("7.5% discount on mill cloth 10% discount on handloom cloth");
	}
	break;

                   case 4:  
                   
	{
	System.out.println("10% discount on mill cloth 15% discount on handloom cloth");
	}
 	break;	
	


	
	
	
                 
}	
}
}
