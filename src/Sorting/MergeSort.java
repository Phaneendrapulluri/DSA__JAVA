package Sorting;

public class MergeSort {
    public static void merge(int[] A, int s, int m, int e){
        int p1=s, p2=m+1, p3=0;
        int temp[] = new int[e-s+1];
        while(p1<=m && p2<=e){
            if(A[p1]<=A[p2]){
                temp[p3]=A[p1];
                p1++;
                p3++;
            }
            else{
                temp[p3]=A[p2];
                p2++;
                p3++;
            }
        }
        while(p1<=m){
            temp[p3]=A[p1];
            p1++;
            p3++;
        }
        while(p2<=e){
            temp[p3]=A[p2];
            p2++;
            p3++;
        }
        for(int i=0;i<e-s+1;i++){
            A[s+i]=temp[i];
        }
    }
    public static void mergeSort(int[] A, int s, int e){
        if(s==e) return ;
        int m=(s+e)/2;
        mergeSort(A,s,m);
        mergeSort(A,m+1,e);
        merge(A,s,m,e);
    }
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
        mergeSort(arr,0,4);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
