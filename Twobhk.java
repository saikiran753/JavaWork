public class Twobhk extends TypeDecorator{
    RoomBook roombook;
    public Twobhk(RoomBook roombook){
        this.roombook = roombook;
    }

    @Override
    public String getDescription() {
        return roombook.getDescription() + ", with Two bedrooms";
    }

    @Override
    public double cost() {
        return 31.9 + roombook.cost();
    }
}
