package Pr_14;
import java.util.*;

public class WaitListTest {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new WaitList<Integer>();
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);

        System.out.println(waitList.contains(2));
        System.out.println(waitList.containsAll(Arrays.asList(2, 3)));
        System.out.println(waitList.containsAll(Arrays.asList(2, 4)));

        System.out.println(waitList.remove());

        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<String>(2);
        boundedWaitList.add("one");
        boundedWaitList.add("two");
        boundedWaitList.add("three");

        System.out.println(boundedWaitList);

        UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<Character>();
        unfairWaitList.add('a');
        unfairWaitList.add('b');
        unfairWaitList.add('c');

        unfairWaitList.moveToBack('b');
        unfairWaitList.remove('c');

        System.out.println(unfairWaitList);
    }
}
