//untested code
void arrangePoly(node *poly, int deg, int coeff)
{
    if (poly == NULL)
    { // if the nodelist is empty
        poly = createNode(deg, coeff);
    }
    else
    {
        node *temp = poly;
        node *tempPrev = NULL;

        if (deg < temp->degree)
        { // addition of the node at the beginning
            node *newNode = createNode(deg, coeff);
            newNode->next = temp;
            poly = newNode;
        }
        else
        { // addition of node at the sorted position
            while (temp->next != NULL && temp->next->degree < deg)
            {
                tempPrev = temp;
                temp = temp->next;
            }
            if (tempPrev->degree == deg) // checking if the degreee if same as some other preexisting node
                tempPrev->coefficient += coeff;
            else
            {
                node *newNode = createNode(deg, coeff);
                newNode->next = tempPrev->next;
                tempPrev->next = newNode;
            }
        }
    }
}
void ADDPoly(node *p1, node *p2)//works like two way merge
{
    node *temp1 = p1;
    node *temp2 = p2;
    node *temp3 = NULL; // used to keed the second last element of temp1 in case it goes to null
    // node *merged = NULL;  avoiding a third polynomial to avoid the creation of more nodes
    while (temp1 != NULL && temp2 == NULL)
    {
        temp3 = temp1;
        if (temp1->degree == temp2->degree)
        {
            temp1->coefficient += temp2->coefficient;
            temp2 = temp2->next;
        }
        if (temp1->degree > temp2->degree)
        { // adding the node from the second polynomial to the first
            node *tx = temp2->next;
            temp2->next = temp1->next;
            temp1->next = temp2;
            temp2 = tx;
        }
        if (temp1->degree < temp2->degree)
        {
            temp1 = temp1->next;
        }
    }
    if (temp1 == NULL)
    {
        temp3->next = temp2; // since all the elements are already sorted, no point of traversal
    }
    // if temp2 is null that means the addition is done and result has been stored in temp1
}
