/*C program for a Stack using Linked Lists
We implement Stack using a linked list. Stack follows a FIFO principle. Thus we
maintain a head pointer. When a new element is pushed, it is added at the
beginning of the linked list. When the Stack is popped, the first element of
the linked list is removed.*/

#include <stdio.h>
#include <stdlib.h>


/*Structure for a linked list node*/
struct Node{
    int data;
    struct Node *next;
};

struct Node *head = NULL;

/*Function to push an element into the stack*/
void push(data){
    struct Node *temp;
    temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data=data;
    temp->next = head;
    head=temp;
    return;
}

/*Function to pop an element from the stack*/
void pop(){
    int popped;
    if (head==NULL){
        //If the stack is empty
        printf("Stack is empty.\n");    
    }
    else{
        printf("Popped element: %d \n",head->data);
        head = head->next;
    }

}
