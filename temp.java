// import java.util.*;
// import java.io.*;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
};

class linkedList {
    private node head;

    linkedList() {
        this.head = null;
    }

    public void insertEnd(int value) {
        node newNode = new node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

}

public class temp {

    public static void main(String[] args) {

        linkedList li = new linkedList();
        li.insertEnd(1);
        li.insertEnd(2);
        li.insertEnd(3);
        li.insertEnd(4);
        li.insertEnd(5);
        li.display();
    }
}
