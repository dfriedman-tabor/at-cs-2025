import java.util.ArrayList;

public class Branch<T> {
	
	T data;
	private ArrayList<Branch<T>> children = new ArrayList<>();
	
	
	public Branch(T data) {
		this.data = data;
	}
	
	public void addChild(Branch<T> child) {
		children.add(child);
	}
	
	public boolean isLeaf() {
		return children.isEmpty();
	}
	
	public String toString() {
		return toString(0);
	}
	
	public String toString(int depth) {
		
		
		String output = "";
		
		for (int i = 0; i < depth; i++) 
			output += "\t";
		
		output += this.data + "\n\n";
		
		for (Branch<T> child : children) {
			
			output += child.toString(depth + 1);
		}
		return output;
		
	}
	

	public static void main(String[] args) {
		Branch<String> root = new Branch<String>("root");
		Branch<String> child1 = new Branch<String>("child1");
		Branch<String> child2 = new Branch<String>("child2");
		Branch<String> child3 = new Branch<String>("child3");
		Branch<String> grandchild1 = new Branch<String>("grandchild1");
		Branch<String> grandchild2 = new Branch<String>("grandchild2");
		Branch<String> grandchild3 = new Branch<String>("grandchild3");
		Branch<String> grandchild4 = new Branch<String>("grandchild4");
		Branch<String> grandchild5 = new Branch<String>("grandchild5");
		Branch<String> grandchild6 = new Branch<String>("grandchild6");
		
		root.addChild(child1);
		root.addChild(child2);
		root.addChild(child3);
		child1.addChild(grandchild1);
		child1.addChild(grandchild2);
		child1.addChild(grandchild3);
		child2.addChild(grandchild4);
		child3.addChild(grandchild5);
		child3.addChild(grandchild6);



		System.out.println(root);
		
		
		
	}

}
