public class LinkdList<E> extends LinkdListAdapter<E>
{
   private class Node
   {
      E element;
      Node next;
      
      public Node(E element)
      {
         this.element = element;
         this.next = null;
      }
      
      public Node(E element, Node next)
      {
         this.element = element;
         this.next = next;
      }
      
      @Override
      public String toString()
      {
         return String.format("Node: %s", element.toString());
      }
   }
   
   private Node head;
   private int size;
   
   /* TODO: implement LinkdList(), a constructor that constructs an LinkdList with
            null head and size 0.*/
            public Node LinkedList()
            {
                head = null;
                size = 0;
                return null;
            }
   /* TODO: implement boolean add(E element) method
            add element to the end of the list, possibly extending the 
            list. */
            public boolean add(E element)
            {
               if(head == null)
               {
                 head = new Node(element);
               }  
               else 
               {
                  Node node = head; //starts at the beggining of the list
                  while(node.next != null)
                  {
                     node = node.next; //makes node = the next node in the list until you reach the end
                  }
                  node.next = new Node(element); //node.next is the now = to the last node in the list so creating the new node elements makes the new node 
               }
               size++;
               return true;
            }
            
            //returns node at given index
            private Node getNode(int index)
            {
            
               if(index < 0 || index >= size)
               {
                  throw new IndexOutOfBoundsException();
               }
               Node node = head;
                  for(int i = 0; i < index ; i++)
                  {
                     node = node.next;
                  }
               return node;
            }
   /* TODO: implement void add(int index, E element) method
            insert element in the list at the given index, moving existing 
            elements to the right */
            public void add(int index, E element)
            {  
               /*if (index < 0 || index >= size)
               {
                  throw new IndexOutOfBoundsException();
               } */
               if(index == 0)
               {
                 head = new Node(element,head);//points new node to the head of list and puts it there
               }
               else
               {
                 /* Node nodeBefore = head;
                  for(int i = 0; i < index - 1; i++)
                  {
                     nodeBefore = nodeBefore.next;
                  } */
                  Node nodeBefore = getNode(index - 1);
                  nodeBefore.next = new Node(element,nodeBefore.next); //makes the node before where the nw node will be place connect to it
               }
                  size++;
            }
            
   // TODO: implement int size() method returing the size of the list.
   
   public int size()
   {
      return size;
   }
   
   // TODO: implement E get(int index) method, returns element at index.
   
   public E get(int index)
   {
      Node node = getNode(index);
      return node.element;
   }
   
   /* TODO: implement E set(int index, E element) method, replace the existing
            value at index with element, return the old value */
   
   public E set(int index , E element)
   {
      Node node = getNode(index); //get us to head
      E oldElement = node.element;
      node.element = element;      
      return oldElement;
      
   }
   /* TODO: implement int indexOf(Object o) method, return the index of the 
            first occurrence of o in the list, or -1 if the list does
            not contain the element. */
            public int indexOf(Object o)
            {
               Node node = head;
                for(int i = 0; i < size; i++)
                {
                               
                  if(node.element.equals(o))
                  {
                     return i;
                  }
               
                  node = node.next;
               }
               return -1;
            }
   
   /* TODO: implement boolean contains(Object o) method, return true of the list
            contains the element. */
            public boolean contains(Object o)
            {
               return indexOf(o) != -1;
               
            }
   
   /* TODO: implement E remove(int index) method, remove the element at the 
            the specified index. */
   
            public E remove(int index)
            {  
            
            E oldElement = get(index);
            if(index == 0)
            {
               head = head.next;
            }
            else
            {
               Node nodeBefore = getNode(index -1);
               nodeBefore.next = nodeBefore.next.next;
            }
               return oldElement;
            }
   /* TODO: implement boolean remove(Object o) method, remove the first occurrence of 
            the specified element, */
            
            public boolean remove(Object o)
            {
               int index = indexOf(o);
               if(index == -1)
               {
                  return false;
               }
               else
               {
                  remove(index);
                  return true;
               }
            }
} 