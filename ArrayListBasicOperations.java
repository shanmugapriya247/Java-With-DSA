import java.util.ArrayList;

public class ArrayListBasicOperations {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 1. add()
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add(): " + list);

        // 2. add(index, element)
        list.add(1, 15);
        System.out.println("After add(index, element): " + list);

        // 3. get()
        System.out.println("Element at index 2: " + list.get(2));

        // 4. set()
        list.set(2, 25);
        System.out.println("After set(): " + list);

        // 5. contains()
        System.out.println("Contains 25? " + list.contains(25));
        System.out.println("Contains 100? " + list.contains(100));

        // 6. size()
        System.out.println("Size: " + list.size());

        // 7. indexOf()
        System.out.println("Index of 25: " + list.indexOf(25));

        // 8. lastIndexOf()
        list.add(25);
        System.out.println("List: " + list);
        System.out.println("Last index of 25: " + list.lastIndexOf(25));

        // 9. remove(index)
        list.remove(1);
        System.out.println("After remove(index): " + list);

        // 10. remove(Object)
        list.remove(Integer.valueOf(25));
        System.out.println("After remove(Object): " + list);

        // 11. isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());

        // 12. Iterate using for loop
        System.out.print("For Loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 13. Iterate using for-each loop
        System.out.print("For-each Loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 14. clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // 15. isEmpty() after clear
        System.out.println("Is Empty? " + list.isEmpty());
    }
}