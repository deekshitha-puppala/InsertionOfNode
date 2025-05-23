class Node
{
    int data;
    Node next;
}
public class LinkedList {
    Node head;

// Insert  data at the end
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head == null) 
        {
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    
//Insert data at starting of Node
public void insertAtStart(int data) {
   Node node = new Node();
        node.data = data;
        node.next = null;
    
        node.next = head;
        head = node;
}

//Insert the node at any location
public void InsertAt(int index,int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;
    
    
    Node n = head;
    if(index == 0) {
        
        insertAtStart(data);
        
    } else {
    //At which pos we want add Node
    for(int i=0;i<index-1;i++)
    {
        n = n.next;
    }
    node.next = n.next;
    n.next = node;
}

}
    
    public void show() {
        Node n = head;
        while(n.next!=null) {
            System.out.println(n.data);
            n=n.next;
        }
         System.out.println(n.data);
    }

    public static void main(String args[]) {
        LinkedList  list = new LinkedList();
        list.insert(2);
        list.insert(56);
        list.insert(38);
        list.insertAtStart(98);
        list.InsertAt(2,23);
        
        list.show();
    }
}
