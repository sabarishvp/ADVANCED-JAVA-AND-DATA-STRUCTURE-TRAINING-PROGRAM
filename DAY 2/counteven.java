import java.io.*;
  
public class  counteven{
  
    static void CountingEven(int arr[], int arr_size)
    {
        int even_count = 0;
        
  
        // loop to read all the values in
        // the array
        for (int i = 0; i < arr_size; i++) {
              
              // checking if a number is
            // completely divisible by 2
            if ((arr[i] & 1) == 0)
                even_count++;
            else
                System.out.println("");
        }
  
        System.out.println("Number of even"
                           + " elements = " + even_count  );
                          
                   
    }
  
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 5, 6 };
        int n = arr.length;
            
          // Function Call
        CountingEven(arr, n);
    }
}