
import java.util.*;
public class WearShare {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int Hi = 77;
        System.out.println("Hi after effect " + Hi);

        User userHead = new User();
        Beneficiary beneHead = new Beneficiary();
        Store storeHead = new Store();
        Donor donorHead = new Donor();
        Association assHead = new Association();

        // test
        System.out.println(donorHead.getRewards());    
    // Create additional Beneficiary objects and add them to the end of the list
    Beneficiary bene1 = new Beneficiary(2, "Ali Mohammed", "pass1", "Riyadh", "0512345678", 70, 170, 42.5, null);
    Beneficiary bene2 = new Beneficiary(3, "Mohammed Ali", "pass2", "Jeddah", "0598765432", 80, 175, 40.0, null);
    Beneficiary bene3 = new Beneficiary(4, "Ahmed Khalid", "pass3", "Dammam", "0555555555", 60, 160, 38.5, null);

    // Add beneficiaries to the end of the list using addLast
    beneHead.addLast(bene1);
    beneHead.addLast(bene2);
    beneHead.addLast(bene3);

    // Print the header
    System.out.println(Beneficiary.toStringHeader());
    // Print data for the current object (head)
    System.out.println(beneHead.toString() + "\n\n");
    // Print all objects in the list
    System.out.println(Beneficiary.toStringAll(beneHead) + "\n\n");


    // Create additional Store objects and add them to the end of the list
    Store store1 = new Store(2, "Perfume Shop", "pass1", "Jeddah", "0502345678", "50", "StCode2");
    Store store2 = new Store(3, "Furniture Store", "pass2", "Dammam", "0503456789", "50", "StCode3");
    Store store3 = new Store(4, "Knowledge Bookstore", "pass3", "Medina", "0504567890", "50", "StCode4");
    Store store4 = new Store(5, "Farouq Supermarket", "pass4", "Taif", "0505678901", "50", "StCode5");

    // Add stores to the end of the list using addLast
    storeHead.addLast(store1);
    storeHead.addLast(store2);
    storeHead.addLast(store3);
    storeHead.addLast(store4);

    // Print the header
    System.out.println(Store.toStringHeader());
    // Print data for the current object (head)
    System.out.println(storeHead.toString() + "\n\n");
    // Print all objects in the list
    System.out.println(Store.toStringAll(storeHead) + "\n\n");




    // Create additional Donor objects and add them to the end of the list
    Donor donor1 = new Donor(2, "Mariam Abdullah", "pass1", "Jeddah", "0502222222");
    Donor donor2 = new Donor(3, "Mohammed Sulaiman", "pass2", "Dammam", "0503333333");
    Donor donor3 = new Donor(4, "Layla Mohammed", "pass3", "Medina", "0504444444");
    Donor donor4 = new Donor(5, "Sara Ali", "pass4", "Khobar", "0505555555");

    // Add donors to the end of the list using addLast
    donorHead.addLast(donor1);
    donorHead.addLast(donor2);
    donorHead.addLast(donor3);
    donorHead.addLast(donor4);

    // Print the header
    System.out.println(User.toStringHeader());
    // Print data for the current object (head)
    System.out.println(donorHead.toString() + "\n\n");
    // Print all objects in the list
    System.out.println(User.toStringAll(donorHead) + "\n\n");
    



    // Create additional Association objects and add them to the end of the list
    Association ass1 = new Association(2, "Ass1", "pass1", "Jeddah", "0502222222");
    Association ass2 = new Association(3, "Ass2", "pass2", "Dammam", "0503333333");
    Association ass3 = new Association(4, "Ass3", "pass3", "Medina", "0504444444");
    Association ass4 = new Association(5, "Ass4", "pass4", "Khobar", "0505555555");

    // Add associations to the end of the list using addLast
    assHead.addLast(ass1);
    assHead.addLast(ass2);
    assHead.addLast(ass3);
    assHead.addLast(ass4);


    // Add Clothes to each Association
    // For Association 1
    ass1.getHeadClothes().addLast(new Clothes(101, "Men", 40));
    ass1.getHeadClothes().addLast(new Clothes(102, "Women", 36));

    // For Association 2
    ass2.getHeadClothes().addLast(new Clothes(201, "Child", 30));
    ass2.getHeadClothes().addLast(new Clothes(202, "Men", 42));

    // For Association 3
    ass3.getHeadClothes().addLast(new Clothes(301, "Women", 38));
    ass3.getHeadClothes().addLast(new Clothes(302, "Child", 32));

    // For Association 4
    ass4.getHeadClothes().addLast(new Clothes(401, "Men", 44));
    ass4.getHeadClothes().addLast(new Clothes(402, "Women", 34));

    // Print the header
    System.out.println(User.toStringHeader());
    // Print data for the current object (head)
    System.out.println(assHead.toString() + "\n\n");

    
    // Calls to print lists
    beneList(beneHead);
    storeList(storeHead);
    assList(assHead);
    System.out.println(requestDonor(donor4, ass4, Hi, Hi, Hi,"man"));

    }
    public static boolean logIn(User check   ,  String userName, String password) {
        if ( check.login(check, userName, password) ) {
            System.out.println(" welcome    "+ userName );
        }
        else{
            System.out.println(" please check you name or you password ");
            
        }
        return false;
    }

    public static void generalList() {
        
        System.out.println("");
        
    }

    public static void beneList(Beneficiary beneHead) {
        // Print all objects in the list
        System.out.println(User.toStringAll(beneHead) + "\n\n");
    }

    public static void storeList(Store storeHead) {
        // Print all objects in the list
        System.out.println(User.toStringAll(storeHead) + "\n\n");
    }

    public static void assList(Association assHead) {
        // Print all objects in the list
        System.out.println(User.toStringAll(assHead) + "\n\n");
    }

    public static boolean requestBenf(Beneficiary reqBenf, Association headAss, int clotheID) {
        // Imp
        
        if (headAss.getHeadClothes().searchByID(clotheID) != null) {

            reqBenf.getHeadClothes().addFirst(headAss.getHeadClothes().searchByID(clotheID));

            headAss.getHeadClothes().removeItem(headAss.getHeadClothes().searchByID(clotheID));
            System.out.println("    You got your request :)    ");
            return true;
        }else{


            System.out.println("    You have a problem with your request :(    ");
        }

        return false;
    }

    public static boolean requestDonor(Donor reqDonor, Association headAss, int clotheID,int ID,int size,String type) {
       
        Association temp=headAss;
         Clothes tempClothes=new Clothes();
        temp=(Association) temp.getNext();
        
        if(size >= 0){
            return false;
        }
       
       
      if(temp.getHeadClothes().searchByID(ID)!=null){
        temp.getHeadClothes().addLast(tempClothes);
        reqDonor.addReward();

           return false;
 
         }if("women".equalsIgnoreCase(type)||"men".equalsIgnoreCase(type)||"child".equalsIgnoreCase(type)){
            return false;
          }return false;
          
    }
        
     
    
    

    // public static int ML(BufferedImage image)
    public static int ML(int num) {
        // Imp
        return 0;
    }

    public static boolean useReward(Beneficiary reqBenf, Store headStore, int storeID,Donor heaDonor, int ID, int points, int requiredPoints) {
        boolean hasEnoughPoints;
        if(heaDonor.searchByID(ID)!=null){
           hasEnoughPoints=heaDonor.getRewards()>=points;
           return hasEnoughPoints;
    }   if(headStore.searchByID(storeID)!=null){
        hasEnoughPoints=points>=requiredPoints;
        points=(points-requiredPoints);
        return hasEnoughPoints;


    }return false;
           
           
          
           
         }
         
    // HIIII
    
        }

