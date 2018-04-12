package models;

import java.util.ArrayList;

public class Node {
	
	private String information;
	private ArrayList<Node> nodes;
	
	public Node(String information) {
		this.information = information;
		nodes = new ArrayList<>();
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

	@Override
	public String toString() {
		return "Node [information=" + information + ", nodes=" + nodes + "]";
	}
}