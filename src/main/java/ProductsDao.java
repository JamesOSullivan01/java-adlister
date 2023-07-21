import java.util.List;

interface ProductsDao {
    List<Product> all(); // get all the product records
    void insert(Product product); // persist new product to the database
}
