import java.io.*;
  
public class  countodd{
  
    static void CountingOdd(int arr[], int arr_size)
    {
        
        int odd_count = 0;
  
        // loop to read all the values in
        // the array
        for (int i = 0; i < arr_size; i++) {
              
              // checking if a number is
            // completely divisible by 2
            if ((arr[i] & 1) == 1)
                odd_count++;
            else
                 System.out.println("");
        }
  
        System.out.println(" Number of odd elements = "
                           + odd_count);
    }
  
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 5, 6 };
        int n = arr.length;
            
          // Function Call
        CountingOdd(arr, n);
    }
}