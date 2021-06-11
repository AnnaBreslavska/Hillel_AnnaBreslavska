package Homework_11;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HoweWorkWithStreams {


    public static void main(String[] args) {

        List<Computer> computerList = ComputerCollection.computersList();

        List<Computer> computerWindows = computerList.stream().filter(computer -> computer.getOS().equals("Windows"))
                .collect(Collectors.toList());
        System.out.println("1. In Computer List there are " + computerWindows.stream().count() + " computers on Windows");

        List <Computer> computersWithSSD = computerList.stream().filter(computer -> computer.getStorage().getStorageType().equals("SSD"))
                .collect(Collectors.toList());
        System.out.println("2. In Computer List there are " + computersWithSSD.stream().count() + " computers with SSD");

        List<Double> computerPrices = computerList.stream().mapToDouble(Computer::getPrice).boxed().collect(Collectors.toList());
        System.out.println("3. In Computer List there are the following Prices: " + computerPrices);

        System.out.println("4. 3d minimal price from lowest to high: "+ computerPrices.stream().sorted().skip(2).findFirst().get());

        boolean isThereNoDOSOS=computerList.stream().noneMatch(computer -> computer.getOS().equals("DOS"));
        System.out.println("6. Is there no computer with DOS operation system? " + isThereNoDOSOS);

        boolean isThereMacOS = computerList.stream().anyMatch(computer -> computer.getOS().equals("MacOS"));
        System.out.println("7. is there any computer with Mac operation system? " + isThereMacOS);

//        Map<Integer, Computer> mapOfComputerList =computerList.stream().collect(Collectors
//                .toMap();





    }
}
