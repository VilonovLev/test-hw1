package org.example.Shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    /*
       1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов,
       верное содержимое корзины).
       2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
       3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
    */
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(170,"beacon"));
        productList.add(new Product(250,"beef"));
        productList.add(new Product(100,"water"));
        Shop shop = new Shop();
        shop.setProducts(productList);

        assertThat(shop.getProducts().size()).isEqualTo(3);
        assertThat(shop.getProducts()).isEqualTo(productList);

        assertThat(shop.getMostExpensiveProduct().getCost())
                .isEqualTo(250);

        assertThat(shop.sortProductsByPrice())
                .isSortedAccordingTo(Comparator.comparing(Product::getCost));


    }


}