
public class ContactNumber {

    private String name;
    private String phoneNumber;
    private String email;
    private String group;
    
    public static void main (String[] args) {
    	ContactNumber contact1 = new ContactNumber();
    	contact1.name = "어머니";
    	contact1.phoneNumber = "010-3560-4096";
    	contact1.email = "swj1115@gamil.com";
    	contact1.group = "가족";
    	System.out.println(contact1.name + " : " + contact1.phoneNumber + ", 이메일 - " + contact1.email + " (" + contact1.group + ")");
    }
}
