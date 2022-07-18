package LinkedList;


public class Test {
    public static void main(String[] args) {
     MyLinkedList<String> myLinkedList=new MyLinkedList();
        //添加元素
        try {
            myLinkedList.add("Luo");
            myLinkedList.add("bin");
            myLinkedList.add("handsome");
        } catch (Exception e) {
           e.getMessage();
        }

        System.out.println("添加元素后：");
       myLinkedList.toString(myLinkedList);
       //在头部添加元素
        try {
            myLinkedList.addAtHead("Jay Chou");
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("在头部添加元素后：");
        myLinkedList.toString(myLinkedList);
        //在指定位置添加元素：
        myLinkedList.addAtIndex(1,"Mojito");
        System.out.println("在指定位置添加元素后");
        myLinkedList.toString(myLinkedList);
        //在末尾添加元素：
        myLinkedList.addAtTail("JayChou");
        System.out.println("在末尾添加元素后");
        myLinkedList.toString(myLinkedList);
        //在末尾添加元素：
        myLinkedList.deleteAtIndex(2);
        System.out.println("删除第三个位置元素后：");
        myLinkedList.toString(myLinkedList);

    }
}
