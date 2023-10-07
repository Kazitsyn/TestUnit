# Homework 1

Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и 
возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. 
Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. 
Не забудьте написать тесты для проверки этого поведения.

*Задание 2. (необязательное) *
Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(), 
который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, 
что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. 
Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product для создания экземпляров продуктов и класс Shop для написания методов сортировки и тестов.

*** 

## Task 1

В классе Calculator метод calculateDiscount

:::code source="Calculator/Calculator.java" range="45-60":::

```Java
     public static double calculatingDiscount(double purchaseAmount, int discountAmount) {

        try {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (purchaseAmount < 0 || discountAmount  < 0 || discountAmount > 100){
        throw new ArithmeticException();
        }
        double discount = purchaseAmount * discountAmount / 100;
        return purchaseAmount - discount; // Метод должен возвращать сумму покупки со скидкой

        } catch (ArithmeticException e) {
        System.err.println("\nнедопустимые аргументы\n");
        return -1; // Метод должен возвращать сумму покупки со скидкой
        }
        }   
```


Тесты для проверки метода calculateDiscount

```Java
        System.out.println(seminars.first.Calculator.Calculator.calculatingDiscount(1000,20));
        if (800 != seminars.first.Calculator.Calculator.calculatingDiscount(1000,20)){
        throw new AssertionError("Ошибка в методе");
        }
        assert 800 == seminars.first.Calculator.Calculator.calculatingDiscount(1000,20);
        assertThat(seminars.first.Calculator.Calculator.calculatingDiscount(1000,20)).isEqualTo(800);
        assertThat(seminars.first.Calculator.Calculator.calculatingDiscount(1000,1000)).isEqualTo(-1);

```


***

## Task 2*

 Добавлены два новых метода в класс Shop, для использования встроеной сортировки в класс Product подключен интерфейс Comparable

```Java
      @Override
public int compareTo(Product o) {
        if (this.cost == o.getCost()){
            return 0;
        } else if (this.cost < o.getCost()) {
            return -1;
        }else {
            return 1;
        }
}  
```

```Java
    public List<Product> sortProductsByPrice() {
        this.products.sort(Product::compareTo);
        return this.products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        sortProductsByPrice();
        return this.products.get(products.size()-1);
    }
```


Тесты 


```Java
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
```