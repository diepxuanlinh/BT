package weekly.tuan8priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Student  implements Comparable {
    private  int id;
    private  String name;
    private  double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if (this.cgpa == other.cgpa) {
            if (this.name.equals(other.name)) {
                return Integer.compare(this.id, other.id);
            }
            return this.name.compareTo(other.name);
        }
        return Double.compare(other.cgpa, this.cgpa);
    }
}

class Priorities {
    public static List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        List<Student> res = new ArrayList<>();
        for (String i : events) {
            String[] tmp = i.split(" ");
            if (tmp[0].equals("ENTER")) {
                pq.add(new Student(Integer.parseInt(tmp[3]), tmp[1], Double.parseDouble(tmp[2])));
            } else {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        return res;
    }
}
public class priorityQueue {
}
