import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Union
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // Intersection
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }

        for (int i : b) {
            set.add(i);
        }

        System.out.println("Union: " + set);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        // Store first array
        for (int i : a) {
            set.add(i);
        }

        System.out.print("Intersection: ");

        // Check second array
        for (int i : b) {

            if (set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
*/


/*
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < n2; i++) {
            set.add(b[i]);
        }

        System.out.println("Union = " + set);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            set.add(a[i]);
        }

        System.out.print("Intersection = ");

        for (int i = 0; i < n2; i++) {

            if (set.contains(b[i])) {
                System.out.print(b[i] + " ");
            }
        }
    }
}
*/