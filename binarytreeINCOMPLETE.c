#include<stdio.h>
#include<stdlib.h>

typedef struct node{
    struct node* left;
    struct node* right;
    int data;
} node;
node *root = NULL;
node *temp=NULL;

node *createnode(int a){
    node *newn = (node*)malloc(sizeof(node));
    newn->data = a;
    newn->left = NULL;
    newn->right = NULL;
    return newn;
}

void push(int a){
    if(a<=temp->data){
        if(temp->left==NULL){
            temp->left = createnode(a);
        }
        else {
            temp=temp->left;
            push(a);
        }
    }
    else{
        if(temp->right==NULL){
            temp->right=createnode(a);
        }
        else{
            temp=temp->right;
            push(a);
        }
    }
}

void insert(int a){
    temp=root;
    if(root==NULL){
        root=createnode(a);
    }
    else{
        push(a);
    }
}

void printinorder(node * roott){
    if(roott==NULL)return;
    printinorder(roott->left);
    printf("%d ",roott->data);
    printinorder(roott->right);
}


void printPreorder(node *roott){
    if(roott == NULL) return;
    printf("%d ", roott->data);
    printPreorder(roott->left);
    printPreorder(roott->right);
}

void printPostorder(node *roott){
    if(roott == NULL) return;
    printPreorder(roott->left);
    printPreorder(roott->right);
    printf("%d ", roott->data);
}

int lengthoftree(node *x){
    if(x==NULL) return 0;
    int leftL=lengthoftree(x->left);
    int rightL=lengthoftree(x->right);
    return 1+ max(leftL,rightL);
}

int balanceVector(node *x){
    return lengthoftree(x->left)-lengthoftree(x->right);
}

void balanceNodes(node *x){
    if(){
}

void delete(int val){
    if(root==NULL)
};
void search(){

}


int main(){
    while(1){
        printf("enter the operation you want to perform, -1 to exit program\n");
        printf("1.insert\n");
        printf("2.delete\n");
        printf("3.search\n");
        printf("4.find maximum\n");
        printf("5.find minimum\n");
        printf("6.traversal\n");
        printf("7. balance nodes (avl rotations)");
        int a;
        scanf("%d",&a);
        switch(a){
            case 1:{
                while(1){
                    printf("enter the value to be inserted(-1 for exiting)");
                    int a;
                    scanf("%d",&a);
                    if(a==-1){
                        break;
                    }
                    insert(a);
                }
            }
            break;
            case 2:{
                printf("enter the value to be deleted");
                int a;
                scanf("%d",&a);
                delete(a);
            }
            break;
            case 3:{
                }
            break;
            case 4:{

            }
            break;
            }
        
    }
    printf("Inorder traversal:\n");
    printinorder(root);

    printf("\nPreorder traversal:\n");
    printPreorder(root);

    return 0;
}
