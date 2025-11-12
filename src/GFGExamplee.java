// An Not in-place Java program
// to reverse an array

class GFGExamplee
{
    public static void reverseArray(int []arr, int n)
    {

        int []rev = new int[n];
        for (int i = 0; i < n; i++)
            rev[n - i - 1] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = rev[i];
    } 

    public static void printArray(int []arr, 
                                  int size)
    {
    for (int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
    System.out.println();
    } 
    
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        int n = arr.length;
        printArray(arr, n); 
        reverseArray(arr, n); 
        System.out.println("Reversed array is");
        printArray(arr, n); 
    }
}
