package tries;

public class TrieMain {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("this");
        t.add("news");
        System.out.println(t.search("new"));
    }
}
