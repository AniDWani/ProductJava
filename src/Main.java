import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProductService service = new ProductService();

        //Add the products
        service.addProduct(new Product("Asus vivobook", "Laptop","Brown Table", 2012));
        service.addProduct(new Product("Google vivobook", "Laptop","Brown Table", 2022));
        service.addProduct(new Product("Redme vivobook", "Laptop","Brown Table", 2023));
        service.addProduct(new Product("Ariel vivobook", "Laptop","Brown Table", 2009));
        service.addProduct(new Product("Yoga vivobook", "Laptop","Brown Table", 2006));
        service.addProduct(new Product("Linux vivobook", "Laptop","Brown Table", 2001));
        service.addProduct(new Product("Honda vivobook", "Laptop","Brown Table", 2009));
        service.addProduct(new Product("Asus vivobook", "Laptop","Brown Table", 2005));
        service.addProduct(new Product("Java vivobook", "Laptop","Grey Table", 2006));
        service.addProduct(new Product("Asus vivobook", "Laptop","Brown Table", 2007));
        service.addProduct(new Product("Asus macbook", "Laptop","Brown Table", 2006));
        service.addProduct(new Product("Asus vivobook", "Laptop","Brown Table", 2018));
        service.addProduct(new Product("Asus vivobook", "Laptop","Brown Table", 2022));
        service.addProduct(new Product("Asus vivobook", "Laptop","Brown Table", 2032));
        service.addProduct(new Product("Asus hatbook", "Laptop","Brown Table", 2022));

        List<Product> products = service.getAllProducts();
        for (Product p : products){
            System.out.println(p);
        }
        System.out.println("==============================================");
        System.out.println("a particular product");

        Product p = service.getProduct("Honda audiobook");
        System.out.println(p);


        System.out.println("==============================================");
        System.out.println("a particular text");

        List<Product> prods = service.getProductWithText( "Brown");
        for(Product Product : prods){
            System.out.println(Product);

        }
    }
}
