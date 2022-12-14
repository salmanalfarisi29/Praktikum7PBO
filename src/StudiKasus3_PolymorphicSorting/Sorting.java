package StudiKasus3_PolymorphicSorting;

public class Sorting {
    // Sorts the specified array of objects using the selection
    // sort algorithm.

    public static void selectionSort (Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++) {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;

        // Swap the values
            temp = list[min];

            list[min] = list[index];
            list[index] = temp;
        }
    }

	public static void insertionSort(Salesperson[] salesStaff) {
		// TODO Auto-generated method stub
		
	}

}
