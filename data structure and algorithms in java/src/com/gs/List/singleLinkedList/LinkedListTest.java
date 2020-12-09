package com.gs.List.singleLinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

     /*   linkedList.addFirst("Sarwar1");
        linkedList.addFirst("Sarwar2");
        linkedList.addFirst("Sarwar3");
        linkedList.addFirst("Sarwar4");*/
      /*  linkedList.addLast1("sarwar1");
        linkedList.addLast1("sarwar2");
        linkedList.addLast1("sarwar3");
        linkedList.addLast1("sarwar4");
*/
        linkedList.addLastWithTailPointer("sarwar4");
        linkedList.addFirstWithTailPointer("sarwar");
        linkedList.addLastWithTailPointer("sarwar1");
        linkedList.addLastWithTailPointer("sarwar2");
        linkedList.addFirstWithTailPointer("sarwar0");
        linkedList.addLastWithTailPointer("sarwar3");
        linkedList.printList();
        Object o = linkedList.removeFirst();
        System.out.println(o);
        System.out.println(linkedList.size());
        linkedList.printList();
        System.out.println("remove last  ");
        Object removeLast = linkedList.removeLast();
        System.out.println(removeLast);
    }
}
