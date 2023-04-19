public class Main {
    public static void main(String[] args) {
        RoomBook roombook2 = new DeluxeRoom();
        System.out.println(roombook2.getDescription() + "$" + roombook2.cost());
        RoomBook roombook6 = new DeluxeRoom();
        roombook6 = new Ac(roombook6);
        System.out.println(roombook6.getDescription() + "$" + roombook6.cost());
        RoomBook roombook3 = new DeluxeRoom();
        roombook3 = new Food(roombook3);
        System.out.println(roombook3.getDescription() + "$" + roombook3.cost());
        roombook2 = new Onebhk(roombook2);
        System.out.println(roombook2.getDescription() + "$" + roombook2.cost());
        RoomBook roombook7 = new DeluxeRoom();
        roombook7 = new Twobhk(roombook7);
        System.out.println(roombook7.getDescription() + "$" + roombook7.cost());
        RoomBook roombook = new DeluxeRoom();
        roombook = new Onebhk(roombook);
        roombook = new Ac(roombook);
        roombook = new Food(roombook);
        System.out.println(roombook.getDescription() + "$" + roombook.cost());
        RoomBook roombook4 = new SuiteRoom();
        System.out.println(roombook4.getDescription() + "$" + roombook4.cost());
        roombook4 = new Ac(roombook4);
        System.out.println(roombook4.getDescription() + "$" + roombook4.cost());
        RoomBook roombook5 = new SuiteRoom();
        roombook5 =new Food(roombook5);
        System.out.println(roombook5.getDescription() + "$" + roombook5.cost());
        RoomBook roombook1 = new SuiteRoom();
        roombook1 = new Onebhk(roombook1);
        System.out.println(roombook1.getDescription() + "$" + roombook1.cost());
        RoomBook roombook8 = new SuiteRoom();
        roombook8 = new Twobhk(roombook8);
        System.out.println(roombook8.getDescription() + "$" + roombook8.cost());
    }
}