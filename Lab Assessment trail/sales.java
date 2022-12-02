import java.util.*;
class Product{
    String name,id;
    int quantity,cost;
    Product(String name,String id,int quantity,int cost){
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.cost = cost;
    }
    double computePrice(int quantity){
        int cost = 150;
        return quantity*cost;
    }
    static void displayAll(){
        System.out.println("All products displayed!");
    }
    static void displayAll(Food[] f, Cosmetics[] c,Toys[] t){
        System.out.println("Total Products: "+(Food.count+Cosmetics.count+Toys.count));
        System.out.println("\nFood Products: ");
        Food.display(f);
        System.out.println("\nCosmetics: ");
        Cosmetics.display(c);
        System.out.println("\nToys: ");
        Toys.display(t);
    }
}
class Food extends Product{
    static int count = 0;
    static int discount = 20;
    Food(String name,int quantity){
        super(name, "F"+count, quantity, 200);
        count++;
    }
    double computePrice(int quantity){
        return quantity*cost*(discount/100.00);
    }
    static void display(Food[] f){
        for(int i=0;i<Food.count;i++){
            System.out.println("\nName: "+f[i].name+"\nId: "+f[i].id+"\nCost: "+f[i].cost+"\nQuantity: "+f[i].quantity+
                               "\nDiscount: "+Food.discount+"\nTotal Cost: "+f[i].computePrice(f[i].quantity));
        }
    }
}
class Cosmetics extends Product{
    static int count = 0;
    static int discount = 25;
    Cosmetics(String name,int quantity){
        super(name, "C"+count, quantity, 100);
        count++;
    }
    double computePrice(int quantity){
        return quantity*cost*(discount/100.00);
    }
    static void display(Cosmetics[] c){
        for(int i=0;i<Cosmetics.count;i++){
            System.out.println("\nName: "+c[i].name+"\nId: "+c[i].id+"\nCost: "+c[i].cost+"\nQuantity: "+c[i].quantity+
                               "\nDiscount: "+Cosmetics.discount+"\nTotal Cost: "+c[i].computePrice(c[i].quantity));
        }
    }
}
interface Accessories{
    int discount = 15;
    double getPrice(int quantity);
}
class Toys extends Product implements Accessories{
    static int count = 0;
    Toys(String name,int quantity){
        super(name, "T"+count, quantity, 50);
        count++;
    }
    double computePrice(int quantity){
        return getPrice(quantity);
    }
    public double getPrice(int quantity){
        return quantity*cost*(discount/100.00);
    }
    static void display(Toys[] t){
        for(int i=0;i<Toys.count;i++){
            System.out.println("\nName: "+t[i].name+"\nId: "+t[i].id+"\nCost: "+t[i].cost+"\nQuantity: "+t[i].quantity+
                               "\nDiscount: "+Toys.discount+"\nTotal Cost: "+t[i].computePrice(t[i].quantity));
        }
    }
}
public class sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=1,type,quantity;
        String name;
        Food[] f = new Food[50];
        Cosmetics[] c = new Cosmetics[50];
        Toys[] t = new Toys[50];
        while(op==1){
            System.out.print("Product Type:\n1. Food\n2. Cosmetics\n3. Toys\nEnter choice: ");
            type = sc.nextInt();
            System.out.print("Product Name: ");
            name = sc.next();
            System.out.print("Quantity: ");
            quantity = sc.nextInt();
            if(type==1) f[Food.count] = new Food(name, quantity);
            else if(type==2) c[Cosmetics.count] = new Cosmetics(name, quantity);
            else if(type==3) t[Toys.count] = new Toys(name, quantity);
            System.out.print("Press 1 for further purchase... ");
            op = sc.nextInt();
        }
        sc.close();
        Product.displayAll(f, c, t);
    }
}