import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Black");
        c.add("Yellow");
        c.add("White");
        c.remove("Yellow");
        System.out.println(c);
    }
}