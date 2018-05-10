/*
Kevin Wang
APCS2 Pd. 8
HW #46 -- Arrr, There Be Priorities Here Matey
2018-05-10
*/

import java.util.ArrayList;

public class ArrayPriorityQueue {

    ArrayList<String> data;

    //constructs an initially empty priority queue
    public ArrayPriorityQueue() {
        data = new ArrayList<String>();
    }

    //adds an item to this priority queue
    //run-time O(1)
    public void add(String str) {
        data.add(str);
    }

    //returns true if this stack is empty, otherwise returns false
    public boolean isEmpty() {
        return data.size() == 0;
    }

    //returns the smallest item stored in this priority queue without removing it
    //run-time O(n)
    public String peekMin() {

        String min = "";
        if (isEmpty())
            return min;
        min = data.get(0);
        //go through every element in data and determine which is the smallest
        for (int i = 1; i < data.size(); i++) {
            if (min.compareTo(data.get(i)) > 0)
                min = data.get(i);
        }
        return min;

    }

    //removes and returns the smallest item stored in this priority queue
    //run-time O(n)
    public String removeMin() {

        String min = "";
        int index = 0;
        if (isEmpty())
            return min;
        min = data.get(0);
        //go through every element in data and determine which is the smallest
        for (int i = 1; i < data.size(); i++) {
            if (min.compareTo(data.get(i)) > 0) {
                min = data.get(i);
                index = i;
            }
        }
        data.remove(index);
        return min;

    }

    public String toString() {

        String ret = "";
        for (int i = 0; i < data.size(); i++) {
            ret += data.get(i) + " ";
        }
        return ret;

    }

    public static void main(String[] args) {

        ArrayPriorityQueue test = new ArrayPriorityQueue();
        System.out.println("isEmpty? " + test.isEmpty());
        System.out.println("min " + test.peekMin());
        System.out.println("adding banana...");
        test.add("banana");
        System.out.println("isEmpty? " + test.isEmpty());
        System.out.println("min " + test.peekMin());
        System.out.println("adding apple...");
        test.add("apple");
        System.out.println("isEmpty? " + test.isEmpty());
        System.out.println("min " + test.peekMin());
        System.out.println("adding pear...");
        test.add("pear");
        System.out.println("isEmpty? " + test.isEmpty());
        System.out.println("min " + test.peekMin());
        System.out.println("adding carrot...");
        test.add("carrot");
        System.out.println("isEmpty? " + test.isEmpty());
        System.out.println("min " + test.peekMin());
        System.out.println(test);
        System.out.println("removeMin " + test.removeMin());
        System.out.println(test);
        System.out.println("removeMin " + test.removeMin());
        System.out.println(test);

        System.out.println("=====================================");

        ArrayPriorityQueue test2 = new ArrayPriorityQueue();
        System.out.println("isEmpty? " + test2.isEmpty());
        System.out.println("adding foo...");
        test2.add("foo");
        System.out.println("adding moo...");
        test2.add("moo");
        System.out.println(test2);
        System.out.println("removeMin " + test2.removeMin());
        System.out.println(test2);
        System.out.println("adding goo...");
        test2.add("goo");
        System.out.println("adding hoo...");
        test2.add("hoo");
        System.out.println("adding doo...");
        test2.add("doo");
        System.out.println(test2);
        System.out.println("removeMin " + test2.removeMin());
        System.out.println(test2);

    }

}