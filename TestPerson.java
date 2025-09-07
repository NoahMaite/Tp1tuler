public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("Carlos", "Rua A", "Computação", 2025, 1500.0);
        Staff st1 = new Staff("Maria", "Rua B", "Escola X", 2500.0);

        System.out.println(s1);
        System.out.println(st1);
    }
}
