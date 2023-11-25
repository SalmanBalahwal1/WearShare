import static org.junit.Assert.assertEquals;

import org.junit.*;

public class WearShareTest {
    @Test
    public void requestDonorTest() {
    Donor donorhead=new Donor();
    Donor  donor1 = new Donor(2, "Mariam Abdullah", "pass1", "Jeddah", "0502222222");
    Donor donor2 = new Donor(3, "Mohammed Sulaiman", "pass2", "Dammam", "0503333333");
    donorhead.addLast(donor1);
    donorhead.addLast(donor2);
     
    Association assHead=new Association();
    Association ass1 = new Association(2, "Ass1", "pass1", "Jeddah", "0502222222");
    Association ass2 = new Association(3, "Ass2", "pass2", "Dammam", "0503333333");
    assHead.addLast(ass1);
    assHead.addLast(ass2);
    ass1.getHeadClothes().addLast(new Clothes(101, "Men", 40));
    ass1.getHeadClothes().addLast(new Clothes(102, "Women", 36));

    assertEquals(WearShare.requestDonor((Donor)donorhead.getNext(), (Association)assHead.getNext(), 10, 40, "Men"),true);
     
    
    }


    @Test
    public void useRewardTest() {
   Beneficiary beneHead=new Beneficiary();
   Beneficiary bene1 = new Beneficiary(2, "Ali Mohammed", "pass1", "Riyadh", "0512345678", 70, 170, 42.5, null);
   beneHead.addLast(bene1);

   Store storeHead=new Store();
   Store store1 = new Store(2, "Perfume Shop", "pass1", "Jeddah", "0502345678", "50", "StCode2");
   storeHead.addLast(store1);

    Donor donorhead=new Donor();
    Donor  donor1 = new Donor(2, "Mariam Abdullah", "pass1", "Jeddah", "0502222222");
    donorhead.addLast(donor1);

    assertEquals(WearShare.useReward((Beneficiary) beneHead.getNext(), (Store) storeHead.getNext(), 20, (Donor)donorhead.getNext(), 1, 30, 10),true);



    }
}
