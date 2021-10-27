public class ListNode<T>
{
    private T value;
    private ListNode<T> next;
    private ListNode<T> previous;
  

    public ListNode(T initValue, ListNode<T> initNext)
    { 
        value = initValue; 
        next = initNext;
    }

    public ListNode(T initValue, 
                    ListNode<T> initPrevious,
                    ListNode<T> initNext)
    { 
        value = initValue; 
        next = initNext;
        previous = initPrevious;
    
    }


    public T getValue() 
    { 
        return value; 
    }

    public ListNode<T> getNext() 
    { 
        return next; 
    }

    public ListNode<T> getPrevious() 
    { 
        return previous; 
    }
    
    public void setValue(T theNewValue) 
    { 
        value = theNewValue; 
    }

    public void setNext(ListNode<T> theNewNext) 
    { 
        next = theNewNext; 
    }

    public void setPrevious(ListNode<T> theNewPrevious) 
    { 
        next = theNewPrevious; 
    }

}


