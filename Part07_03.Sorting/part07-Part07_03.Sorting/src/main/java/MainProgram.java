
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] Array) {
        int smallest = Array[0];
        for (int x : Array) {
            if (Array[x] < smallest) {
                smallest = Array[x];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] Array) {
        int smallest = Array[0];
        int index = 0;
        
        for (int x : Array) {
            if (Array[x] < smallest) {
                smallest = Array[x];
                index = x;
            }
        }
        return index;
    } 
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[index];
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
