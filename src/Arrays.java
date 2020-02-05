import java.util.Random;
public class Arrays {
    public static void main(String[] args)
    {
        int[] numbers;
        numbers = new int[4];

        System.out.println(numbers.length);

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;

        for(int i = 0; i<numbers.length; i++)
        {
            numbers[i]=numbers[i]*2;
            System.out.println(numbers[i]);
        }

        //2 dimensional arrays
        int[][] scores = new int[3][4];
        for(int row = 0; row < 3; row++)
        {
            System.out.println();
            for(int col = 0; col < 4; col++)
            {
                Random random = new Random();
                scores[row][col] = random.nextInt();
                System.out.print(scores[row][col] + " ");
            }
        }
    }
}
