package hinojosa.juan.GuessingGame;

public class Part2 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i < 1000)
		{
			if(i % 3 == 0)
			{
				sum = sum + i;
			}
			if(i % 5 == 0)
			{
				sum = sum + i;
			}
			if(i % 15 == 0)
			{
				sum = sum - i;
			}
			
			i = i + 1;
		}
		System.out.println(sum);
	}
}
