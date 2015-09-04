/*
 *
 */
public class HIndex {

    public int hIndex(int[] citations) {
        int[] count = new int[citations.length];
        for (int i = 0; i < citations.length; ++i) {
            for (int j = 0; j < citations.length; ++j) {
                if (citations[j] >= citations[i])
                    count[i]++;
            }
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < citations.length; ++i) {
            if (count[i] == citations[i] && count[i] >= result)
                result = count[i];
        }
        return result;
    }

}
