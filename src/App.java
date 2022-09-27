public class App {
    public static void main(String[] args) throws Exception {
        //create object
        Product product = new Product();
        //product.getProdid(1);
        product.setvalues(1,"shiva", 1000);
        product.displayvalues();

        Product product1 = new Product();
        //product1.getProdid(2);
        product1.setvalues(2,"aneesh", 12222);
        product1.displayvalues();
        
        TV tv = new TV();
        //tv.getProdid(3);
        tv.setvalues(3,"telivision",1111,"zoho",2);
        tv.displayvalues();
    }
}
class Product
{
    int prodid;
    String name;
    int price;

    //constructor
    Product()
    {
        System.out.println(">>Product object is created");        
    }
    void setvalues(int prodid,String name,int price)
    {
        this.prodid=prodid;
        this.name=name;
        this.price=price;
    }
    void displayvalues()
    {
        System.out.println("-----------Product id is "+prodid+"---------");
        System.out.println("name is "+name);
        System.out.println("price is "+price);
        System.out.println("-----------------------------------------------------------");
    }
    /*void getProdid(int prodid)
    {
        this.prodid=prodid;

    }
    int setProdid()
    {
        return prodid;
    }*/
}
class TV extends Product
{
    String tvname;
    int size;
    //size in gb

    TV()
    {
        System.out.println(">>Tv object is created");
    }
    void setvalues(int prodid,String name,int price,String tvname,int size)
    {
        this.prodid=prodid;
        this.tvname=tvname;
        this.size=size;
        this.name=name;
        this.price=price;
    }
    void getProdid(int prodid)
    {
        this.prodid=prodid;

    }
    int setProdid()
    {
        return prodid;
    }
    void displayvalues()
    {
        System.out.println("-----------Product id is "+prodid+"---------");
        System.out.println("name is "+name);
        System.out.println("price is "+price);
        System.out.println("tvname is "+tvname);
        System.out.println("size is "+size);
        System.out.println("-----------------------------------------------------------");
    }
}