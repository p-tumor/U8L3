public class Algorithm2DArrays {
    /**
     * Return true if target is found at least once in arr; false otherwise.
     *
     * @param arr    2D array of ints
     * @param target target value to be searched for in arr
     * @return true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target) {
        for(int[] x: arr) for(int y: x) if(y == target) return true;
        return false;
    }
    /** Return the number of elements in arr that contain searchStr as a substring
     *
     *  @param arr  2D array of Strings
     *  @param searchStr  searchStr value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr)
    {
        int count = 0;
        for(String[] x: arr) for(String s: x) if(s.toLowerCase().contains(searchStr)) count++;
        return count;
    }
    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     */
    public static void replaceEvensWithZero(int[][] arr)
    {
        for(int[] x: arr) for(int i = 0; i < x.length; i++) if(x[i]%2 == 0) x[i] = 0;
    }
    /** Return the sum of all elements of arr that are in the one particular row
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row will not cause out of bounds)
     */
    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;
        for(int i = 0; i < arr[row].length; i++) sum += arr[row][i];
        return sum;
    }
    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col will not cause out of bounds)
     */
    public static int sumForColumn(int[][] arr, int col)
    {
        int sum = 0;
        for (int[] x : arr) sum += x[col];
        return sum;
    }
    /** Creates a 2D array of ints of size n x m, where n is number of rows and
     *  m is number of columns; the elements in the 2D array should be numbered 0
     *  through n x m - 1, with the numbers filled top to bottom, left to right.
     *  The method prints the 2D array "grid" of numbers, then finally returns
     *  the 2D array.
     *
     *  For example, for rows = 3 and cols = 4, this method should print
     *  (and return):
     *  0 1 2 3
     *  4 5 6 7
     *  8 9 10 11
     *
     *  Each element can be printed with a single space in between (no need to
     *  make it "look nice" unless you want to).
     *
     *  @param rows  number of rows
     *  @param cols  number of columns
     *  @return  the same 2D array "number grid" that gets printed by the method
     */
    public static int[][] printNumberGrid(int rows, int cols)
    {
        int[][] thing = new int[rows][cols];
        for(int i = 0; i < rows; i++){
        }
        return thing;

    }

}