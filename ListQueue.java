import java.util.*;

public class ListQueue
{
    private ListNode<String> front, back;
    private int size;

    public ListQueue()
    {
       front = null;
       back = null;
       size = 0;
    }

    public boolean isEmpty()
    {
        return size==0;  
    }

    public int size()
    {
         return size;
    }

    public String peek()
    {
        if (front == null)
            throw new NoSuchElementException();
        return front.getValue();
    }

    public boolean add(String val)
    {
        ListNode<String> temp = front;
        if (size > 0)
        {
            if (size >1)
            {
                for (int i = 0; i < size; i++)
                {
                    temp = front.getNext();
                }
            }
            ListNode<String> adder = new ListNode(val, null);
            temp.setNext(adder);
            back = adder;
            size++;
            
        }
        else{
            front = new ListNode(val, null);
            size ++;
        }
        return true;
    }

    public String remove()
    {
         String temp = front.getValue();
         ListNode<String> newFront = front.getNext();
         front.setNext(null);
         front = newFront;
         size--;
         return temp;
    }
    
    public String toString()
    {
        String fin = "{";
        ListNode<String> temp = front;
        if (size >= 1)
        {
            for (int i = 0; i <size -1; i++)
            {
                fin += temp.getValue() + ", ";
                temp = front.getNext();
            }
            fin += temp.getValue();
        }
        else
        {
            if (size == 0)
                return "{ }";
            else
                return "{" + front.getValue() + "}";
        }
        
        
        return fin + "}";
    }

}
