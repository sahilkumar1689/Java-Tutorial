import java.util.*;

public class Basiccollection {
    public static void main(String[] args) {
        // 1. Collection Framework=A collection in a java is frameworks that provides an
        // architecture to store and manipulate the group of objects.
        // By the using of java collection we can achieve all the operation that we can
        // perform on a data.These operation include
        // searching,sorting,insertion,maipulation,deletion.
        // Java collection frameworks provides may interfaces e.g. list,set,map,queue
        // and these interfaces are implemented by lots of classes e.g.
        // Arraylist,linkedlist,stack,queue,dequeue,hashset,etc.

        // Basically by using list interface we can implements four classes:
        // 1. ArrayList=It is a dynamic array.
        // 2. Linkedlist
        // 3. Stack
        // 4. Vector

        // Basically by using queue interface we can implements four classes:
        // 1. ArrayDeque
        // 2. Priorityqueue
        // 3. Linkedlist

        // Basically by using set interface we can implements four classes:
        // 1. HashSet
        // 2. LinkedHashSet
        // 3. TreeSet

        // Basically by using map interface we can implements four classes:
        // 1. HashMap
        // 2. TreeMap
        // 3. LinkedHashMap

        // 1. List interfaces:

        // (i) ArrayList and linkedlist:
        // Synatx:
        // List<data_type> object_Name = new ArrayList();

        // e.g.:
        // List<Integer> arr1 = new ArrayList<>();
        // List<Integer> list = new LinkedList<>();

        // Some Methods in List interfaces,basically all the methods list below are used
        // in the top two list interfaces classes no matter the class is
        // arraylist,linkedlist.

        // // 1. It is used add the number in the arraylist.
        // arr1.add(1);
        // arr1.add(2);
        // arr1.add(3);
        // arr1.add(4);
        // list.add(6);
        // list.add(7);

        // // 2. we can also gave one more argument i.e. the index value we want to
        // insert:
        // arr1.add(4, 555);
        // list.add(2, 8);

        // // 3. we can also merge two list with each other:
        // arr1.addAll(list);

        // // 4. We can directly print the array list:
        // System.out.println(arr1);

        // // 5. we can get the size of the list:
        // System.out.println(arr1.size());

        // // 6. we can directly access the element at any index:
        // System.out.println(arr1.get(0));

        // // 7. Insert at any number in between:
        // arr1.set(0, 4);
        // System.out.println(arr1);

        // // 8. We can also remove element at any index:
        // arr1.remove(7);
        // System.out.println(arr1);

        // // 9. Check whether any particular elements present in the list or not:
        // System.out.println(arr1.contains(555));

        // // 10. To remove all the element in the list:
        // arr1.clear();

        // (ii) Stack=The stack class are direclty used by itself don't need to make any
        // referance variable of any list interface:

        // Syntax:
        // Stack<Integer> st = new Stack<>();

        // // 1. To insert the element in the stack:
        // st.push(1);
        // st.push(2);
        // st.push(3);

        // // 2. To ge the size:
        // st.size();

        // // 3. We can directly print the stack elements:
        // System.out.println(st);

        // // 4. To get the top most elements:
        // st.peek();

        // // 5. To remove the top most element:
        // st.pop();

        // 2. Queue Interfaces:

        // 1. Queue using linked list:

        // Syntax:
        // Queue<data_type> obj_Name = new LinkedList<>();

        // e.g.:
        // Queue<Integer> qu = new LinkedList<>();

        // // To add the element:
        // qu.offer(1);
        // qu.offer(2);
        // qu.offer(3);

        // System.out.println(qu);

        // // To delete the front element:
        // qu.poll();

        // // To get the front element:
        // System.out.println(qu.peek());

        // System.out.println(qu);

        // 2. Queue using ArrayDeque=Basically in this we can insertion and deletion
        // onboth side of the queue.Basically arraydeque have all the method that are
        // present in the linkedlistqueue but in this we have addition function to
        // insert and delete from both the ends.The arraydeque are implemeented by
        // itself.

        // Syntax:
        // ArrayDeque<Integer> qu = new ArrayDeque<>();

        // // 1. To insert at the front:
        // qu.offerFirst(1);
        // qu.offerFirst(2);

        // // 2. To insert at the end:
        // qu.offerLast(3);
        // qu.offerLast(4);

        // System.out.println(qu);

        // // 3. To get the front element:
        // qu.peekFirst();

        // // 4. To get the back element:
        // qu.peekLast();

        // System.out.println(qu);

        // // 5. To delete the front element:
        // qu.pollFirst();

        // // 6. To delete the back element:
        // qu.pollLast();

        // System.out.println(qu);

        // 3. Queue using priority queue = The priority queue implementation and the
        // method are similar the linkedlistqueue but the the only difference is that
        // the first element are always be a minimum element by default.We can also
        // change the by default behaviour by using the comparator "reverseOrder".After
        // that the first element can always be a maximum element.

        // Synatax:
        // Queue<data_type> obj_Name = new PriorityQueue<>();

        // e.g.:
        // Queue<Integer> pqu = new PriorityQueue<>();
        // Queue<Integer> pqu = new PriorityQueue<>(Comparator.reverseOrder());

        // pqu.offer(3);
        // pqu.offer(2);
        // pqu.offer(1);

        // System.out.println(pqu);

        // pqu.peek();

        // pqu.poll();

        // System.out.println(pqu);

        // 3. Set Interfaces=Basically set is a special type of data structure which
        // only contains the unique element.

        // 1. set using HashSet and LinkedHashSet and TreeSet = All these classes are
        // implemented by the set interfaces and method are same in all the classes.But
        // the difference is that the hashset and contains the element in random
        // order.The LinkedHashSet in the input order and the TreeSet store the element
        // in the sorted ordered.

        // Syntax:
        // Set<data_type> obj_Name = new className<>();

        // e.g.:

        // Set<Integer> st = new HashSet<>();
        // // Set<Integer> st = new LinkedHashSet<>();
        // // Set<Integer> st = new TreeSet<>();

        // st.add(1);
        // st.add(2);
        // st.add(3);
        // st.add(4);
        // st.add(4);
        // st.add(4);

        // System.out.println(st);

        // System.out.println(st.size());

        // System.out.println(st.contains(2));

        // st.remove(4);
        // System.out.println(st);
        // System.out.println(st.isEmpty());
        // st.clear();

        // 4. Map Interfaces:

        // 1. Map using HashMap and TreeMap:

        // Syntax:
        // Map<key_data_type,value_data_type> obj_Name = new ClassName<>();

        // e.g.:
        Map<Integer, Integer> mpp = new TreeMap<>();

        mpp.put(0, 1);
        mpp.put(1, 2);
        mpp.put(2, 3);
        mpp.put(3, 4);

        // To access any random value using key:
        System.out.println(mpp.get(0));

        // To check whether the key is present or not:
        System.out.println(mpp.containsKey(0));

        // To check whether the value is present or not:
        System.out.println(mpp.containsValue(1));

        System.out.println(mpp.isEmpty());

        // Put number if present:
        mpp.putIfAbsent(4, 5);

        // Iterate in the map:
        for (int it : mpp.values()) {
            System.out.println(it);
        }
        for (int it : mpp.keySet()) {
            System.out.println(it);
        }

        // Note = 1. In list interface the list interface can implemented by the
        // arraylist and the linkedlist also their method will be similar but the stack
        // implemented by itself and its method differ.

        // 2. In Queue interface the queue interface can be implemented by the
        // linkedqueue and priorityqueue.But arraydequeue are implemented by itself.

        // 3. In set interface all the classes are implemented by using the set
        // interface.Also their method will be similar.

    }

}