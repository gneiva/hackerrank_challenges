

    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
            List<SinglyLinkedListNode> nodes = new ArrayList<>();
            SinglyLinkedListNode currentNode = head;
            
           while (!nodes.contains(currentNode)) { 
                 nodes.add(currentNode);
                 if(currentNode.next != null){ 
                    currentNode = currentNode.next;
                 }else{
                     return false;
                 }
            };
            return true;
    }
    
