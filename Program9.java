class Program9{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
			  System.out.print((char)(j+96));	
			}
			System.out.println();
		}
	}
}

/*
a
ba
cba
dcba
edcba
*/