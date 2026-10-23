class TicketCounter {
    int tickets = 10;

    synchronized void book(String name, int count) {
        if (tickets >= count) {
            System.out.println(name + " booked " + count + " tickets");
            tickets -= count;
        } else {
            System.out.println(name + " booking failed");
        }
    }
}

class Customer extends Thread {
    TicketCounter counter;
    String name;

    Customer(TicketCounter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    public void run() {
        counter.book(name, 4);
    }
}

class Booking {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter tc = new TicketCounter();

        Customer c1 = new Customer(tc, "Customer 1");
        Customer c2 = new Customer(tc, "Customer 2");
        Customer c3 = new Customer(tc, "Customer 3");

        c1.start();
        c2.start();
        c3.start();

        c1.join();
        c2.join();
        c3.join();

        System.out.println("Remaining tickets: " + tc.tickets);
    }
}