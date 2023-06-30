public class LinkedList<E> implements List{


    private Node<E> head; //the only instance variable of the list
    private Node<E> tail;
    private int size;
    public LinkedList() {
        head = null; //the list starts off empty
        tail = null;
        size = 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    @Override
    public void addAtIndex(Object data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index should be"
                    + " between 0 and size");
        } else if (data == null) {
            throw new IllegalArgumentException("Data can't be null");
        }
        Node<E> tmp = (Node<E>) new Node<>(data);
        Node<E> current = head;
        if (size == 0) {
            head = tmp;
            head.setNext(head);
        } else if (index == 0) {
            tmp.setNext(head.getNext());
            tmp.setData(head.getData());
            head.setNext(tmp);
            head.setData((E) data);
        } else if (index == size) {
            while (current.getNext() != head) {
                current = current.getNext();
            }
            current.setNext(tmp);
            tmp.setNext(head);
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            tmp.setNext(current.getNext());
            current.setNext(tmp);
        }
        size++;
    }

    @Override
    public Object getAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index should be"
                    + " between 0 and size");
        } else if (index == 0) {
            return head.getData();
        } else {
            Node<E> tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.getNext();
            }
            return tmp.getData();
        }
    }

    @Override
    public Object removeAtIndex(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index should be"
                    + " between 0 and size");
        }

        E tmp;
        Node<E> current = head;
        if (index == 0) {
            tmp = head.getData();
            head.setData(head.getNext().getData());
            head.setNext(head.getNext().getNext());
        } else if (index == size) {
            while (current.getNext().getNext() != head) {
                current = current.getNext();
            }
            tmp = current.getNext().getData();
            current.setNext(head);
        } else {
            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }
            tmp = current.getNext().getData();
            current.setNext(current.getNext().getNext());
        }
        if (--size == 0) {
            head = null;
        }
        return tmp;
    }

    @Override
    public Object remove(Object data) {
        if (isEmpty()) {
            return null;
        }
       else if(data == null){
           return null;
        }
       else{
           Object o = null;
           for(int i = 1; i < size; i++){
               Node<E> current = head;
               if(current == data){
                   o = removeAtIndex(i);
               }
           }
           return o;
        }
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (head == null && tail == null); //the list is empty if head is null
    }

    @Override
    public int size() {
        return size;
    }

//    public void addToFront(E newData) {
//        head = new Node<E> (newData, head);
//        size += 1;
//    }
//
//    public void addToRear(E newData) {
//        Node<E> node = new Node<E> (newData, null);
//        Node<E> current = head;
//        if (isEmpty()) //point head to new node if list is empty
//            head = node;
//        else {
//            while (current.getNext() != null) { //the last node is the one with next = null
//                current = current.getNext();
//            }
//            current.setNext(node);
//            size += 1;
//        }
//    }
//
//    public String toString() {
//        Node<E> current = head; //traversal starts at the front
//        String result = ""; //result starts empty
//
//        while (current != null) { //keep going until there's no more nodes to point to
//            result = result + current.getData().toString() + "\n";
//            current = current.getNext(); //move over to next node
//        }
//        return result;
//    }
//
//    public boolean contains(E target) {
//        if (isEmpty()) { //empty lists can't contain the target
//            return false;
//        }
//
//        boolean found = false;
//        Node<E> current = head; //traversal starts at the front
//
//        while ((current != null) && (!found)) {
//            if (target.equals(current.getData())) {
//                found = true;
//            }
//            else {
//                current = current.getNext();
//            }
//        }
//        return found;
//    }
//
//    public E removeFromRear() {
//        E removedData;
//
//        if (isEmpty()) {
//            removedData = null;
//        }
//        else if (head.getNext() == null) {
//            removedData = head.getData();
//            head = null;
//            size -= 1;
//        }
//        else {
//            Node<E> current = head;
//            while (current.getNext().getNext() != null) {
//                current = current.getNext();
//            }
//            removedData = current.getNext().getData();
//            current.setNext(null);
//            size -= 1;
//        }
//
//        return removedData;
//    }
//
//    public E removeFromFront() {
//        if (isEmpty()) {
//            return null;
//        }
//
//        E removedData = head.getData();
//        head = head.getNext();
//        size -= 1;
//        return removedData;
//    }
//
//
//    public static void main(String[] args) {
//        LinkedList< String > favBabySongs = new LinkedList< >();
//        favBabySongs.addToFront("Humpty Dumpty");
//        favBabySongs.addToRear("Swing Low Sweet Chariot");
//        favBabySongs.addToFront("Itsy Bitsy Spider");
//        favBabySongs.addToRear("Twinkle, Twinkle Little Star");
//        favBabySongs.addToFront("Wheels on the Bus");
//        System.out.println(favBabySongs.toString());
//        favBabySongs.removeFromFront();
//        favBabySongs.removeFromRear();
//        System.out.println(favBabySongs.toString());
//        System.out.println(favBabySongs.contains("Humpty Dumpty"));
//        System.out.println(favBabySongs.contains("Baby Shark"));
//    }
}
