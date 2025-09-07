public class TestBook {
    public static void main(String[] args) {
        Author a1 = new Author("Tuler", "tuler@email.com", 'm');
        Author a2 = new Author("Ana", "ana@email.com", 'f');
        Author[] authors = {a1, a2};

        Book b1 = new Book("Java Básico", authors, 59.90, 10);
        System.out.println(b1);
        System.out.println("Autores: " + b1.getAuthorNames());
    }
}
