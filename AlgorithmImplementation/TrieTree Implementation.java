class TrieNode {
    	Map<Character, TrieNode> children;
    	boolean isWord;

    	public TrieNode {
    		children = new HashMap<Character, TrieNode>();
    		isWord = false;
    	}
    }

class TrieTree {
    TrieNode root;
    
    public TrieTree() {
   		root = new TrieNode();
   	}

    public void insert(String word) {
   		TrieNode curt = root;
   		for (char c : word.toCharArray()) {
   			if (!curt.children.containsKey(c)) {
   				TrieNode newNode = new TrieNode();
   				curt.children.put(c, newNode);
   			}
   			curt = curt.children.get(c);
   		}
   		curt.isWord = true;
   	}
}