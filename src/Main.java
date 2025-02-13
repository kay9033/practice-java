package src;

public class Main {
  public static void main(String[] args) {
    CPU cpu = new CPU("intel i9");
    Memory memory = new Memory(16);

    Computer computer = new Computer(cpu, memory);

    computer.run();
  }
}
