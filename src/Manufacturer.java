public class Manufacturer extends Thread {

    Stock stock;

    public int increaseGoods() {
        return stock.getGoods() + 1;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        synchronized (stock) {
            for (int i = 0; i < 5; i++)
                increaseGoods();
            System.out.println(getName());
        }
    }
}
//a) Создать класс Производитель. Добавить производителю метод увеличения продукции на складе на 1.
// Производитель должен произвести 5 товаров и положить их на склад.