package tries;

public class TrieNode {
    char data;
    TrieNode[] children;
    boolean isTerminating;
    int childCount;
    public TrieNode(char data){
        this.data = data;
        children = new TrieNode[26];
        isTerminating = false;
        childCount = 0;
    }
}

class Trie{
    private final TrieNode root;
    public Trie(){
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word){
        if(word.length()==0){
            root.isTerminating = true;
            return;
        }

        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    //search
    private boolean search(TrieNode root, String word){
        if(word.length()==0){
            return root.isTerminating;
        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return search(child, word.substring(1));
    }

    //remove word
    private void remove(TrieNode root, String word){
        if(word.length()==0){
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return;
        }
        remove(child, word.substring(1));
        if(!child.isTerminating && child.childCount==0){
            root.children[childIndex]=null;
            child = null;
            root.childCount--;
        }
    }

    //add in trie
    public void add(String word){
        add(root, word);
    }

    //search word in trie
    public boolean search(String word){
        return search(root, word);
    }

    //delete word
    public void remove(String word){
        remove(root, word);
    }

}
