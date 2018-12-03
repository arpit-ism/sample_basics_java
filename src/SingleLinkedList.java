import com.sun.istack.internal.NotNull;

class Node1{
        Integer value;
        String text;
        Node1 nextNode;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Node1(Integer value,String text) {
            this.value = value;
            this.text = text;
        }

        public Node1 getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node1 nextNode) {
            this.nextNode = nextNode;
        }
        /*public static void main(String[] args){
            Node1 objNode1 = new Node1(5,"firstnode");
            Node1 nextNode = new Node1(10, "innernode");
            nextNode.setNextNode(new Node1(100, "innermost"));
            objNode1.setNextNode(nextNode);
            System.out.println(objNode1.getText());
            System.out.println(objNode1.getValue());
            System.out.println(objNode1.getNextNode());
            System.out.println(objNode1.getNextNode().getNextNode().getText());
            System.out.println(objNode1.getNextNode().getNextNode().getValue());
            Node objNode2 = new Node(6,"secondNode");
            objNode1.getNextNode();

        }*/

}

public class SingleLinkedList{
    Node1 startNode;

    public SingleLinkedList() {
        this.startNode = null;
    }

    public static void addNode(SingleLinkedList linkedList,Node1 addThisNode){
        if(linkedList.startNode==null){
            linkedList.startNode = addThisNode;
            linkedList.startNode.setNextNode(null);
        }
        else {
            Node1 traverseNode = linkedList.startNode;
            while(traverseNode.getNextNode()!=null){
                traverseNode = traverseNode.nextNode;
            }
            traverseNode.setNextNode(addThisNode);
        }
    }

    public static void deleteNode(SingleLinkedList linkedList,Node1 delThisNode){
        if(delThisNode==null)return;
        if(linkedList.startNode.getValue()==delThisNode.getValue() && linkedList.startNode.getValue()==delThisNode.getValue()){
            linkedList.startNode = linkedList.startNode.nextNode;
            //System.out.println("ifhere");
        }
        Node1 traverseNode = linkedList.startNode;
        while(traverseNode.getNextNode()!=null){
            if(traverseNode.nextNode.getText()==delThisNode.getText() && traverseNode.nextNode.getValue()==delThisNode.getValue()){
                traverseNode.nextNode = traverseNode.nextNode.nextNode;
                break;
            }
            traverseNode = traverseNode.getNextNode();
            //System.out.println("whilehere");
        }
    }

    public static void getNode(SingleLinkedList linkedList,int indx){
        int ite = 0;
        Node1 traverseNode = linkedList.startNode;
        while(traverseNode!=null){
            if(ite == indx){
                System.out.println(traverseNode.getValue());
                System.out.println(traverseNode.getText());
                break;
            }
            traverseNode = traverseNode.getNextNode();
            ite++;
        }

    }

    public static void printSingleLinkedList(SingleLinkedList linkedList){
        Node1 traverseNode = linkedList.startNode;
        while (traverseNode.getNextNode()!=null){
            System.out.println(traverseNode.getValue());
            System.out.println(traverseNode.getText());
            traverseNode = traverseNode.getNextNode();
        }
        System.out.println(traverseNode.getValue());
        System.out.println(traverseNode.getText());
        System.out.println("");
    }

    public static void main(String[] args){
        SingleLinkedList newList = new SingleLinkedList();
        newList.addNode(newList,new Node1(1,"firstnode"));
        printSingleLinkedList(newList);
        newList.addNode(newList,new Node1(2,"secondnode"));
        printSingleLinkedList(newList);

        newList.addNode(newList,new Node1(3,"thirdnode"));
        newList.addNode(newList,new Node1(4,"fourthnode"));
        //printSingleLinkedList(newList);
        deleteNode(newList,new Node1(2,"secondnode"));

        deleteNode(newList,new Node1(1,"firstnode"));
        printSingleLinkedList(newList);
        getNode(newList,1);

    }

}


