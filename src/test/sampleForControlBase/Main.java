package sample;

public class Main {
    public static void main(String[] args) {
        Parent c1 = ChildOne.getBuilder().setString("Hello").build();
        System.out.println(c1);
        Parent c2 = ChildTwo.getBuilder().setString("Hello2").build();
        System.out.println(c2);
    }
}
