
import java.util.Arrays;

public class MinMaxFinder {
    public String minMax(int[] arr){

        Arrays.sort(arr);
        int n=arr.length;
        return("Min="+arr[0]+"; Max="+arr[n-1]);


    }
}
