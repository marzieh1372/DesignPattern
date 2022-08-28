package designpattern.factory;


public class Main {

    public static void main(String[] args) {

        Computer computerPC= ComputerFactory.getComputer("PC","ramPC","hddPC","cpuPC");
        System.out.println("computerPC.getCPU() = " + computerPC.getCPU());
        System.out.println("computerPC.getHDD() = " + computerPC.getHDD());
        System.out.println("computerPC.getRAM() = " + computerPC.getRAM());

    }
}
