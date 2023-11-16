package Pr_3;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'm');
        Author a2 = new Author("Anna Ivanova", "anIvanova@somewhere.com", 'f');

        System.out.println(a1.getName());
        System.out.println(a2.getEmail());
        System.out.println(a1.getGender());
        a2.setEmail("AnnIvanova@somewhere.com");
        System.out.println(a1);
        System.out.println(a2);
    }
}
