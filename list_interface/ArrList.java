public class ArrList<E> extends ArrListAdapter<E>
{
   private E[] data;
   private int size;
   private static final int DEFAULT_CAPACITY = 10;
   
   /* TODO: implement ArrList(), a constructor that constructs an ArrList with
            capacity for ten elements.*/
            
   public ArrList()
   {
      this(DEFAULT_CAPACITY);
   }
   
   /* TODO: implement ArrList(int initialCapacity) a constructor with one int 
            parameter that constructs an ArrList with capacity initialCapacity.*/
            
   @SuppressWarnings("unchecked")
   public ArrList(int initialCapacity)
   {
      data = (E[]) new Object[initialCapacity]; //must use this to creat array 
      size = 0;
   }
            
   /* TODO: implement boolean add(E element) method
            add element to the end of the ArrList, possibly extending the 
            ArrList. */
            
   @SuppressWarnings("unchecked")         
   public boolean add(E element)
   {
      if(size >= data.length)
      {
         E[] newArray =(E[]) new Object[data.length + 10]; //increases size of new array when adding elemtns
         for(int i = 0 ; i < data.length;i++)
         {
            newArray[i] = data[i]; //copy new elemetn to array in same spot of current index
         }
         data = newArray; //copy array 
      }
      data[size] = element;
      size++;
      return true;
   }
   
   /* TODO: implement void add(int index, E element) method
            insert element in the ArrList at the given index, moving existing 
            elements to the right */
            
   public void add(int index, E element)
   {
      if(index < 0 || index > size)
      {
         throw new IndexOutOfBoundsException();
      }
      add(element);
      for(int i  = index; i < size ; i++)
      {
         data[i+1] = data[i]; //coppy's data over by one side
      }
      data[index] = element;
   }            
   // TODO: implement int size() method returing the size of the ArrList.
   
   // TODO: implement E get(int index) method, returns element at index.
   
   /* TODO: implement E set(int index, E element) method, replace the existing
            value at index with element, return the old value */
   
   /* TODO: implement int indexOf(Object o) method, return the index of the 
            first occurrence of o in the ArrList, or -1 if the ArrList does
            not contain the element. */
   
   /* TODO: implement boolean contains(Object o) method, return true of the list
            contains the element. */
   
   /* TODO: implement E remove(int index) method, remove the element at the 
            the specified index. */
   
   /* TODO: implement boolean remove(Object o) method, remove the first occurrence of 
            the specified element, */
}