public enum PlaneType {

    BOEING747(2,10),
    BOEING68(10,2);
    private  final int capacity;
    private final int totalWeight;


    PlaneType(int capacity,int totalWeight){
        this.capacity=capacity;
        this.totalWeight=totalWeight;

    }
    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
