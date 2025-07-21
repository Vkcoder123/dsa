public class circularlinklist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static void main(String[] args) {
        Node firstNode = new Node(3);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(13);
        Node fourthNode = new Node(2);


        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next=firstNode;

        Node currentNode = firstNode;
        Node startNode =firstNode;
        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.next;

        while (currentNode != startNode) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("...");  // Indicating the list loops

    }
}
