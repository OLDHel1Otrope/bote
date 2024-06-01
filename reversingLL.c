//traversing and saving each element into a new position, this will generate a new address for everything
while (start != null)
    {
        prevtemp = temp;
        temp=createNode(start->next,prevtemp);
        start=start->next;
    }

//better way through traversal
whiile(current!=NULL){
  next=current->next;
  current->next=next;
  prev=current;
  current=next;
}

//using recursion
node* reverseRecursive(node *head){
  if(head==null||head->next==null) return head;
  node *rest=reverseRecursive(head->next);
  head->next->next=head;
  head->next=NULL;
  return rest;
}

//using stack
//using array
  
