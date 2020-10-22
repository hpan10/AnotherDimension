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
}
