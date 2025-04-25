public class Main {
    public static void main(String[] args) {

        Product[] products=new Product[7];
        products[0]=new DigitalProduct("Samsung S22 Ultra",1500,128);
        products[1]=new DigitalProduct("Samsung S23 Ultra",2400,512);
        products[2]=new DigitalProduct("Samsung S24 Ultra",1780,128);
        products[3]=new DigitalProduct("Apple Iphone 16 Pro Max",1100,64);
        products[4]=new DigitalProduct("Apple Iphone 15 Pro Max",1250,256);
        products[5]=new PhysicalProduct("Potato",160,1);
        products[6]=new PhysicalProduct("Suger",250,10);

        for(int i=0;i<7;i++){
            products[i].displayInfo();
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.println(products[i].getName()+": $"+products[i].applyDiscount(.15));
        }
    }
}