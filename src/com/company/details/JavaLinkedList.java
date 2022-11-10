package com.company.details;
public class JavaLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
        public void addFirst(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void addLast(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        public void deleteFirst(){
            if (head == null){
                System.out.println("List is empty");
                return;
            }
            head = head.next;
        }
        public void deleteLast(){
            if (head == null){
                System.out.println("List is empty.");
                return;
            }
            if (head.next == null){
                head = null;
                return;
            }
            Node secodLast = head;
            Node lastNode = head.next;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secodLast = secodLast.next;
            }
            secodLast.next = null;
        }
        public void printList(){
            if (head == null){
                System.out.println("List is empty.");
                return;
            }
            Node currNode = head;
            while (currNode != null){
                System.out.print(currNode.data+"->");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }
    public static void main(String[] args){
        JavaLinkedList  list = new JavaLinkedList();
        list.addFirst(70);
        list.printList();
//        list.addFirst(30);
        list.addFirst(56);
        list.printList();

        list.addFirst(30);
        list.printList();
    }
}