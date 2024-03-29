public class Consumer extends Thread {

    Stock stock;

    public Consumer(Stock stock) {
        this.stock = stock;
    }

    public void decreaseGoods() {
        stock.setGoods(stock.getGoods() - 1);
        //stock.countGoods();
        //return stock.getGoods() - 1;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        synchronized (stock) {
            for (int i = 0; i < 5; i--)
                decreaseGoods();
            System.out.println(getName() + " " + stock.getGoods());
        }
    }
}
//b) Создать класс Потребитель. Добавить потребителю метод уменьшения продукции на складе на 1.
// Потребитель должен взять 5 товаров со склада и потребить их.

