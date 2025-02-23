public class Main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.add("Anggur");
        bag.add("Kumbohu");
        bag.add("Arsan");

        System.out.println("Size of bag: " + bag.size());
        for (String item : bag) {
            System.out.println(item);
        }
    }
}
