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
//				System.out.println(newNode.getInformation());
			}else {
				Node aux =  actual.getWord(word.substring(0,1));
				aux.setUtilityLetter();
				addToTree(word.substring(1,word.length()), aux);
			}
		}
	}

	public Node getRootTree() {
		return rootTree;
	}
}
