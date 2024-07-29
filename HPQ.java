import java.util.Comparator;
import java.util.PriorityQueue;

public class HPQ {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.rank=rank;
            this.name=name;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
     public static void main(String[] args) {
        // PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(3);
        // pq.add(4);
        // pq.add(2);
        // pq.add(1);
        // while (!pq.isEmpty()) {
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }
        PriorityQueue <Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 2));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }

     }
}
