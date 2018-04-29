package facede;

import component.Cpu;
import component.Memory;
import component.HardDisk;

public class Computer {

  private Cpu cpu;
  private Memory memory;
  private HardDisk hard_disk;

  public Computer() {
    this.cpu = new Cpu();
    this.memory = new Memory();
    this.hard_disk = new HardDisk();
  }

  public void initialize() {
    cpu.start();
    memory.load("Hello World!");
    hard_disk.read();
  }

}
