import java.util.Arrays;

public class HackRank {
    public static int[][] test = new int[][]{
        {-9,-9,-9,1,1,1},
        {0,-9,0,4,3,2},
        {-9,-9,-9,1,2,3},
        {0,0,8,6,6,0},
        {0,0,0,-2,0,0},
        {0,0,1,2,4,0}
    };
    public static int[] sums = new int[16];
    public static int glass = 0;
    public static void topRow(int topLeft, int row){
        sums[glass] += test[row][topLeft];
        sums[glass] += test[row][topLeft + 1];
        sums[glass] += test[row][topLeft + 2];
    }
    public static void mid(int topLeft, int row){
        sums[glass] += test[row+1][topLeft+1];
    }
    public static void bottom(int topLeft, int row){
        sums[glass] += test[row+2][topLeft];
        sums[glass] += test[row+2][topLeft + 1];
        sums[glass] += test[row+2][topLeft + 2];
    }
    public static void main(String[] args) {
        int topLeft = 0;
        int row = 0;
        for(int topLeft )
    }
}
