public class Food extends TypeDecorator{
    RoomBook roombook;
    public Food(RoomBook roombook){
        this.roombook = roombook;
    }

    @Override
    public String getDescription() {
        return roombook.getDescription() + ", with Food";
    }

    @Override
    public double cost() {
        return 15.9 + roombook.cost();
    }
}
