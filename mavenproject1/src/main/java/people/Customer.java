
package people;

import values.CustomerRole;

public class Customer {
    CustomerRole role;
    String id;
    String fullname;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    
    void sayMenu(){
        
    }
    
    void buyFood(){
        
    }
    
    void cancelBuy(){
        
    }
    
    void sellFood (){
        if (this.role != CustomerRole.ADMINISTRATIVE){
            System.out.println("usted no tiene permiso para vender!");
        }
    }
}
