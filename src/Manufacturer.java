public class Manufacturer extends Thread {

    Stock stock;

    public Manufacturer(Stock stock) {
        this.stock = stock;
    }

    public void increaseGoods() {
        stock.setGoods(stock.getGoods() + 1);
        //stock.countGoods();
        //return stock.getGoods() + 1;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        synchronized (stock) {
            for (int i = 0; i < 5; i++)
                increaseGoods();
            System.out.println(getName() + " " + stock.getGoods());
        }
    }
}
//a) Создать класс Производитель. Добавить производителю метод увеличения продукции на складе на 1.
// Производитель должен произвести 5 товаров и положить их на склад.