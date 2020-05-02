import com.google.common.collect.Lists;
import persistence.Connector;
import product.Product;
import product.ProductPersistenceHandler;

import java.util.List;


public class GetProductsMain {

    public static void main(String[] args){

        getProducts();
        // to close the opened session
        Connector.close();
        System.out.println("CLosing the session");

    }

    private static  void getProducts(){
        List<String> categories = Lists.newArrayList();
        categories.add("sofa");
        categories.add("chair");

        String brand = "Fab";

        ProductPersistenceHandler handler = new ProductPersistenceHandler();
        List<Product> products = handler.getProductsFor(categories, brand);

        System.out.println(products);
    }

}
