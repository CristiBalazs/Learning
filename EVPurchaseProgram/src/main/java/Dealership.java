public class Dealership{

   private boolean stock;
   private int price;

   public Dealership(boolean stock, int price) {
      this.stock = stock;
      this.price = price;
   }

   public boolean isStock() {
      return stock;
   }

   public Dealership setStock(boolean stock) {
      this.stock = stock;
      return this;
   }

   public int getPrice() {
      return price;
   }

   public Dealership setPrice(int price) {
      this.price = price;
      return this;
   }



   @Override
   public String toString() {
      return "\nStock" + stock + "\nPrice" + price;
   }

}
