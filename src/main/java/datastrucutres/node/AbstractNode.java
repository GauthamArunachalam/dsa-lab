package datastrucutres.node;

import java.util.Optional;

/**
 * An abstract base class representing a generic node used in data structures.
 * This class provides a simpler wrapper around a single data element of type {@code T}, with standard getter and setter
 * methods. Subclasses are expected to define how links or references to other nodes are handled (e.g., next, previous,
 * left, right, children).
 *
 * @param <T> the type of data stored in node.
 * */
public abstract class AbstractNode<T> {

  /**
   * The data stored in the node. May be {@code null}.
   * */
  private T data;

  /**
   * Constructs a new node with the specified data.
   *
   * @param data - the data to store in the node, can be {@code null}.
   * */
  public AbstractNode(T data) {
    this.data = data;
  }

  /**
   * Returns the data stored in the node, wrapped in an {@link Optional}.
   *
   * @return an {@code Optional} containing the data, or {@code Optional.empty()} if data is {@code null}.
   * */
  public Optional<T> getData() {
    return Optional.ofNullable(data);
  }

  /**
   * Sets the data stored in this node.
   *
   * @param data - the new data to store, can be {@code null}.
   * */
  public void setData(T data) {
    this.data = data;
  }
}
