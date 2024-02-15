import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		Queue queue = new Queue();

		int option = -1, op = -1;

		do{
			System.out.println("\nMenu:");
			System.out.println("\t1. Stack");
			System.out.println("\t2. Queue");
			System.out.println("\t0. Exit program");
			System.out.println("\tWrite one option:");
			option = Integer.parseInt(sc.nextLine());
			switch (option) {
				case 1:
				do {
					System.out.println("\nStack:");
					System.out.println("\t1. Add Element");
					System.out.println("\t2. Show List");
					System.out.println("\t3. Delete");
					System.out.println("\t0. Previous Menu");
					System.out.println("\tWrite one option:");
					op = Integer.parseInt(sc.nextLine());
					switch (op) {
						case 1:
							System.out.println("Enter a value:");
							int data = Integer.parseInt(sc.nextLine());
							stack.push(data);
							break;
						case 2:
							stack.print();
							break;
						case 3:
							stack.pop();
							break;
					}
				} while (op != 0);
				break;
				case 2:
				do {
					System.out.println("\nQueue:");
					System.out.println("\t1. Add Element");
					System.out.println("\t2. Show List");
					System.out.println("\t3. Delete");
					System.out.println("\tWrite one option:");
					op = Integer.parseInt(sc.nextLine());
					switch (op) {
						case 1:
							System.out.println("Enter a value:");
							int data = Integer.parseInt(sc.nextLine());
							queue.enqueue(data);
							break;
						case 2:
							queue.print();
							break;
						case 3:
							queue.dequeue();
							break;
					}
				} while (op != 0);
				break;
				case 0:
					System.out.println("Closing Program...");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid option...");
					break;
			}
		} while (option != 0);

		sc.close();
	}
}
