public class binarySearch {
    //Binary search
    //increasing or decreasing order
    //item to serach
     public static int Binary(int arr2[],int beg,int end,int item ){
        if(end>=beg){
            int mid=beg+(end-1)/2;
            if(arr2[mid]==item)
                return mid;
            if (arr2[mid]>item)
                return Binary(arr2,beg,mid-1,item);

            return Binary(arr2,mid+1,end,item);

        }
        return -1;

    }
    public static void main(String[] args) {
        int arrayofBin[]={ 1,2,3,56,67,89,90,92};
        int n=arrayofBin.length;
        int item1=90;
        int result2=Binary(arrayofBin,0,n-1,item1);
        if(result2 == -1){
            System.out.println("searched element not found");
        }
        else{
            System.out.println("found in the index "+result2);
        }
    }
}
