import java.util.Arrays;

public class Main {

    public static int[] array = {5, 1, 3, 2, 7};
    public static int sum = 10;

    public static void main(String[] args) {
        Main main = new Main();
        main.findToSum(array, sum);

    }

    public int[] findToSum(int[] array, int sum) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            int foundedSum = array[leftIndex] + array[rightIndex];
            if (foundedSum == sum) {
                System.out.println("ответ:  " + Arrays.toString(new int[]{array[leftIndex], array[rightIndex]}));
                return new int[]{array[leftIndex], array[rightIndex]};
            }
            if (foundedSum > sum)
                rightIndex--;
            else leftIndex++;
        }
        return new int[0];
    }
}