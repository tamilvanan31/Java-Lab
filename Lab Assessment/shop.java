import java.util.*;

interface accessories {
    void checkOffer();
}

class product {
    int id, quantity;
    double cost;
    String name;    
    double discount;
    static int count;

    product(int id, double cost, int quantity, String name) {
        this.id = id;
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }
    void discountCal() {
        discount = 0.05;
    }
    void costCal() {
        cost = cost * quantity;
        cost = cost - (cost * discount);
        System.out.println("The cost of " + name + " is " + cost);
        pdtCount();
    }
   
    static void pdtCount() {
        count = count + 1;
    }
}

class cosmetics extends product {
    cosmetics(int id, double cost, int quantity, String name) {
        super(id, cost, quantity, name);
    }

    void discountCal() {
        discount = 0.1;
    }
}

class food extends product {
    food(int id, double cost, int quantity, String name) {
        super(id, cost, quantity, name);
    }

    void discountCal() {
        discount = 0.2;
    }
}
class toys extends product implements accessories {
    toys(int id, double cost, int quantity, String name) {
        super(id, cost, quantity, name);
    }

    void discountCal() {
        discount = 0.15;
    }
    void discountCal(int cost) {
        if(cost > 70){
            discount = 0.25;
        }
        discount = 0.15;
    }
    public void checkOffer() {
        System.out.println("No offer available for toys");
    }
}

public class shop {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int opt;
            System.out.println("Welcome!\n1. Food \n2. Cosmetics \n3.Toys\n4. Exit");
            System.out.print("Enter choice:");
            opt = sc.nextInt();
            if(opt == 4)
                break;
            int id, quantity;
            double cost;
            String name;
            System.out.print("Enter id: ");
            id = sc.nextInt();
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.print("Enter the cost of 1 quantity: ");
            cost = sc.nextDouble();
            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            if(opt == 1) {
                food rice = new food(id, cost, quantity, name);
                rice.discountCal();
                rice.costCal();
            }
            else if(opt == 2){
                cosmetics cos = new cosmetics(id, cost, quantity, name);
                cos.discountCal();
                cos.costCal();
            }
            else if(opt == 3) {
                toys car = new toys(id, cost, quantity, name);
                car.discountCal();
                car.costCal();
                car.checkOffer();
            }
        }
        System.out.println("Total types of product : " + product.count);
    }
}