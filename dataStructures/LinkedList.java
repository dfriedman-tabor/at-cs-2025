package dataStructures;

public class LinkedList<T> {
	
	private class Node {
		T info;
		Node next;
		
		public Node(T i, Node n) {
			info = i; next = n;
		}
	}
	
	private Node first = null;
	
	
	public void add(int i, T newData) {
		
		Node newNode = new Node(newData, null);
		
		if (first == null) 
			first = newNode;
		
		else {
			
			if (i == 0) {
				newNode.next = first;
				first = newNode;
			}
			else {
				
				try {
					Node current = first;
					
					for (int j = 0; j < i-1; j++) 
						current = current.next;
					
					newNode.next = current.next;
					current.next = newNode;
				}
				catch(NullPointerException e) {
					System.out.println("i is way too big");
				}
			}	
		}
	}
	
	public String toString() {
		
		String output = "[";
		
		Node current = first;
		while (current != null) {
			
			output += current.info + ", ";
			current = current.next;
		}
		return output.substring(0, output.length()-2) + "]";
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> tester = new LinkedList<String>();
		
		tester.add(0, "Tutu");
		tester.add(1, "Renad");
		tester.add(0, "Ethan");
		
		
		System.out.println(tester);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
