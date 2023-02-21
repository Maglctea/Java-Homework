import java.util.Arrays;

public class Homework03 {

    public static int[] mergeSort(int[] src) {
        if (src.length <= 1)
            return src;

        int[] leftArray = Arrays.copyOfRange(src, 0, src.length / 2);
        int[] rightArray = Arrays.copyOfRange(src, leftArray.length, src.length);
        
        return merge(mergeSort(leftArray), mergeSort(rightArray));
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {
        int res = 0, left = 0, right = 0;
        int[] result = new int[leftArray.length + rightArray.length];

        while (left < leftArray.length && right < rightArray.length)
            if (leftArray[left] < rightArray[right])
                result[res++] = leftArray[left++];
            else
                result[res++] = rightArray[right++];

        while (res < result.length)
            if (left != leftArray.length)
                result[res++] = leftArray[left++];
            else
                result[res++] = rightArray[right++];

        return result;
    }

    public static void main(String[] args) {

        int[] startArray = new int[] { 3, 1, 2, 7, 5, 6, 4, 8, 9 };
        System.out.println(Arrays.toString(mergeSort(startArray)));

    }

}