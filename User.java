public class User {
    // Class fields
    protected int ID;
    protected String name;
    protected String password;
    protected String location;
    protected String phoneNumber;
    protected String info;
    protected User next;
    
    // Constructor
    public User(){
        this(1, "User", "1Use", "X", "0000000000");
    }
    public User(int ID, String name, String password, String location, String phoneNumber){
        this(ID, name, password, location, phoneNumber, "");
    }
    public User(int ID, String name, String password, String location, String phoneNumber, String info) {
        this.ID = ID;
        this.name = name;
        this.password = password;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.info = info;
        this.next = null;
    }

    // Checking username & password
    public boolean login(User UserHead, String userName, String password) {  
        User temp = UserHead;
            while (temp != null) {
                if (temp.getName() == userName && temp.getPassword() == password) {
                return true;
            }
            temp = temp.getNext();
        }  
        return false;
    }

    // Check if it is Empty
    public boolean isEmpty() {
        return this.getNext() == null;
    }

    // Printing information for all users in the list
    public void printList() {
        User temp = this;
        while (temp != null) {
            System.out.println(temp.toString());
             temp = temp.getNext();
        }
    }

    // Find User based on ID
    public User searchByID(int ID) {
        User temp = this;
            while (temp != null) {
                if (temp.getID() == ID) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    // Add User in First
    public User addFirst(User newHead) {
        newHead.setNext(this);
        return newHead;
    }

    // Add User in Last
    public void addLast(User newNode) {
        User temp = this;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    // Remove Head (First node)
    public void removeFirst() {
        if (this.next == null) return;
        this.next = this.next.getNext();
    }
    

    // Remove Last node
    public void removeLast() {
        if (this.next == null) return;
    
        User temp = this;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    
    // Remove a target User
    public boolean removeItem(User target) {
        if (this.next == null) return false;
        if (this.next.getID() == target.getID()) {
            this.next = this.next.next;
            return true;
        }
    
        User temp = this;
        while (temp.next != null) {
            if (temp.next.getID() == target.getID()) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    

    //              toString  & getters & Setters

// Print header with attribute names
public static String toStringHeader() {
    return "ID\tName\tPassword\tLocation\tPhone Number\tAdditional Info\tNext User";
}

// Print data for the current object
@Override
public String toString() {
    return ID + "\t" + name + "\t" + password + "\t" + location + "\t" + phoneNumber + "\t" + info + "\t" + (next != null ? next.getName() : "None");
}

// Print all objects in the list
public static String toStringAll(User head) {
    StringBuilder sb = new StringBuilder();
    sb.append(toStringHeader()).append("\n");
    User current = head;
    while (current != null) {
        sb.append(current.toString()).append("\n");
        current = current.getNext();
    }
    return sb.toString();
}






    // Print user information
    

    // Getter and setter methods

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public User getNext() {
        return next;
    }

    public void setNext(User next) {
        this.next = next;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
