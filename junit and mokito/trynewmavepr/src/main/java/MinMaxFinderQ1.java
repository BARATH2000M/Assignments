import java.util.Arrays;

public class MinMaxFinderQ1 {
    public int[] minMax1(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        return new int[]{arr[0], arr[n - 1]};
    }
}
