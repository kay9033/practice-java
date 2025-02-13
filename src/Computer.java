package src;

class Computer {
  private CPU cpu;
  private Memory memory;

  public Computer(CPU cpu, Memory memory) {
    this.cpu = cpu;
    this.memory = memory;
  }

  public void run() {
    cpu.process();
    memory.load();
    System.out.println("Computer is running ...");
  }
}
