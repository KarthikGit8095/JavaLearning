public class Linear {
    //Linear Search
    //any order
    //key value is given for the search
    public static int search(int arr[],int x){
        int n= arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={10,50,30,70,60,20,90,30};
        int ite =20;
        int result = search(arr,ite);
        if (result==-1)
        {
            System.out.println("element is not present in arry");
        }
        else{
            System.out.println("element is present at the index"+result);
        }



    }


}
