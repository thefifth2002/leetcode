package implementTrie_208;

public class Trie {
  private Node root;
  /** Initialize your data structure here. */
  public Trie() {
    root = new Node();
  }

  /** Inserts a word into the trie. */
  public void insert(String word) {
    Node r = root;
    for(int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (r.children[c - 'a'] == null) {
        r.children[c - 'a'] = new Node();
      }
      r = r.children[c - 'a'];
    }
    r.isWord = true;
  }

  /** Returns if the word is in the trie. */
  public boolean search(String word) {
    Node r = root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (r.children[c - 'a'] == null) {
        return false;
      }
      r = r.children[c - 'a'];
    }
    return r.isWord;
  }

  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) {
    Node r = root;
    for (int i = 0; i < prefix.length(); i++) {
      char c = prefix.charAt(i);
      if (r.children[c - 'a'] == null) {
        return false;
      }
      r = r.children[c - 'a'];
    }
    return true;
  }

}
