package other;
import java.util.*;
public class Other {
    public static void main(String args[]) {
//        int[] inputArray = {1, 4, 2, -2, -9, 10, 2, 12, 2, -4, -4, -4, -4, 2, 6, 7};
//        List<int[]> output = findPeaks(inputArray);
//        for (int[] peak : output) {
//            System.out.println("(" + peak[0] + ", " + peak[1] + ")");
//        }
    	String s="''";
    	System.out.println(s.isEmpty());
    	System.out.println(s==null);
    	
    }
    public static List<int[]> findPeaks(int[] array) {
        int peak = array[0];
        int index = 0;
        List<int[]> output = new ArrayList<>();

        for (int x = 1; x < array.length; x++) {
            if (array[x] * array[x - 1] > 0) {
                if (peak < 0 && array[x] < peak) {
                    peak = array[x];
                    index = x;
                }
                if (peak >= 0 && array[x] > peak) {
                    peak = array[x];
                    index = x;
                }
            } else {
                output.add(new int[]{index, peak});
                peak = array[x];
                index = x;
            }
        }

        return output;
    }
}