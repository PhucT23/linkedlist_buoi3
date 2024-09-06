package mylinkedlist;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }
// 0
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        } else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()
    public int length(){
        int count = 0;
        if(head != null){
            Node temp = head;
            while(temp != null){
                count ++;
                temp = temp.next;
            }
        }
        return count;
    }
    
    public void display(){
        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getData() + " --> ");
                temp = temp.next;
            }
        }
        System.out.println("null");
    }
    
    public void deleteFirst(){
        if(head == null) 
            return;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null)
            return;
        // Nếu như linkedlist nó chỉ có 1 node
        if(head.next == null){
            deleteFirst();
        }
        Node temp = head; // temp làm nhiệm vụ tìm ra node cuối cùng để xoá
        Node previous = null; // Ghi lại node đứng trước temp
        while(temp.next != null){ // temp = 4
            previous = temp; // previous = 4
            temp = temp.next; // temp = 5
        }
        previous.next = null; 
    }
    // public void delete(int index){
    //     if(index == 0){
    //         deleteFirst();
    //         return;
    //     } else if(index == length()-1){
    //         deleteLast();
    //         return; 
    //     } else{
    //         Node preNodeDelete = head; // Tìm ra node tại vị trí index < vị trí muốn xoá>
    //         for (int i = 1; i < index; i++) {
    //             preNodeDelete = preNodeDelete.next;
    //         }
    //         preNodeDelete.next = preNodeDelete.next.next;
           
    //     }
    // }
    
    // BTVN1: Viết hàm delete theo while. Hint: dùng count++;

     public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        } else if(index == length()-1){
            deleteLast();
            return; 
        } else{
            Node preNodeDelete = head; // Tìm ra node tại vị trí index < vị trí muốn xoá>
            int count = 1;
           while ( count < index ){
            count ++;
            preNodeDelete = preNodeDelete.next;
           }
           preNodeDelete.next = preNodeDelete.next.next;
           
        }
    }
      
      /*
         * temp != null : Sử dụng khi các em muốn cầm tất cả các node trong
         * linkedlist đem ra xử lí, hay làm gì đó. Căn bản là câu lệnh này
         * sẽ bốc từ node đầu tiên đến khi nào kết thúc (temp = null)
         * 
         * temp.next != null: Sử dụng khi các em cần tìm ra cái nốt cuối cùng
         * và gán nó cho temp
         * 
         */    
    public boolean search(int data){
        if(head == null)
            return false;
        Node temp = head;
        while(temp != null){
            if(temp.getData() == data)
                return true;
        }
        return false;
    }

    public Node searchAtPosition(int index){
        if(index < 0 || index >= length())
            return null;
        Node temp = head;
        for (int i = 0; i <= index; i++) {
            temp = temp.next;
        }
        return temp;
    }

// BTVN2: Viết cho anh hàm sort()

// BTVN3: 


    public static void main(String[] args) {
       MyLinkedList linkedList = new MyLinkedList();
       linkedList.addFirst(1);
       linkedList.addFirst(2);
       linkedList.addFirst(3);
        //
       linkedList.addLast(1);
       linkedList.addLast(2);
       linkedList.addLast(3);
        //3 - 2 - 1 - 1->2->3
        linkedList.delete(4);
        linkedList.display();
        
    }

}
