package datastrucutres;

import datastrucutres.node.AbstractNode;

import java.util.Optional;

/**
 * A generic interface defining the operations of a singly linked list.
 * This interface includes basic CRUD operations, positional access, search,
 * and advanced algorithms commonly applied to linked list data structures.
 *
 * @param <T> the type of data stored in the linked list
 */
public interface LinkedList<T> {

  /**
   * Checks whether the linked list is empty.
   *
   * @return true if the list contains no elements, false otherwise
   */
  public boolean isEmpty();

  /**
   * Returns the number of elements in the list.
   *
   * @return the current size of the list.
   * */
  public int size();

  /**
   * Removes all elements from the list.
   * */
  public void clean();

  /**
   * Adds the data to the beginning of the list.
   *
   * @param value the data to be added to the list.
   * */
  public void addFirst(T value);

  /**
   * Adds the data to the end of the list
   *
   * @param value the data to be added to the list.
   * */
  public void addLast(T value);

  /**
   * Adds the node to the beginning of the list
   *
   * @param node the node to be added to the list.
   * */
  public void addFirst(AbstractNode<T> node);

  /**
   * Adds the node to the end of the list
   *
   * @param node the node to be added to the list.
   * */
  public void addLast(AbstractNode<T> node);

  /**
   * Inserts an element at the specified index
   *
   * @param index the position at which the data is inserted.
   * @param value the value to be added the new node.
   * @throws IndexOutOfBoundsException if index is invalid.
   * */
  public void addAt(int index, T value);

  /**
   * Inserts the node at the specified index
   *
   * @param index the position at which the data is inserted.
   * @param node the node to be inserted
   * @throws IndexOutOfBoundsException if index is invalid.
   * */
  public void addAt(int index, AbstractNode<T> node);

  /**
   * Removes the first node from the list.
   *
   * @throws IllegalStateException when the list is empty.
   * */
  public void removeFirst();

  /**
   * Removes the last node from the list.
   *
   * @throws IllegalStateException when the list is empty.
   * */
  public void removeLast();

  /**
   * Removes the index at the specified index
   *
   * @param index the index node to be removed
   * @throws IndexOutOfBoundsException if index is invalid.
   * */
  public void removeAt(int index);

  /**
   * Removes the first occurrence of the data in the list
   *
   * @param data the data to be removed from the list.
   * */
  public void remove(T data);

  /**
   * Removes all occurrences of the data from the list
   *
   * @param data the data to be removed from the list.
   * */
  public void removeAll(T data);

  /**
   * Returns the data at the specified index, wrapped in {@link Optional}
   *
   * @param index the index to get the data from
   * @throws IndexOutOfBoundsException if the specified index is invalid.
   * */
  public Optional<T> get(int index);

  /**
   * Replaces the element at the specified index with the given data (instead of creating a new node)
   *
   * @param index the position to be replaced
   * @param data the new data to be set at the specified position
   * @throws IndexOutOfBoundsException if the specified index is invalid.
   * */
  public void set(int index, T data);

  /**
   * Converts the list into a string representation
   *
   * @return the string representation of the list.
   * */
  public String toString();

  /**
   * Checks if the given data is present in the list
   *
   * @param value the value to check in the list
   * @return returns true if present else false is returned
   * */
  public boolean contains(T value);

  /**
   * Returns the first index of the data in the list
   *
   * @param value the value to check in the list
   * @return the first position of the value, if the value is not present -1 will be returned
   * */
  public int indexOf(T value);

  /**
   * Returns the last index of the data in the list
   *
   * @param value the value to check in the list
   * @return the last position of the value, if the value is not present -1 will be returned
   * */
  public int lastIndexOf(T value);

  /**
   * Reverses the list in place
   * */
  public void reverse();

  /**
   * Converts the list into the array.
   *
   * @return an array containing all the elements in order
   * */
  public T[] toArray();

  /**
   * Creates and returns a deep copy of the list
   *
   * @return a cloned linked list
   * */
  public LinkedList<T> clone();

  /**
   * Finds the middle element of the list
   *
   * @return the middle element of the list
   * @throws IllegalStateException if the list is empty
   * */
  public T findMiddle();

  /**
   * Checks if the linked list contains a cycle
   *
   * @return returns true when the cycle exist, else returns false
   * @throws IllegalStateException thrown when list is empty
   * */
  public boolean hasCycle();

  /**
   * Removes the cycle is a cycle exist in the linked list
   *
   * @throws IllegalStateException throws when list is empty or no cycle exist
   * */
  public void removeCycle();

  /**
   * Returns the n-th node value from end of list
   *
   * @param n the position from the end of the list (1 based index)
   * @return T n-th node from end
   * @throws IllegalStateException if n is negative or greater than size
   * */
  public T getNthFromEnd(int n);

  /**
   * Reverses the list in groups of K
   *
   * @param k the group size
   * @throws IllegalStateException if k is less than 1
   * */
  public void reverseInGroups(int k);

  /**
   * Checks if the linked list is palindrome.
   *
   * @return boolean returns true if the list is palindrome else returns false
   * */
  public boolean isPalindrome();

  /**
   * Rotates the list to the right by k places
   *
   * @param k number of positions to rotate
   * */
  public void rotate(int k);

  /**
   * Partitions the list around the given pivot value
   * Elements less than the pivot come before elements greater than or equal
   *
   * @param data the pivot value
   * */
  public void partitionAroundValue(T data);

  /**
   * Sorts the linked list in ascending order
   * */
  public void sort();
}
