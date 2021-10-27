import java.util.*;

public class ListStack
{
    private ListNode<String> stack;

    public ListStack()
    {
         stack = null;
    }

    public boolean isEmpty()
    {
        return stack==null;
    }

    public String peek()
    {
        if (stack == null)
            throw new NoSuchElementException();
        return stack.getValue();
    }

    public String push(String val)
    {
        ListNode<String> adder = new ListNode(val, stack);
        //stack.setNext(null);
        stack = adder;
        return val;
    }

    public String pop()
    {
        if (stack == null)
            throw new NoSuchElementException();
        ListNode<String> temp = stack.getNext();
        stack.setNext(null);
        String x = stack.getValue();
        stack = temp;
        return x;
    }
}
