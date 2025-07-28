import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
    //     int a = 10, b = 20, c = 30;
    //     if (a >= b && a >= c) {
    //         System.out.println("Largest number is: " + a);
    //     } else if (b >= a && b >= c) {
    //         System.out.println("Largest number is: " + b);
    //     } else {
    //         System.out.println("Largest number is: " + c);
    //     }
    // } THIS IS BY IF ELSE
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = Sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number is: " + largest);
        Sc.close();
    
    }  //a rather simple code to find the largest number in an array using a for loop.

    
}
