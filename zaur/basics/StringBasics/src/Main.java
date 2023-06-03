public class Main {
    public static void main(String[] args) {
        String sample1 = EmailSplitter.getDomains("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
        String sample2 = EmailSplitter.getDomains("ona@gmail.com");
        System.out.println(sample1);
        System.out.println(sample2);
    }
}