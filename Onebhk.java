public class Onebhk extends  TypeDecorator {
    RoomBook roombook;
    public Onebhk(RoomBook roombook){
        this.roombook = roombook;
    }
    public String getDescription(){
        return roombook.getDescription() + ", with one bedroom";
    }

    @Override
    public double cost() {
        return 21.9 + roombook.cost();
    }
}
