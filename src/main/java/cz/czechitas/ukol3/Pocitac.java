package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean JeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (cpu == null){
            System.err.println("Počítač musí mít procesor.");
            return;
        }
        if (ram == null){
            System.err.println("Počítač musí mít paměť.");
            return;
        }
        if (pevnyDisk == null){
            System.err.println("Počítač musí mít disk.");
            return;
        }
        if(jeZapnuty){
            System.err.println("Počítač už je zapnutý.");
            return;
        }
        jeZapnuty = true;
    }

    public void vypniSe() {
        jeZapnuty = false;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }
}


