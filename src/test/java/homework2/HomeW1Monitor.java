package homework2;

import homework1.Monitor;
import org.junit.jupiter.api.Test;

public class HomeW1Monitor {
    @Test
    public void workingWithMonitor () {
        Monitor firstMonitor = new Monitor();

        firstMonitor.setFabric("Dell");
        firstMonitor.setDiagonal(19);

        System.out.print("Монитор ");
        System.out.println(firstMonitor.getFabric());
        System.out.print("Диагональ экрана: ");
        System.out.print(firstMonitor.getDiagonal());
        System.out.println(" дюймов");

    }
}
