package test.project.lesson3;

public class InternTest {
    public static void main(String[] args) {
        String str1 = "Hello, JavaRush";
        String str2 = new String("Hello, JavaRush");
        System.out.println(str2.intern());
        System.out.println(str1 == str2.intern());
        System.out.println(str1 == str2);
    }
}
