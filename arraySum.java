public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array, 0);
        System.out.println("Sum of array elements: " + sum);
    }

    static int calculateSum(int[] array, int index) {
        if (index == array.length) {
            return 0;
        } else {
            return array[index] + calculateSum(array, index + 1);
        }
    }
}
