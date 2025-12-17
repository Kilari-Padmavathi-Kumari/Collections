import java.util.*;

public class Employee 
{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee e = (Employee) obj;
        return id == e.id;
    }

    public String toString() {
        return id + " - " + name;
    }

    public static void main(String[] args)
     {
        Map<Employee, String> map = new HashMap<>();

        map.put(new Employee(1, "Padma"), "HR");
        map.put(new Employee(2, "Pavan"), "Developer");
        map.put(new Employee(1, "Padma"), "HR");

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Employee Map: " + map);
        System.out.println("Size: " + map.size());

        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
