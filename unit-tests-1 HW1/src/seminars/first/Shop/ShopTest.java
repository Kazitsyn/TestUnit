package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
/*
 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
 */
public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = new Product(100, "Cola");
        Product product2 = new Product(99, "Pepsi");
        Product product3 = new Product(110, "Sok");
        Product product4 = new Product(80, "Water");
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        shop.setProducts(products);
        List<Product> sortProducts = new ArrayList<>();
        sortProducts.add(product4);
        sortProducts.add(product2);
        sortProducts.add(product1);
        sortProducts.add(product3);


        // Проверка что магазин хранит верный список продуктов
        if (4 != shop.getProducts().size()) {
            throw new AssertionError("Ошибка в классе");
        }
        assert 4 == shop.getProducts().size();
        assertThat(shop.getProducts().size()).isEqualTo(4);
        assertThat(shop.getProducts()).isEqualTo(products);

        //Проверка корректности работы метода getMostExpensiveProduct.
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product3);

        //Проверка корректности работы метода sortProductsByPrice
        assertThat(shop.sortProductsByPrice()).isEqualTo(sortProducts);
    }
}