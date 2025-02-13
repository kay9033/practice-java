package src;

class CPU {
  private String model;

  public CPU(String model) {
    this.model = model;
  }

  public void process() {
    System.out.println("CPU " + model + " is processing...");
  }
}
