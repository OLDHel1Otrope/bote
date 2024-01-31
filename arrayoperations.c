#include <stdio.h>
void print(int *arr, int size);
void bubblesort(int *arr, int size);
void insertionsort(int *arr, int size);
void linearsearch(int *arr, int size, int key);
int binarysearchloop(int *arr, int size, int key);
int binarysearchrecurr(int *arr, int ln, int rn, int key);
int insertelement(int *arr, int size, int index);
int deleteelement(int *arr, int size, int index);
int main()
{
    int arr[1000];
    int size;
    int i;
    int choice, choice2;
    int state;
    int index, element;

    printf("Enter the size of the array \t");
    scanf("%d", &size);
    printf("Enter the elements of the array");
    for (i = 0; i < size; i++)
        scanf("%d", &arr[i]);
    printf("Given array is as follows:\n");
    for (i = 0; i < size; i++)
        printf("%d\t", arr[i]);

    // menu goes here
    do
    {
        printf("\nEnter the number of your prefferred choice\n1. Traversal\n2. Insertion\n3. Deletion\n4. Searching\n5. Sorting\n6. Exit");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            print(arr, size);
            break;
        case 2:
            printf("enter the index and the new element to be inserted ");
            scanf("%d%d", &index, &element);
            state = insert(arr, size, index, element);
            if (state == 1)
            {
                size++;
            }
            else
            {
                printf("Error in insertion");
            }
            break;
        case 3:
            printf("do you want to delete by the (1)index or (2)value?");
            scanf("%d", &choice2);
            switch (choice2)
            {
            case 1:
                break;
            case 2:
                break;
            }
            break;
        case 4:
            printf("enter the method you want to use for searching (1)Linear Search (2)Binary search ");
            scanf("%d", &choice2);
            switch (choice2)
            {
            case 1:
                break;
            case 2:
                break;
            }
            break;
        case 5:
            break;
        case 6:
            exit(0);
            break;
        }

    } while (1);
    return 0;
}
void print(int *arr, int size)
{
    int i = 0;
    printf("array is as follows:\n");
    for (i = 0; i < size; i++)
        printf("%d\t", arr[i]);
}

int insertelement(int *arr, int size, int index)
{
}
int deleteelement(int *arr, int size, int index)
{
}

void bubblesort(int *arr, int size)
{
    int i, j, temp, flag;
    for (i = 0; i < size - 1; i++)
    {
        flag = 0;

        for (j = 0; j < size - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                flag = 1;
                temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
        if (flag == 1)
            break;
    }
}

void insertionsort(int *arr, int size)
{
    int i, temp, j;
    for (i = 1; i < size; i++)
    {
        temp = arr[i];
        j = i - 1;

        while (arr[j] > temp && j > -1)
        {

            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
}

void linearsearch(int *arr, int size, int key)
{
    int i;
    int flag = 0;
    for (i = 0; i < size; i++)
    {
        if (arr[i] == key)
        {
            if (flag == 0)
                printf("element found at index: ");
            flag = 1;
            printf("\t%d", &i);
        }
    }
}

int binarysearchloop(int *arr, int size, int key)
{
    int ln = 0;
    int rn = size - 1;
    int mid = ln + (rn - ln) / 2;
    while (ln < rn)
    {
        if (ln == rn && arr[mid] != key)
            return -1;
        else if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            rn = mid - 1;
        else if (arr[mid] < key)
            ln = mid + 1;
        int mid = ln + (rn - ln) / 2;
    }
}

int binarysearchrecurr(int *arr, int ln, int rn, int key)
{
    int mid = ln + (rn - ln) / 2;
    if (arr[mid] == key)
        return mid;
    else if (ln > rn)
        return -1;
    else if (ln == rn && arr[mid] != key)
        return -1;
    else if (arr[mid] > key)
        return binarysearchrecurr(arr, ln, mid - 1, key);
    else
        return binarysearchrecurr(arr, mid + 1, rn, key);
}
