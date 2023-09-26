#include<iostream>
using namespace std;
int main(){
    int arr[10]={10,4,3,17,21,9,36,78,56,20};
    int temp;
    int size=10;

    for(int i=0;i<size;i++){
        cout<<arr[i]<<"\t";
    }

    cout<<endl;

    for(int i=0;i<size+1;i++){
        for(int j=0;j<size+1-i;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    
    for(int i=0;i<size;i++){
        cout<<arr[i]<<"\t";
    }
    
}
//no idea how to pass the entire array

/*void bubblesort(int arr[],int size){
    int temp;
    for(int i=0;i<size+1;i++){
        for(int j=0;j<size+1-i;j++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}*/