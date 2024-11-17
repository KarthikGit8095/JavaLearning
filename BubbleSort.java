public class BubbleSort {

    void bubble(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
    }
    void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        BubbleSort ob=new BubbleSort();
        int arr[]={12,8,7,65,9,32,45,76,12,90,2};
        ob.bubble(arr);
        System.out.println("sorted array ");
        ob.printarr(arr);


    }
}
