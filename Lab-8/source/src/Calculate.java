public class Calculate {

	public char sum(int var1) {
		char grade = 0;
		System.out.println("Adding values: " + var1 );
		if(var1<=100 && var1>90)
		{	 grade = 'A';
		}
		else if(var1<=90 && var1>80)
		{	grade= 'B';
		}
		else if(var1<=80 && var1>70)
		{	grade= 'C';
		}
		else if(var1<=70 && var1>60)
		{	grade= 'D';
		}
		else if(var1<=60 && var1>=50)
		{	grade= 'E';
		}
		else 
		{	grade= 'F';
		}
		return grade;
	}

	

}