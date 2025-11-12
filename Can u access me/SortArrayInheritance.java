import java.util.Scanner;

class Numbers {
    int[] arr;
    int n;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class SortArray extends Numbers {
    void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class SortArrayInheritance {
    public static void main(String[] args) {
        SortArray s = new SortArray();
        s.getInput();
        System.out.println("Before Sorting:");
        s.display();

        s.sort();

        System.out.println("After Sorting:");
        s.display();
    }
}
