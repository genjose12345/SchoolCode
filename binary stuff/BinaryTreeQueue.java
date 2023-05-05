import java.util.NoSuchElementException;
public class BinaryTreeQueue<E>
{
   private Node<E> head;
   private Node<E> tail;
   
   private static class Node<E>
   {
      private E element;
      private Node<E> next;
   }
   
   public BinaryTreeQueue()
   {
      head = null;
      tail = null;
   }
   
   public void add(E e)
   {
      Node<E> node = new Node<>();
      node.element = e;
      
      if(isEmpty())
      {
         head = node;
      }
      else
      {
         tail.next = node;
      }
      tail = node;
   }
   public E remove()
   
  {
   if(isEmpty())
   {
         throw new NoSuchElementException("Queue is empty");
   }
   E old = head.element;
   head = head.next;
   return old;
  }
   public E peek()
   {
      if(isEmpty())
      {
         throw new NoSuchElementException("Queue is empty");
         
      }
      return head.element;
   }
   public boolean isEmpty()
   {
      return head == null;
   }
}