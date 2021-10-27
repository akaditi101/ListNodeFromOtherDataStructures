public class TestQueue
{
    public static void main(String[] args)
    {
        ListQueue tester = new ListQueue();
        tester.add("hello");
        tester.add("goodbye");
        System.out.println(tester);
        tester.remove();
        System.out.println(tester);
        System.out.println(tester.size());
    }
}
