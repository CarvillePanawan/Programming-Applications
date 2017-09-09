import java.util.Arrays;

public class toSmallest{
	public static long[] smallest(long n) {
        long minimum = n;
        int index = 0;
        int moveToIndex = 0;
        String number = String.valueOf(n);
        for (int i=0; i<number.length(); i++) {
          for (int j=0; j<number.length(); j++) {
            if (i!=j && making(number, i, j) < minimum) {
              minimum = making(number, i, j);
              index = i;
              moveToIndex = j;
            }
          }
        }
        return new long[]{minimum, index, moveToIndex};
    }

    public static long making(String number, int index, int moveToIndex) {
      StringBuilder sb = new StringBuilder(number);
      char c = sb.charAt(index);
      sb.deleteCharAt(index);
      sb.insert(moveToIndex, c);
      return Long.valueOf(sb.toString());
    }
}
