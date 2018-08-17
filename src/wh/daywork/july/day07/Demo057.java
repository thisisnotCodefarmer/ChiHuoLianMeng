package wh.daywork.july.day07;

public class Demo057 {
    public  static void main(String[]arg){

		int[][] a = new int[10][10];

		for (int n = 0; n < 10; n++)

		{
			a[n][0] = 1;

			a[n][n] = 1;

		}
			for (int n = 2; n < 10; n++)
			{

				for (int j = 1; j < n; j++)

				{
					a[n][j] = a[n - 1][j - 1] + a[n - 1][j];

				}
			}
		for (int n = 0; n < 10; n++)

		{
			for (int k = 0; k < 2 * (10 - n) - 1; k++)
				{
					System.out.print(" ");
				}
					for (int j = 0; j <= n; j++)
					{
						System.out.print(a[n][j] + "   ");

					}
						System.out.println();

					}
		 }
}
