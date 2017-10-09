import java.io.*;
import java.lang.*;
class addarr
{
public static void main(String ap[]) throws IOException

	{
	   int a[][]=new  int[3][3];
	   int i,j,count=1;
	   int sum=0;
	   float avg;	

	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	   {
	a[i][j]=count;
	count++;
	   }
	}
	for(i=0;i<3;i++)
	  {
 	    for(j=0;j<3;j++)
	{
	sum=sum+a[i][j];
	}
	
	}
	   
	   	 System.out.print(sum+"\t");
	avg=sum/9;
		 System.out.println(avg+"\n");
	   
	
	
	   
}
}	

