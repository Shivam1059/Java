// class Test{
//   public static void main(String args[]){
//      int x = 10;
//      int y = x++;
//      System.out.println( "x" +  x);
//      System.out.println("y" + y);
//   }
// }


import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Natural ordering by age
    @Override
    public int compareTo(Student s){
        return this.age - s.age; // ascending order by age
    }
    @Override
    public String toString(){
        return name + " - " + age;
    }
}

class ComparableExample {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 22));
        list.add(new Student("Bob", 20));
        list.add(new Student("Charlie", 21));

        Collections.sort(list); // uses Comparable's compareTo
        for(Student s : list){
            System.out.println(s);
        }
    }
}
