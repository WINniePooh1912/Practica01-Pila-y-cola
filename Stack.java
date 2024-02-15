public class Stack {
	public Node stack;

	public Stack(){
		stack = null;
	}

	public void push(int value){
		Node node = new Node(value);

		if(stack == null){
			stack = node;
		} else {
			Node temp = stack;
			stack = node;
			node.setNext(temp);
		}
	}

	public void pop(){
		Node temp = stack;

		if(stack == null){
			System.out.println("Stack is already empty...");
		} else {
			if(temp.getNext() == null) {
				stack = null;
			} else {
				stack = temp.getNext();
				System.out.println("First element deleted...");
			}
		}
	}

	public void print(){
		Node temp = stack;

		if(stack == null){
			System.out.println("Stack is empty...");
		} else {
			System.out.println("Showing list:");
			while (temp != null) {
				System.out.println(temp.getValue() + "");
				temp = temp.getNext();
			}
		}
	}
}
