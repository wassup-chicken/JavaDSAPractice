package src.com.wassupchicken.dsalgo.array;

public class ArrayExample {

    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5]; // default values 0 for int and dependent on dataType // indexes would be 0 1 2 3 4
        //printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 4;
        myArray[3] = 7;
        myArray[4] = 10;
//        printArray(myArray);
        int[] myArray2 = {1, 2, 3, 4, 5, 6, 7};
//        printArray(myArray2);

    }

    int[] removeEven(int[] arr) {
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }

        return result;
    }

    public void reverseArrayForLoop(int numbers[]) {

        int[] reversed = new int[numbers.length];
        int idx = 0;
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            reversed[idx] = numbers[i];
            idx++;
        }

        printArray(reversed);
    }

    public void reverseArrayWhile(int numbers[], int start, int end) {
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    void moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=0 && arr[j] == 0) { //perform swapping , i focuses on non zero elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j] != 0) {//move to the next zeroth index;
                j++;
            }
        }
    }

    int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    // Q: Given an array of n-1 distinct numbers in the range of 1 to n. Find the missing number in it.
    // find in o(n) complexity;
    public int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        //instantiate an object of this class
        ArrayExample newAr = new ArrayExample();

        newAr.arrayDemo();

        int[] someArray = {1, 2, 3, 5, 6, 7, 8, 9};

        System.out.println(someArray);


    }
}
