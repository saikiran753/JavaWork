public class Ac extends TypeDecorator{
    RoomBook roombook;
    public Ac(RoomBook roombook){
        this.roombook = roombook;
    }

    @Override
    public String getDescription() {
        return roombook.getDescription() + ", with AC";
    }

    @Override
    public double cost() {
        return 6 + roombook.cost();
    }
}
