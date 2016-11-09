import java.util.Scanner;

public class ZScoreNormal
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double mean, stdDev, smplSize, x;
		
		//grabing the mean, stdDev, smplSize, and x for calculation for Zscore
		System.out.println("mean, stdDev, smplSize, x");
		mean = scan.nextDouble();
		stdDev = scan.nextDouble();
		smplSize = scan.nextDouble();
		x = scan.nextDouble();

		//calculating stdDev
		stdDev = stdDev / (Math.sqrt(smplSize));

		//calculate Z
		System.out.println("Zscore = " + (x - mean)/stdDev);
	} //end main
} //end class ZScore