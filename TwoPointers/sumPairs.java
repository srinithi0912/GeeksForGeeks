/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        Node lastNode = getCount(head);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        while(head.data < lastNode.data){
            if(head.data + lastNode.data < target){
                head = head.next;
            }
            else if(head.data + lastNode.data > target){
                lastNode = lastNode.prev;
            }
            else{
                ArrayList<Integer> t = new ArrayList<>();
                t.add(head.data);
                t.add(lastNode.data);
                arr.add(t);
                head = head.next;
                lastNode = lastNode.prev;
            }
        }
        return arr;
    }
    public static Node getCount(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
}
