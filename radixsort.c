#include <stdio.h>
void countingsort(int arr[], int n, int place);
int main()
{
    int x[100];
    int size;
    printf("enter the size of the array");
    scanf("%d", &size);
    int i;
    for (i = 0; i < size; i++)scanf("%d", &x[i]);
    int max = x[0];
    for (i = 0; i < size; i++)if (x[i] > max)max = x[i];
    int p=1;
    while ( max / p){
        countingsort(x, size, p);
        p *= 10;
    }
    for(i=0;i<size;i++)printf("%d\t",x[i]);
    return 0;
}

void countingsort(int arr[], int n, int place)
{
    int i = 0;
    int count[10];
    int arx[n];
    for (i = 0; i < 10; i++)count[i] = 0; //making all the elements of the count to zero
    for (i = 0; i < n; i++)count[(arr[i] / place) % 10]++; //filling up the count array with the number of occurances
    for (i = 1; i < 10; i++)count[i] += count[i - 1]; //finding culmunative count
    for (i = 0; i < n; i++)arx[i] = 0;//making all the elements of arx to zero
    for (i = n - 1; i >= 0; i--){arx[count[((arr[i]/place)%10)]-1]=arr[i]; count[((arr[i]/place)%10)]--;}//finding the correct place for the current radix
    for (i = 0; i < n; i++)arr[i]=arx[i];//copying the array0
}
