public class Main {
    public static  void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("10");
        queue.enqueue("20");
        queue.enqueue("30");

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("sisa Queue: ");
        for (String item : queue){
            System.out.println(item);
        }
    }
}
