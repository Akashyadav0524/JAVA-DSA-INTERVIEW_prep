public class Main {

    static class Node{
        Node[] children;
        boolean eow;
        public Node() {
            children=new Node[26];
            for (int i = 0; i < children.length; i++) {
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
//INSERTION
    public static void insert(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int indx=word.charAt(i)-'a';
            if(curr.children[indx]==null){
                //add new node
                curr.children[indx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[indx].eow=true;
            }
            //update root
            curr=curr.children[indx];
        }
      
    }

//SERCH OF WORD

public static boolean search(String key){
    Node curr=root;
    for (int i = 0; i < key.length(); i++) {
        int indx =key.charAt(i)-'a';
        Node node =curr.children[indx];

        if(node==null){
            return false;
        }
        if(i==key.length()-1 && node.eow==false){
            return false;
        }
        curr=node;
    }

    return true;
}







    public static void main(String[] args) {
        String words[]={"the","a","there","their","any"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("their"));//true
        System.out.println(search("akash"));//false
        System.out.println(search("an"));//false
        System.out.println(search("any"));//true
    }
}
