class sorting {
    public static void main(String args[]) throws IOException
    {
        int i,j,temp;
        int a[]=new int[10];

	DataInputStream br=new DataInputStream(System.in);
	a=Integer.parseInt(br.readLine());

        for(i=0;i<args.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        for(i=0;i<args.length;i++)
        {
            for(j=i+1;j<args.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<args.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
