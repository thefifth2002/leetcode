package implementTrie_208;

public class Node {
  public char c;
  public boolean isWord;
  public Node[] children = new Node[26];
  public Node() {}
}
