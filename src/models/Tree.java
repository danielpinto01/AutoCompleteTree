package models;

public class Tree {

	private Node rootTree;
	
	public Tree() {
		rootTree = new Node("init");
	}
	
	public void addToTree(String word, Node actual) {
		if (!word.isEmpty()) {
			if (!actual.searchWord(word.substring(0,1))) {
				Node newNode = new Node(word.substring(0,1));
				actual.addNode(newNode);
				addToTree(word.substring(1, word.length()), newNode);
				System.out.println(newNode.getInformation());
			}else {
				addToTree(word.substring(1,word.length()), actual.getWord(word.substring(0,1)));
			}
		}
	}
	
	public Node getRootTree() {
		return rootTree;
	}
}
