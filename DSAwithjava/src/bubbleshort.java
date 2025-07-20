public class bubbleshort {
    public static void main (String[] args){
        int [] array={23,43,24,56,75,34,45};
        int n=array.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int x=array[j];
                    array[j]=array[j+1];
                    array[j+1]=x;

                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
