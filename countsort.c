#include<stdio.h>
int main(){
    int size,i,max;
    printf("enter the size of the array");
    scanf("%d",&size);//size of the array
    int arr[size];
    int arr2[size];
    for(i=0;i<size;i++)scanf("%d",&arr[i]);//input the elements to the array
    max=arr[0];
    for(i=1;i<size;i++){if(max<arr[i])max=arr[i];}//finding the maximum element in the array
    int count[max+1];//creating a new array  with size equal to the maximum number plus one
    for(i=0;i<max+1;i++)count[i]=0;//making each element of the count equal to zero
    for(i=0;i<size;i++)count[arr[i]]++;//traverse through the array and increase the count of that element
    for(i=1;i<max+1;i++)count[i]+=count[i-1];//calculating the culmunative count by ading the previous elements
    for(i=size-1;i>=0;i--){arr2[count[arr[i]]-1]=arr[i];count[arr[i]]--;}//placing the elements according to their counts in desc
    for(i=0;i<size;i++)arr[i]=arr2[i];//copying the elements of the arr2 to arr
    for(i=0;i<size;i++)printf("\t%d",arr[i]);
    printf("\n");
    for(i=0;i<max+1;i++)printf("%d \t",count[i]);
}
