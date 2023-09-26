

public class LngstWrdwithAllPref {
    static class Node {
    Node[] children;
    boolean eow;

    public Node() {
        children = new Node[26];
        for (int i = 0; i < children.length; i++) {
            children[i] = null;
        }
        eow = false;
    }
}

static Node root = new Node();

// INSERTION
public static void insert(String word) {
    Node curr = root;
    for (int i = 0; i < word.length(); i++) {
        int indx = word.charAt(i) - 'a';
        if (curr.children[indx] == null) {
            // add new node
            curr.children[indx] = new Node();
        }
        if (i == word.length() - 1) {
            curr.children[indx].eow = true;
        }
        // update root
        curr = curr.children[indx];
    }

}

// SERCH OF WORD

public static boolean search(String key) {
    Node curr = root;
    for (int i = 0; i < key.length(); i++) {
        int indx = key.charAt(i) - 'a';
        Node node = curr.children[indx];

        if (node == null) {
            return false;
        }
        if (i == key.length() - 1 && node.eow == false) {
            return false;
        }
        curr = node;
    }

    return true;
}
// Start with Approach

public static boolean startWith(String prefix) {

    Node curr = root;
    for (int i = 0; i < prefix.length(); i++) {
        int indx = prefix.charAt(i) - 'a';

        if (curr.children[indx] == null) {
            return false;
        }
        curr = curr.children[indx];
    }
    return true;

}

public static int countNode(Node root){
if(root == null){
    return 0;
}
int count =0;
for (int i = 0; i < 26; i++) {
    count += countNode(root.children[i]); 
}
return count+1;
}
public static String ans="";
public static void longestword(Node root,StringBuilder temp){
    if(root==null){
        return;
    }

    for (int i = 0; i <26; i++) {
        if(root.children[i] != null && root.children[i].eow == true){
            temp.append((char)(i+'a'));
            if(temp.length()>ans.length()){
                ans=temp.toString();
            }
            longestword(root.children[i], temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }





}

public static void main(String[] args) {
    String words[] ={"a","banana","app","appl","ap","apply","apple"};
    for (int i = 0; i < words.length; i++) {
        insert(words[i]);
    }
    longestword(root, new StringBuilder(""));
System.out.println(ans);

}
}
