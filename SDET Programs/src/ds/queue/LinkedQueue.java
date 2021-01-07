package ds.queue;

import java.util.Collection;
import java.util.Queue;

public class LinkedQueue<T> implements Iterable<T>, Queue<T> {

		  private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

		  public LinkedQueue() {}

		  public LinkedQueue(T firstElem) {
		    offer(firstElem);
		  }

		  // Return the size of the queue
		  public int size() {
		    return list.size();
		  }

		  // Returns whether or not the queue is empty
		  public boolean isEmpty() {
		    return size() == 0;
		  }

		  // Peek the element at the front of the queue
		  // The method throws an error is the queue is empty
		  public T peek() {
		    if (isEmpty()) throw new RuntimeException("Queue Empty");
		    return list.peekFirst();
		  }

		  // Poll an element from the front of the queue
		  // The method throws an error is the queue is empty
		  public T poll() {
		    if (isEmpty()) throw new RuntimeException("Queue Empty");
		    return list.removeFirst();
		  }

		  // Add an element to the back of the queue
		  public void offer1(T elem) {
		    list.addLast(elem);
		  }

		  // Return an iterator to alow the user to traverse
		  // through the elements found inside the queue
		  @Override
		  public java.util.Iterator<T> iterator() {
		    return list.iterator();
		  }

		@Override
		public boolean addAll(Collection<? extends T> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(T e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T element() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean offer(T e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T remove() {
			// TODO Auto-generated method stub
			return null;
		}
		
}
