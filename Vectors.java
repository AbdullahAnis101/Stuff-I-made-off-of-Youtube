import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vec1 = new Vector<Integer>();
        // Vector <Person>vec2 = new Vector<Person>(10);
        // 10 is the starting size and when it hits the starting size the size will increment by 5.
        //   Vector vec3 = new Vector(10,5);
        vec1.add(42);
        vec1.add(7);
        vec1.add(35);

        System.out.println("Size: " + vec1.size());
        System.out.println("Capacity " + vec1.capacity());
    }
}
