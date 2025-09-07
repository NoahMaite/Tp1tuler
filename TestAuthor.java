public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Tuler", "tuler@email.com", 'm');
        System.out.println(a1);
        a1.setEmail("novo@email.com");
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
    }
}
