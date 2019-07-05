public class Main {

    public static void main(String[] args) throws InterruptedException {

        Stock stock = new Stock(0);
        stock.countGoods();

        Manufacturer manufacturer = new Manufacturer(stock);
        Consumer consumer = new Consumer(stock);

        manufacturer.start();
        //Thread.sleep(1000);
        consumer.start();
    }
}
//4) Создать класс Склад. Внутри него есть переменная счётчика. Счётчик считает количество товаров на складе.
//a) Создать класс Производитель. Добавить производителю метод увеличения продукции на складе на 1.
//b) Создать класс Потребитель. Добавить потребителю метод уменьшения продукции на складе на 1.
//c) Созать объект Склада. Создать объект Производителя. Создать объект Потребителя.
// Объекты Производителя и Потребителя должны использовать один и тот же Склад.
//d) Создать и запустить 2 потока. 1 поток – Производитель. 2 поток – Потребитель.
// Производитель должен произвести 5 товаров и положить их на склад. Потребитель должен взять 5 товаров со склада и потребить их.
//e) Задача на сообразительность: склад не может содержать более 3 товаров одновременно



/*
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 200; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
        }
        Thread.sleep(1000);

        System.out.println("Counter:" + counter.getCounter());
    }
}

class Counter {
    private long counter = 0L;

    public void increaseCounter() {
        counter++;
    }

    public long getCounter() {
        return counter;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter){
        for (int i = 0; i < 1000; i++) {
            counter.increaseCounter();
        }
        }
    }
}


 */




/*
public class Main {
    public static void main(String[] args)
            throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 200; i++) {
            CounterThread ct =
                    new CounterThread(counter, i+"");
            ct.start();
            //ct.join();
        }
        Thread.sleep(15000);

        System.out.println("Counter:"
                + counter.getCounter());
    }
}

class Counter {
    private long counter = 0L;

    public void increaseCounter() {
        counter++;
    }

    public long getCounter() {
        return counter;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter,
                         String n) {
this.setName(n);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increaseCounter();
        }
        System.out.println(this.getName());
    }
}
 */

/*
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MyThread th = new MyThread();
            th.start();
        }
    }
}

public class MyThread extends Thread {
    public void run() {
        System.out.println("Запуск потока - " + this.getName());
        try {
            System.out.println("Останавливаем поток на 1 секунду - " + this.getName());
            sleep(1000);
        } catch (InterruptedException ie) {
        }
        System.out.println("Завершение потока - " + this.getName());
    }
}

 */