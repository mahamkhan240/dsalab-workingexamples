public class Mainn {

    static int findElement(int arr[],int n, int key){
        for(int i=0;i<10;i++)
        if(arr[i]==key)
            return i;
        return -1;
    }
    public static void main(String args[]){
        int arr[]={12,34,10,6,40};
        int n=arr.length;
        int key=40;
        int position=findElement(arr,n,key);

        if(position==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at position:"+(position+1));
    }
}
