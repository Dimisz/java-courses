public class Student implements Comparable<Student>, Good{
    public Student(){
        System.out.println("Created");
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public void study() {
        System.out.println("Stdying");
    }
}
