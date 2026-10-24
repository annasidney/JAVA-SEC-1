class BillGeneration {

    void bill(int quantity, int price) {
        System.out.println("Total Bill: " + (quantity * price));
    }

    void bill(int quantity, double price) {
        System.out.println("Total Bill: " + (quantity * price));
    }

    public static void main(String[] args) {
        BillGeneration b = new BillGeneration();

        b.bill(5, 20);
        b.bill(3, 15.5);
    }
}
