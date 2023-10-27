package OOP;


public class Program {
    public static void main(String[] args) {
        // Создаем объекты продуктов
        Product chocolate = new Product("Шоколад");

        // Создаем объект нового продукта
        NewProduct newProduct = new NewProduct("Мороженое", 200);

        // Создаем объект вендинг машины
        VendingMachine vendingMachine = new VendingMachine();

        // Добавляем продукты в список продуктов вендинг машины
        vendingMachine.addProduct(chocolate);
        vendingMachine.addProduct(newProduct);

        // Продажа продукта по его индексу
        vendingMachine.sellProduct(0); // Продан продукт: Шоколад
        vendingMachine.sellProduct(1); // Продан продукт: Мороженое
        vendingMachine.sellProduct(2); // Продукта с таким индексом нет
    }
}


