public class sum_of_digits {
	static int digits(int num)
	{
		while(num <0)
		{
			 num = num/10;
			 num++;
			
		}
		return num;
	}

}
