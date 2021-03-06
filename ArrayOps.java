public class ArrayOps{

  public static int sum(int[] arr){
    int sum = 0;
    for (int start = 0; start < arr.length; start++){
      sum += arr[start];
    }
    return sum;
  }


  public static int largest(int[] arr){
    int largest = arr[0];
    for (int start = 0; start < arr.length; start++){
      if (arr[start] > largest) largest = arr[start];
    }
    return largest;
  }


  public static int[] sumRows(int[][] matrix){
    int[] sumArray = new int[matrix.length];
    for (int row = 0; row < matrix.length; row++){
      sumArray[row] = sum(matrix[row]);
    }
    return sumArray;
  }


  public static int[] largestInRows(int[][] matrix){
    int[] largestArray = new int[matrix.length];
    for (int row = 0; row < matrix.length; row++){
      largestArray[row] = largest(matrix[row]);
    }
    return largestArray;
  }


  public static int sum(int[][] matrix){
    int sum = 0;
    for (int row = 0; row < matrix.length; row++){
      sum += sum(matrix[row]);
    }
    return sum;
  }


  //Finds the sum of a specified column
  public static int sumCol(int[][] matrix, int col){
    int sum = 0;
    for (int row = 0; row < matrix.length; row++){
      sum += matrix[row][col];
    }
    return sum;
  }


  public static int[] sumCols(int[][] matrix){
    int[] sumCols = new int[matrix[0].length];
    for (int startCol = 0; startCol < matrix[0].length; startCol++){
      sumCols[startCol] = sumCol(matrix,startCol);
    }
    return sumCols;
  }


  public static boolean isRowMagic(int[][] matrix){
    int[] sums = sumRows(matrix);
    int sumCheck = sums[0];
    for (int start = 1; start < sums.length; start++){
      if (sums[start] != sumCheck) return false;
    }
    return true;
  }


  public static boolean isColMagic(int[][] matrix){
    int[] sums = sumCols(matrix);
    int sumCheck = sums[0];
    for (int start = 1; start < sums.length; start++){
      if (sums[start] != sumCheck) return false;
    }
    return true;
  }


  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    return sum(matrix[row]) == sumCol(matrix, col);
  }
}
