package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;


    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }


    public void vytvorSouboryOVelikosti(long velikost){
        if (!jeZapnuty){
            System.err.println("Počítač je vypnutý.");
            return;
        }
        long volneMisto = pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto();

        if(volneMisto >= velikost){
           pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
            return;
        }
         volneMisto = druhyDisk.getKapacita() - druhyDisk.getVyuziteMisto();
        if (volneMisto >= velikost){
            druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() + velikost);
            return;
        }
        System.err.println("Kapacita paměti není dostatečně velká.");


    }
    public void vymazSouboryOVelikosti(long velikost){
        if (!jeZapnuty){
            System.err.println("Počítač je vypnutý.");
            return;
        }

        if (velikost <= druhyDisk.getVyuziteMisto() ){
            druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() - velikost);
            return;
        }
        if (velikost <= pevnyDisk.getVyuziteMisto() ) {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
            return;
        }
        System.err.println("Špatná velikost mazaného souboru.");
    }


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
        if (jeZapnuty){
            return "Pocitac" +
                    " je zapnutý. " +
                      cpu +
                    ram + pevnyDisk + " " + druhyDisk;
        }
        return "Pocitac" +
                " je vypnutý. " +
                 cpu +
                ram +
                pevnyDisk + " " + druhyDisk;
    }
}


