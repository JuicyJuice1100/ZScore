import java.util.Scanner;

public class ZScoreNormP
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double smplSize, prob, mean, stdDev, x;
		
		//grab info from user
		System.out.println("smpSize, prob, x");
		smplSize = scan.nextDouble();
		prob = scan.nextDouble();
		x = scan.nextDouble();

		//calculating mean and stdDev
		mean = prob;
		stdDev = Math.sqrt(((prob * (1-prob)) / smplSize));

		//calculate Zscore
		System.out.println("Zscore = " + (x - mean)/stdDev);

	}//end main
}//end class ZScoreNormP