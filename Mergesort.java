public class Mergesort {

    //also called divide and conqor
    static void merge(int arr[], int beg, int mid, int end){
        int n1=(mid-beg)+1; //this will be the size for out new left side array
        int n2=end -mid;// similarly this will be our size for right array
        int begrr[]=new int[n1]; //inistializing array for storing vlaues
        int endrr[]=new int [n2];// inistializing array for stroting vlaues

        for(int x=0;x<n1;x++){
            begrr[x]=arr[beg+x]; // values stored from beggining to mid
        }
        for(int x=0;x<n2;x++){
            endrr[x]=arr[mid+1+x]; //value stored from mid to end
        }
        int i=0;
        int j=0;
        int k=beg;

        while(i<n1 && j<n2){
            if(begrr[i]<=endrr[j]){
                arr[k]=begrr[i];
                i++;
            }
            else{
                arr[k]=endrr[j];
                j++;
            }
            k++;

        }
        while(i<n1){
            arr[k]=begrr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=endrr[j];
            j++;
            k++;
        }



    }
    static void sort(int arr[],int beg,int end){
        if(beg<end){
            //find the middle point
            int mid=(beg+end)/2;


            //sort the first and second half
            sort(arr,beg,mid);
            sort(arr,mid+1,end);

            //merge the divided and compared value
            merge(arr,beg,mid,end);
        }
    }
    static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={12,11,13,5,6,7};
        System.out.println("given array");
        printarr(arr);

        System.out.println("after sorting");
        sort(arr,0,arr.length-1);
        printarr(arr);



    }
}
