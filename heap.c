#include<stdio.h>

void swap(int *a, int *b){
    int temp=*a;
    *a = *b;
    *b = temp;
}

void maxheapify(int arr[],int size,int i ){
    int largest=i;
    int left=2*i+1;
    int right=2*i+2;

    if(left<size&&arr[left]>arr[largest]) largest=left;
    if(right<size&&arr[right]>arr[largest]) largest=right;
    if(largest!=i){
        swap(&arr[i],&arr[largest]);
        maxheapify(arr,size,largest);
    }
}

void printHeap(int a[],int size){
    int j,i=1;
    int count=0;
    while(i<size){
        for(j=0;j<i&&count<size;j++){
            printf("%d ", a[count++]);
        }
        printf("\n");
        i=i*2;
    }
}

void printArray(int arr[], int size){
    int i;
    for(i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}

void heapSort(int arr[],int size){
    int i;
    for(i=size;i>=1;i--){
        swap(&arr[0],&arr[i-1]);
        maxheapify(arr,i-1,0);
    }
}

int main(){
    int arr[100];
    int heap[100];
    int i;
    printf("enter the size of the heap\n");
    int size;
    scanf("%d",&size);
    printf("enter the elements in the array which need to be inserted in the heap\n");
    for(i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printHeap(arr,size);
    maxheapify(arr,size,0);
    printf("the heap is\n\n");
    printHeap(arr,size);
    return 0;
}
