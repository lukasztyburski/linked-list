import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

//        list.push("Ala");
//        list.push("Stefan");
//        list.push("Maryna");
//        list.push("Jarek");


//        list.unshift("Ala");
//        list.unshift("Stefan");
//        list.unshift("Maryna");
//        list.unshift("Jarek");


//        list.push(41);
//        list.push(2);
//        list.push(-4);
//        list.push(17);

        list.unshift(41);
        list.unshift(2);
        list.unshift(-4);
        list.unshift(17);


        try {
            System.out.println("List size = " + list.getSize() + "\nElement value: " + list.shift());
            System.out.println("List size = " + list.getSize() + "\nElement value: " + list.shift());
            System.out.println("List size = " + list.getSize() + "\nElement value: " + list.shift());
            System.out.println("List size = " + list.getSize() + "\nElement value: " + list.shift());
            System.out.println("List size = " + list.getSize() + "\nElement value: " + list.shift());
            System.out.println("List size = " + list.getSize());
        } catch (EmptyListException e) {
            e.printStackTrace();
        }
    }
}
