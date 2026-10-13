
class Bill {

    public void total(int quantity, double billPrice) {
        System.out.println("Total bill = " + (quantity * billPrice));
    }

    public static void main(String[] args) {
        Bill b = new Bill();

        b.total(5, 100.0);
    }
}
