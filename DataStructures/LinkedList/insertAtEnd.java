package LinkedList;

public class insertAtEnd {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    node head;
    void add(int data){
        node toAdd=new node(data);
        if(isEmpty()){
          head=toAdd;
        }
        else
        {
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=toAdd;
            toAdd.next=null;
        }
    }
    Boolean isEmpty(){
        return head==null;
    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void insertEnd(int data){
        node toAdd=new node(data);
        
        if(head.next==null){
            head.next=toAdd;
            toAdd.next=null;
        }
        else
        {
            node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
        toAdd.next=null;
        }
    }
    public static void main(String sp[]){
        insertAtEnd obj=new insertAtEnd();
        obj.add(12);
        obj.add(13);
        obj.print();
        System.out.println();
        obj.add(14);
        obj.print();
    }
}
