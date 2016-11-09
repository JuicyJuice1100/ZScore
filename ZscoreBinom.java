import java.util.Scanner;

public class ZScoreBinom
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
		mean = smplSize * prob;
		stdDev = Math.sqrt(mean * (1 - prob));

		//calculate Zscore
		System.out.println("Zscore = " + (x - mean)/stdDev);

	} // end main
}// end class ZScoreBinom