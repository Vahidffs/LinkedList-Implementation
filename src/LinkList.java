
public class LinkList<T> {
	private Node<T> first = null;
	public boolean add(Node<T> newNode) {
		if(newNode == null) {
			return false;
		} else {
			newNode.setNext(first);
			first = newNode;
			return true;
		}
	}
	public void remove() {
		if(first.getNext() != null) {
			first = first.getNext();
		} else {
			first = null;
		}
	}
	private void printList(Node<T> node) {
		System.out.println(node.getValue());
		if(node.getNext()!= null) {
			printList(node.getNext());
		}
	}
	public void print() {
		printList(first);
	}











private class Node<T> {
	private T value;
		Node<T> next;
		private Node(T value) {
			this.value = value;
		}
		private void setNext(Node<T> next) {
			this.next = next;
		}
		private Node<T> getNext() {
			return next;
		}
		private T getValue() {
			return value;
		}
		
		
}
}
