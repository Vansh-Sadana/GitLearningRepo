import java.io.*;
 
class GFG {
    public static void main(String[] args)
    {
        int arr[] = { 3, 5, 9, 2, 8, 10, 11 };
        int val = 17;
 
        System.out.println(twoSum(arr, val));
    }
     
        public static boolean twoSum(int[] input, int targetValue) {
    
        int pointerOne = 0;
        int pointerTwo = input.length - 1;
    
        while (pointerOne < pointerTwo) {
            int sum = input[pointerOne] + input[pointerTwo];
    
            if (sum > targetValue) {
                System.out.println(" sum is greater and pointer 1 is " + pointerOne + " 2 is " + pointerTwo);
                pointerTwo--;
                
            } else if (sum < targetValue) {
                System.out.println(" sum is less and pointer 1 is " + pointerOne + " 2 is " + pointerTwo);
                pointerOne++;
            } else {
                System.out.println(" equal and pointer 1 is " + pointerOne + " 2 is " + pointerTwo);
                System.out.println("true");
                return true;
                
            }
        }
    
        return false;
    }
}