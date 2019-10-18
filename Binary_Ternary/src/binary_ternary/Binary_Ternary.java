package binary_ternary;

public class Binary_Ternary
{
    static int binCount = 0;
    static int ternCount = 0;
    
    public static void main(String[] args)
    {
        int key = 5;
  
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
        18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35}; 
        binCount++;
        int p = ternarySearch(0, 34, key, arr); 
        System.out.println("Ternary Recursive Implementation\n"
                         + "--------------------------------");
        System.out.println("Element found at index " + p); 
        System.out.println("It took " + ternCount + " recursions.\n");
        
        int result = binarySearch(arr, 0, arr.length-1, key); 
        System.out.println("Binary Recursive Implementation\n"
                         + "-------------------------------");
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result);
        System.out.println("It took " + binCount + " recursions.");
    }
    
    static int ternarySearch(int l, int r, int key, int ar[]) 
    {
        ternCount++;
        if (r >= l) 
        {
            int mid1 = l + (r - l) / 3; 
            int mid2 = r - (r - l) / 3; 
            
            if(ar[mid1] == key)
                return mid1;
            if(ar[mid2] == key)
                return mid2;
  
            if(key < ar[mid1]) 
                return ternarySearch(l, mid1 - 1, key, ar); 
            else if(key > ar[mid2])
                return ternarySearch(mid2 + 1, r, key, ar);
            else
                return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
        }
        return -1;
    }
    
    static int binarySearch(int arr[], int l, int r, int x) 
    {
        binCount++;
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            
            if (arr[mid] == x) 
                return mid;
  
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x);
            
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    }
    
}
