int middleElement(node *list)
{
    if (list == NULL)
        printf("the list is empty");
        return -1;
    else
    {
        node *fast = list;
        node *slow = list;
        while (fast->next != NULL && fast->next->next != NULL)
        {
            fast = fast->next->next;
            slow = slow->next;
        }
        return slow->data;
    }
}
