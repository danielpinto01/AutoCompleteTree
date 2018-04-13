package models;

import java.util.ArrayList;

public class Node {
	
	private String information;
	private int utilityLetter;
	private ArrayList<Node> nodes;
	
	public Node(String information) {
		this.information = information;
		utilityLetter = 0;
		nodes = new ArrayList<>();
	}
	
	public void addNode(Node actual) {
//		utilityLetter++;
		nodes.add(actual);
//		System.out.println(utilityLetter);
	}
	
	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	
	public boolean searchWord(String letter) {
		for (Node node : nodes) {
			if (node.getInformation().equals(letter)) {
				return true;
			}
		}
		return false;
	}
	
	public Node getWord(String letter) {
		for (Node node : nodes) {
			if (node.getInformation().equals(letter)) {
				return node;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return information;
	}
}