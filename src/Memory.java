package src;

class Memory {
  private int capacity;

  public Memory(int capacity) {
    this.capacity = capacity;
  }

  public void load() {
    System.out.println("Loadind data into" + capacity + "GB memory...");
  }
}
