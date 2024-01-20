import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
//        int[] arr = {4, 7, 9, 0, 263, 98, 873, 999};
//        int[] arr1 = {4, 5, 7, 8};
//        int[] arr2 = {4, 5, 7, 8, 8, 4, 5, 7};
//
//        System.out.println("for the function find missing int :" + " " + findMissingInt(arr1));
//        System.out.println("for the function second max value :" + " " + secondMaxValue(arr));
//        System.out.println("for the function second max value :" + " " + secondMaxValue(arr2));
//        System.out.println("for the function contain the same element :" + " " + containsTheSameElements(arr1, arr2));
//        System.out.println("for the function is sorted :" + " " + isSorted(arr));
//        System.out.println("for the function is sorted :" + " " + isSorted(arr1));
//        System.out.println("for the function is sorted :" + " " + isSorted(arr2));


    }

    // function to find the missing number in a suit of integer number
    public static int findMissingInt(int[] array) {
        // Write your code here:
        // we're assuming  n is greater of equal to 1
        int miss = 0;
        int count = 0;
        while (count < array.length){
            for (int i = 0; i < array.length; i++){
                if (miss == array[i]){
                    miss++;
                }
            }
        count++;
        }
        return miss;
    }

       // function to get the second max value in an array of integers
        public static int secondMaxValue ( int[] array){
            // Write your code here:
            //linoy feedback: what is set do ? not clear from the name what this function does. Does this func have a return value? 
            set(array);
            sorted(array);
            //linoy feedback: in one line you could write: return array[array.length - 2]
            int res = array[array.length - 2];

            return res;

        }

        // function to know if two array contains the same element
        public static boolean containsTheSameElements ( int[] array1, int[] array2){
            // Write your code here:
            boolean same = false;
            for(int i = 0; i < array1.length; i++){
                for(int j = 0; j < array2.length; j++){
                    if(array1[i] == array2[j]) {
                         //linoy feedback: when same== true, you continue running into the loop without target (waste of complexity)! to improve use: continue.
                        same = true;
                        //linoy feedback: here add continue. it will skip the first for loop if he finds the same element.
                    }
                }
                if (same == false){
                    return false;
                }
                same = false;
            }
            return true;

        }

    //linoy feedback: great function!!!
        // function to know if array is sorted in ascending sort or decreasing sort
        public static boolean isSorted ( int[] array){
            // Write your code here:
            if (isAscendingSorted(array) == true || isDecreasingSorted(array) == true) {
                return true;
            }
            return false;
        }
        // function to know if  array is ascending sort
        public static boolean isAscendingSorted ( int[] array){
            // Write your code here:
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
            return true;
        }
        // function to sort an array
        public static void sorted ( int[] array){
        // Write your code here:
        set(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
       }

       // function to know if  array is ascending sort
        public static boolean isDecreasingSorted ( int[] array){
            // Write your code here:
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
            return true;
        }
        public static boolean contains ( int[] array, int value, int index){
            for (int i = 0; i < index; i++) {
                if (array[i] == value) {
                    return true;
                }
            }
            return false;
        }

        public static int countUnique ( int[] array){
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                count = contains(array, array[i], i) ? count : count + 1;
            }
            return count;
        }

        public static int[] set ( int[] array){
            int[] res = new int[countUnique(array)];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (!contains(array, array[i], i)) {
                    res[index++] = array[i];
                }
            }
            return res;
        }

    }

