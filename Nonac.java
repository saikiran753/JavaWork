public class Nonac extends TypeDecorator{
    RoomBook roombook;

    @Override
    public String getDescription() {
        return roombook.getDescription() + ", with NON-AC";
    }

    @Override
    public double cost() {
        return 0 + roombook.cost();
    }
}
