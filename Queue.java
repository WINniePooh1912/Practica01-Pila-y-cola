public class Queue {
	public Node queue;

	public Queue(){
		queue = null;
	}

	public void enqueue(int value){
		Node node = new Node(value);

		if(queue == null){
			queue = node;
		} else {
			Node temp = queue;

			while (temp.getNext() != null) {
				temp = temp.getNext();
			}

			temp.setNext(node);
		}
	}

	public void dequeue(){
		Node temp = queue;

		if(queue == null){
			System.out.println("Queue is already empty...");
		} else {
			if(temp.getNext() == null) {
				queue = null;
			} else {
				queue = temp.getNext();
				System.out.println("First element deleted...");
			}
		}
	}

	public void print(){
		Node temp = queue;

		if(queue == null){
			System.out.println("Queue is empty...");
		} else {
			System.out.println("Showing list:");
			while (temp != null) {
				System.out.println(temp.getValue() + "");
				temp = temp.getNext();
			}
		}
	}
}
