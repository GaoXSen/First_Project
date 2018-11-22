public class Test {

    public static void main(String[] ages){
        new Test();
    }
    public Test(){
        String name = "123";
        change(name);
        System.out.println(name.hashCode());

    }
    public void change(String name) {
        name = "abc";
        System.out.println(name.hashCode());
    }
}
