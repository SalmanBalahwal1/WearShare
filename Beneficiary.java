public class Beneficiary extends User{
    // Class fields
    private int weight;
    private int tall;
    private double shoesSize;
    private Clothes headClothes;

    // Constructor
    public Beneficiary(){
        this(1, "Bene", "1Bene", "X", "0000000000", 1, 1, 1, null);
    }

    public Beneficiary(int ID, String name, String password, String location, String phoneNumber, int weight, int tall, double shoesSize, Clothes headClothes) {
        super(ID, name, password, location, phoneNumber);
        this.weight = weight;
        this.tall = tall;
        this.shoesSize = shoesSize;
        this.headClothes = new Clothes();
    }

    // Print beneficiary information
    @Override
    public String toString() {
        return super.toString() + "\t" + 
                "Weight: " + weight + "\t" +
                "Tall: " + tall + "\t" +
                "Shoe Size: " + shoesSize + "\t"
                + "\t\n" + "Clothes:\n" + (headClothes != null ? headClothes.toString() : "None");
            }

    

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public double getShoeSize() {
        return shoesSize;
    }

    public void setShoeSize(double shoesSize) {
        this.shoesSize = shoesSize;
    }

    public Clothes getHeadClothes(){
        return this.headClothes;
    }

    
}
