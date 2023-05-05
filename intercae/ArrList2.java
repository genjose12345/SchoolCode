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
      data = (E[])new Object[initialCapacity];
      size = 0;
   }         
   /* TODO: implement boolean add(E element) method
            add element to the end of the ArrList, possibly extending the 
            ArrList. */
   @SuppressWarnings("unchecked")         
   @Override         
   public boolean add(E element)
   {
      // Increase data array size if neccessary.
      if(size >= data.length)
      {
         E[] biggerArray;
         biggerArray = (E[]) new Object[2 * data.length];
         for(int i = 0; i < data.length; i++)
         {
            biggerArray[i] = data[i];
         }
         data = biggerArray;
      }
      data[size] = element;
      size++;      
      return true;
   }
   
   /* TODO: implement boolean add(int index, E element) method
            insert element in the ArrList at the given index, moving existing 
            elements to the right */
            
	@Override
	public void add(int index, E element)
   {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}

		add(element);
      
		for (int i=size-1; i>index; i--) 
      {
			data[i] = data[i-1];
		}
		// put the new one in the right place
		data[index] = element;
   }
                  
   }