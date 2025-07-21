public class insertionsort {
    public static void main(String[] args) {
        int[] array = {12, 45, 6, 7, 89, 56, 45, 67, 80};
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minindex]) {
                    minindex = j;
                }
            }
            int minvalue = array[minindex];
            for (int l = minindex; l > i; l--) {
                array[l] = array[l - 1];
            }
            array[i]=minvalue;

        }
        System.out.println("sorted array:-");
        for (int k=0;k<n;k++){
            System.out.println(array[k]);
        }

    }



}