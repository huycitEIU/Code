import java.util.Scanner;
// Tìm số đèn sáng trong khoảng từ left đến right
public class LightCount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long lights = scanner.nextLong();
        long left  = scanner.nextLong();
        long right = scanner.nextLong();
        long i = 1;
        int lightCounts = 0;
        while (true)
        {
            long t = i*i;
            if (t > lights)
            {
                break;
            }
            if (left <= t && t <= right)
            {
               lightCounts++;
            }
            i++;
        }
        System.out.println(lightCounts);
    }
}
