
//Functional DynamicArray
public class DynamicArray <T> 
{
    private Object[] array;
    private int size;
    
    
    //CONSTRUCTORS
    public DynamicArray()
    {
        size = 0;
    }
    
    public DynamicArray(T data[])
    {
        array = data;
        size = array.length;
    }
    
    public DynamicArray(int length)
    {
        size = 0;
        array = new Object[1 + size];
    }
    
    //FUNCTIONS
    public int Size()
    {
        return size;
    }
    
    public T at(int index)
    {
        if (index < 0 || index >= size) 
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        return (T)array[index];
    }
    
    public void insert(T v)
    {
        if(size == array.length)
        {
            Object values[] = new Object[1 + size];
            for (int i = 0; i < size; i++) 
            {
                values[i] = array[i];
            }
            values[size] = v;
            array = values;
            
        }else
        {
            array[size] = v;
        }
        size++;
    }
    
    public void reserve(int length)
    {
        Object values[] = new Object[size+length];
        int i = 0;
        for (Object value : array) 
        {
            values[i] = value; 
            i++;
        }
        array = values;
    }
}
