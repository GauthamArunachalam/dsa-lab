package datastrucutres.node;

import java.util.Optional;

/**
 * A node used in a single linked list.
 * This class extends {@link AbstractNode} and adds a reference to the next node, allowing it to be used as part of a
 * single linked list.
 *
 * @param <T> the type of data stored in the node.
 * */
public class SingleLinkedNode<T> extends AbstractNode<T>{

  /**
   * Reference to the next node in the single linked list.
   * can be {@code null} if this is the last node.
   * */
  private SingleLinkedNode<T> next;

  /**
   * Constructs a node with the given data and no next node.
   *
   * @param data the data to be stored in the node, may be {@code null}.
   * */
  public SingleLinkedNode(T data) {
    super(data);
    this.next = null;
  }

  /**
   * Constructs a node with the given data and next node reference.
   *
   * @param data the data to store in the node, can be {@code null}
   * @param next the reference to the next node in the list, can be {@code null}.
   * */
  public SingleLinkedNode(T data, SingleLinkedNode<T> next) {
    super(data);
    this.next = next;
  }

  /**
   * Returns the next node in the list, wrapped in an {@link Optional}.
   *
   * @return an {@code Optional} containing the next node if present, otherwise {@code Optional.empty()}.
   * */
  public Optional<SingleLinkedNode<T>> getNext() {
    return Optional.ofNullable(next);
  }

  /**
   * Sets the reference to the next node in the list.
   *
   * @param next the new next node, may be {@code null} to mark this as the last node.
   * */
  public void setNext(SingleLinkedNode<T> next) {
    this.next = next;
  }
}
