import java.util.*;

public class stud {
    static class s1 implements Comparable<s1> {
        int roll;
        String name;

        s1(int r, String n) {
            this.roll = r;
            this.name = n;
        }

        public int compareTo(s1 s) {
            if (roll < s.roll)
                return -1;
            else if (roll > s.roll)
                return 1;
            else
                return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<s1> a1 = new ArrayList<s1>();
        a1.add(new s1(4, "ankit"));
        a1.add(new s1(2, "rahul"));
        Collections.sort(a1);
        // Collections.sort
        for (s1 student : a1) {
            System.out.println(student.roll+" "+student.name);
        }

    }
}
