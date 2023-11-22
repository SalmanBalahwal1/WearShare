public class Donor extends User {
    // Class fields
    private Reward rewards;

    // Constructor
    public Donor(){
        this(1, "Donor", "1Donor", "X", "0000000000");
    }

    public Donor(int ID, String name, String password, String location, String phoneNumber) {
        super(ID, name, password, location, phoneNumber);
        rewards = new Reward(ID);
    }

    // Add reward
    public boolean addReward() {
        rewards.addReward();
        return true;
    }

    // Delete reward
    public boolean deleteReward() {
        rewards.deleteReward();
        return true;
    }

    // Print donor information
    @Override
    public String toString() {
        return super.toString() + "\t" +
               "Rewards: " + getRewards();
    }    

    // Getter and setter methods

    public int getRewards() {
        return rewards.getSumReward();
    }

    public void setRewards(int newReward) {
        this.rewards.setSumReward(newReward);
    }


}


