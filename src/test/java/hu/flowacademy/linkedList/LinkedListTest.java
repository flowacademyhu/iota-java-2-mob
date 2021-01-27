package hu.flowacademy.linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {
    LinkedList<String> strings;

    @BeforeEach
    public void setUp() {
        strings = new DefaultLinkedList();
    }

    @Test
    public void testAdd() {
        String foo = "foo";
        String bar = "bar";

        strings.add(foo);
        strings.add(bar);

        assertTrue(strings.contains(foo));
        assertTrue(strings.contains(bar));
    }

    @Test
    public void testAdd_atIndex() {
        String foo = "foo";
        String bar = "bar";
        String baz = "baz";

        strings.add(foo);
        strings.add(bar);
        strings.add(1, baz);


        assertEquals(foo, strings.get(0));
        assertEquals(baz, strings.get(1));
        assertEquals(bar, strings.get(2));
    }

    @Test
    public void testAddFirst() {
        String foo = "foo";
        String bar = "bar";
        String baz = "baz";

        strings.add(foo);
        strings.add(bar);
        strings.addFirst(baz);

        assertEquals(baz, strings.get(0));
    }

    @Test
    public void testAddAll() {
        String foo = "foo";
        String bar = "bar";
        strings.add(foo);
        strings.add(bar);
        LinkedList<String> s1 = strings.clone();

        strings.addAll(s1);

        assertEquals(foo, strings.get(2));
        assertEquals(bar, strings.get(3));
    }

    @Test
    public void testIndexOf() {
        String foo = "foo";
        String bar = "bar";
        strings.add(foo);
        strings.add(bar);

        int fooIndex = strings.indexOf(foo);

        assertEquals(0, fooIndex);
    }

    @Test
    public void testIndexOf_nonExistingElement() {
        String foo = "foo";
        String bar = "bar";

        strings.add(foo);
        strings.add(bar);

        int bazIndex = strings.indexOf("baz");

        assertEquals(-1, bazIndex);
    }

    @Test
    public void testLastIndexOf() {
        String foo = "foo";
        String bar = "bar";
        String baz = "baz";
        strings.add(foo);
        strings.add(bar);
        strings.add(baz);
        strings.add(bar);
        strings.add(foo);
        strings.add(foo);
        strings.add(bar);

        int fooLastIndex = strings.lastIndexOf(foo);
        assertEquals(5, fooLastIndex);
    }

    @Test
    public void testLastIndexOf_nonExistent() {
        String foo = "foo";
        String bar = "bar";
        String baz = "baz";
        strings.add(foo);
        strings.add(bar);
        strings.add(baz);
        strings.add(bar);
        strings.add(foo);
        strings.add(foo);
        strings.add(bar);

        int fakeIndex = strings.lastIndexOf("fake");
        assertEquals(-1, fakeIndex);
    }

    @Test
    public void testClear() {
        String foo = "foo";
        strings.add(foo);

        strings.clear();

        assertEquals(0, strings.size());
    }

    @Test
    public void testGet_index() {
        String foo = "foo";
        String bar = "bar";
        strings.add(foo);
        strings.add(foo);
        strings.add(bar);

        String get = strings.get(0);

        assertEquals(foo, get);
    }

    @Test
    public void testGet_indexWithDelete() {
        String foo = "foo";
        String bar = "bar";
        strings.add(foo);
        strings.add(foo);
        strings.add(bar);
        strings.remove(0);
        strings.remove(1);

        String get = strings.get(0);

        assertEquals(foo, get);
    }

    @Test
    public void testGetFirst() {
        String foo = "foo";
        String bar = "bar";
        strings.add(foo);
        strings.add(foo);
        strings.add(bar);

        String get = strings.getFirst();

        assertEquals(foo, get);
    }


    @Test
    public void testRemove() {
        String foo = "foo";
        String bar = "bar";
        strings.add(foo);
        strings.add(foo);
        strings.add(bar);

        strings.remove(2);

        assertFalse(strings.contains(bar));
    }

    @Test
    public void testSize() {
        String foo = "foo";
        String bar = "bar";
        String baz = "baz";
        strings.add(foo);
        strings.add(foo);
        strings.add(bar);
        strings.add(baz);
        strings.add(bar);

        int size = strings.size();

        assertEquals(5, size);
    }

    @Test
    public void testClone() {
        String foo = "foo";
        String bar = "bar";
        String baz = "baz";
        strings.add(foo);
        strings.add(foo);
        strings.add(bar);
        strings.add(baz);
        strings.add(bar);

        //LinkedList<String> clone = strings.clone();

        //assertTrue(linkedListEquals(strings, clone));
        //assertNotSame(strings, clone);
    }

    private <T> boolean linkedListEquals(LinkedList<T> l1, LinkedList<T> l2) {
        if(l1.size() != l2.size()) {
            return false;
        }
        int size = l1.size();
        for (int i = 0; i < size; i++) {
            if(!l1.get(i).equals(l2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
