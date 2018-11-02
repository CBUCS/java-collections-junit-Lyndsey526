import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class MainTest {

    HashMap<Integer,Integer> myMap, myMap1;

    LinkedList<Integer> myLinkedList, myLinkedList1;
    Set<Integer> mySet,mySet1;
    Stack<Integer> myStack;
    Queue<Integer> myQueue ;

    //HashMap Testing

    @Test
    public void mapClearTest () {
    myMap = new HashMap<Integer, Integer>();
    myMap.clear();
    assertEquals (0,myMap.size());
    }

    @Test
    public void mapClearTest1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(2,3);
        myMap.put(11,12);
        myMap.clear();
        assertEquals (0,myMap.size());
    }

    @Test
    public void mapContainsKey () {
        myMap = new HashMap<Integer, Integer>();
        assertEquals(false, myMap.containsKey(7));
    }

    @Test
    public void mapContainsKey1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(5, 10);
        assertEquals(true, myMap.containsKey(5));
    }
    @Test
    public void mapContainsValue () {
    myMap = new HashMap<Integer, Integer>();
    assertEquals(false, myMap.containsValue(5));
    }

    @Test
    public void mapContainsValue1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(5, 10);
        assertEquals(true, myMap.containsValue(10));
    }

    @Test
    public void mapCompute () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,20);
        assertEquals((Integer) 30,myMap.compute(10,(k,v)-> v==20?v+10:20));
    }

    @Test
    public void mapEquals () {
        myMap = new HashMap<Integer, Integer>();
        myMap1 = new HashMap<Integer, Integer>();
        myMap1.put(5,8);
        assertEquals(false, myMap.equals(myMap1));
    }

    @Test
    public void mapEquals1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap1 = new HashMap<Integer, Integer>();
        assertEquals(true, myMap.equals(myMap1));
    }

    @Test
    public void mapEquals2 () {
        myMap = new HashMap<Integer, Integer>();
        myMap1 = new HashMap<Integer, Integer>();
        myMap.put(5,8);
        myMap1.put(10,26);
        assertEquals(false, myMap.equals(myMap1));
    }

    @Test
    public void mapIsEmpty () {
        myMap = new HashMap<Integer, Integer>();
        assertEquals(true, myMap.isEmpty());
    }

    @Test
    public void mapIsEmpty1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,15);
        assertEquals(false, myMap.isEmpty());
    }

    @Test
    public void mapGet () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,15);
        assertEquals((Integer)15, myMap.get(10));
    }

    @Test
    public void mapGet1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,15);
        assertEquals(null, myMap.get(8));
    }

    @Test
    public void mapPut () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(11,17);
        assertEquals((Integer)17, myMap.get(11));
    }

    @Test
    public void mapRemove () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,15);
        assertEquals((Integer)15, myMap.remove(10));
    }

    @Test
    public void mapRemove1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,15);
        assertEquals(null, myMap.remove(11));
    }

    @Test
    public void mapReplace () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,15);
        assertEquals((Integer) 15, myMap.replace(10, 12));
        assertEquals((Integer) 12, myMap.get(10));
    }

    @Test
    public void mapReplace1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,15);
        assertEquals(null, myMap.replace(28, 12));
        assertEquals(null, myMap.get(28));
    }

    @Test
    public void mapSize () {
        myMap = new HashMap<Integer, Integer>();
        assertEquals(0, myMap.size());
    }

    @Test
    public void mapSize1 () {
        myMap = new HashMap<Integer, Integer>();
        myMap.put(10,15);
        assertEquals(1, myMap.size());
    }


    //LinkedList Testing

    @Test
    public void LinkedListAdd () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(12);
        assertEquals(1, myLinkedList.size());
    }


    @Test
    public void LinkedListClear () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }

    @Test
    public void LinkedListClear1 () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(8);
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }

    @Test
    public void LinkedListContains () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(8);
        assertEquals(true, myLinkedList.contains(8));
    }

    @Test
    public void LinkedListContains1 () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        assertEquals(false, myLinkedList.contains(8));
    }

    @Test
    public void LinkedListGet () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        assertEquals((Integer)10, myLinkedList.get(0));
    }

    @Test
    public void LinkedListIndexOf () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        assertEquals((Integer)0, (Integer)myLinkedList.indexOf(10));
    }

    @Test
    public void LinkedListIndexOf1 () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        assertEquals((Integer)(-1), (Integer)myLinkedList.indexOf(9));
    }

    @Test
    public void LinkedListIsEmpty () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        assertEquals(false, myLinkedList.isEmpty());
    }

    @Test
    public void LinkedListIsEmpty1 () {
        myLinkedList = new LinkedList<Integer>();
        assertEquals(true, myLinkedList.isEmpty());
    }

    @Test
    public void LinkedListEquals () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList1 = new LinkedList<Integer>();
        assertEquals(true, myLinkedList.equals(myLinkedList1));
    }


    @Test
    public void LinkedListEquals1 () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList1 = new LinkedList<Integer>();
        myLinkedList1.add(10);
        assertEquals(false, myLinkedList.equals(myLinkedList1));
    }

    @Test
    public void LinkedListEquals2 () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList1 = new LinkedList<Integer>();
        myLinkedList.add(12);
        myLinkedList1.add(10);
        assertEquals(false, myLinkedList.equals(myLinkedList1));
    }

    @Test
    public void LinkedListRemove () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(12);
        assertEquals((Integer)12, myLinkedList.remove());
    }

    @Test
    public void LinkedListLastIndexOf () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        myLinkedList.add(10);
        assertEquals((Integer)1, (Integer)myLinkedList.lastIndexOf(10));
    }

    @Test
    public void LinkedListLastIndexOf1 () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        assertEquals((Integer)(-1), (Integer)myLinkedList.lastIndexOf(9));
    }


    @Test
    public void LinkedListSize () {
        myLinkedList = new LinkedList<Integer>();
        assertEquals((Integer)0, (Integer)myLinkedList.size());
    }

    @Test
    public void LinkedListSize1 () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        assertEquals((Integer)1, (Integer)myLinkedList.size());
    }
    @Test
    public void LinkedListSort () {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(13);
       // myLinkedList.sort(Comparator.reverseOrder());
        //assertEquals((Integer)1, (Integer)myLinkedList.sort());
    }

    //Set Testing
    @Test
    public void SetAdd () {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        assertEquals((Integer)1, (Integer)mySet.size());
    }

    @Test
    public void SetAdd1 () {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        mySet.add(10);
        assertEquals((Integer)1, (Integer)mySet.size());
    }

    @Test
    public void SetClear () {
        mySet = new TreeSet<Integer>();
        mySet.clear();
        assertEquals((Integer)0, (Integer)mySet.size());

    }

    @Test
    public void SetClear1 () {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        mySet.clear();
        assertEquals((Integer)0, (Integer)mySet.size());

    }

    @Test
    public void SetContains() {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        assertEquals(true, mySet.contains(10));
    }

    @Test
    public void SetContains1() {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        assertEquals(false, mySet.contains(15));
    }

    @Test
    public void SetContainsAll() {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        Integer setList[] = {10};
        assertEquals(true, mySet.containsAll(new TreeSet<Integer>(Arrays.asList(setList))));
    }

    @Test
    public void SetContainsAll1() {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        Integer setList[] = {10,12};
        assertEquals(false, mySet.containsAll(new TreeSet<Integer>(Arrays.asList(setList))));
    }

    @Test
    public void SetIsEmpty() {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        assertEquals(false, mySet.isEmpty());
    }

    @Test
    public void SetIsEmpty1() {
        mySet = new TreeSet<Integer>();
        assertEquals(true, mySet.isEmpty());
    }

    @Test
    public void SetEquals() {
        mySet = new TreeSet<Integer>();
        mySet1= new TreeSet<Integer>();
        assertEquals(true, mySet.equals(mySet1));
    }

    @Test
    public void SetEquals1() {
        mySet = new TreeSet<Integer>();
        mySet1= new TreeSet<Integer>();
        mySet.add(10);
        assertEquals(false, mySet.equals(mySet1));
    }

    @Test
    public void SetEquals2() {
        mySet = new TreeSet<Integer>();
        mySet1= new TreeSet<Integer>();
        mySet.add(10);
        mySet1.add(20);
        assertEquals(false, mySet.equals(mySet1));
    }

    @Test
    public void SetRemove() {
        mySet = new TreeSet<Integer>();
        assertEquals(false, mySet.remove(10));
    }

    @Test
    public void SetRemove1() {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        assertEquals(true, mySet.remove(10));
    }

    @Test
    public void SetRetainAll() {
        mySet = new TreeSet<Integer>();
        mySet1= new TreeSet<Integer>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet1.add(10);
        mySet1.add(20);
        assertEquals(true, mySet.retainAll(mySet1));
    }

    @Test
    public void SetSize() {
        mySet = new TreeSet<Integer>();
        mySet.add(10);
        assertEquals(1, mySet.size());
    }

    @Test
    public void SetSize1() {
        mySet = new TreeSet<Integer>();
        assertEquals(0, mySet.size());
    }

    //Stack Testing
    @Test
    public void StackEmpty() {
        myStack = new Stack<Integer>();
        assertEquals(true, myStack.empty());
    }

    @Test
    public void StackEmpty1() {
        myStack = new Stack<Integer>();
        myStack.push(12);
        assertEquals(false, myStack.empty());
    }

    @Test
    public void StackPeek() {
        myStack = new Stack<Integer>();
        myStack.push(12);
        assertEquals((Integer)12, myStack.peek());
    }

    @Test
    public void StackPop() {
        myStack = new Stack<Integer>();
        myStack.push(12);
        myStack.push(1);
        assertEquals((Integer)1, myStack.pop());
        assertEquals((Integer)12, myStack.peek());
    }

    @Test
    public void StackPush() {
        myStack = new Stack<Integer>();
        myStack.push(18);
        assertEquals((Integer)18, myStack.peek());
    }

    @Test
    public void StackSearch() {
        myStack = new Stack<Integer>();
        myStack.push(18);
        assertEquals(1, myStack.search(18));
    }

    @Test
    public void StackSearch1() {
        myStack = new Stack<Integer>();
        myStack.push(22);
        assertEquals(-1, myStack.search(18));
    }

    //Queue Testing
    @Test
    public void QueueAdd() {
        myQueue = new LinkedBlockingQueue<Integer>();
        myQueue.add(12);
        assertEquals((Integer)12, myQueue.peek());
    }

    @Test
    public void QueueElement() {
        myQueue = new LinkedBlockingQueue<Integer>();
        myQueue.add(12);
        assertEquals((Integer)12, myQueue.element());
    }

    @Test
    public void QueueOffer() {
        myQueue = new LinkedBlockingQueue<Integer>();
        assertEquals(true, myQueue.offer(12));
    }

    @Test
    public void QueuePeek() {
        myQueue = new LinkedBlockingQueue<Integer>();
        myQueue.add(12);
        assertEquals((Integer)12, myQueue.peek());
    }

    @Test
    public void QueuePeek1() {
        myQueue = new LinkedBlockingQueue<Integer>();
        assertEquals(null, myQueue.peek());
    }

    @Test
    public void QueuePoll() {
        myQueue = new LinkedBlockingQueue<Integer>();
        myQueue.add(12);
        assertEquals((Integer)12, myQueue.poll());
    }

    @Test
    public void QueueRemove() {
        myQueue = new LinkedBlockingQueue<Integer>();
        myQueue.add(12);
        assertEquals((Integer)12, myQueue.remove());
    }
}
