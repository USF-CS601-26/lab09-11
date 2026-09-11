package coherence;

import java.util.List;

// TODO: Analyze if cohesion of this class is high or low, explain why
// If cohesion can be improved, explain how
public class Order {
    private String orderId;
    private List<Item> items;
    private double total;

    public void addItem(Item item) {
        items.add(item);
        total += item.getPrice();
    }

    public double getTotal() { return total; }

    public void printInvoice() {
        System.out.println("Order " + orderId + " total: $" + total);
    }

    public void saveToDatabase() {
        // Pretend we save to the database
    }

    public void sendConfirmationEmail() {
        // code to email customer
    }

    public class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price * quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}

