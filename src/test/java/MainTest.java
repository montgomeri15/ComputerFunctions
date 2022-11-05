import org.example.Computer;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void shouldCreateComputer(){
        int ram = 8;
        int cores = 4;
        String name = "Acer";
        Computer.OperatingSystem operatingSystem = Computer.OperatingSystem.Windows;

        Computer testComputer = new Computer(ram, cores, name, operatingSystem);

        assertThat(testComputer.getRam()).isEqualTo(8);
        assertThat(testComputer.getCores()).isEqualTo(4);
        assertThat(testComputer.getName()).isEqualTo("Acer");
        assertThat(testComputer.getOperatingSystem()).isEqualTo(Computer.OperatingSystem.Windows);
        assertThat(testComputer.getNumber()).isNotNull();
    }

    @Test
    public void shouldBeFast(){
        int ram = 16;
        int cores = 4;
        String name = "Acer";
        Computer.OperatingSystem operatingSystem = Computer.OperatingSystem.Windows;

        Computer testComputer = new Computer(ram, cores, name, operatingSystem);

        assertThat(testComputer.isFast()).isEqualTo(true);
    }

    @Test
    public void shouldNotBeFast(){
        int ram = 8;
        int cores = 4;
        String name = "Acer";
        Computer.OperatingSystem operatingSystem = Computer.OperatingSystem.Windows;

        Computer testComputer = new Computer(ram, cores, name, operatingSystem);

        assertThat(testComputer.isFast()).isEqualTo(false);
    }

    @Test
    public void shouldUpdateWindowsDefenderEveryFiveMins(){
        int ram = 8;
        int cores = 4;
        String name = "Acer";
        Computer.OperatingSystem operatingSystem = Computer.OperatingSystem.Windows;

        Computer testComputer = new Computer(ram, cores, name, operatingSystem);

        assertThat(testComputer.updatesWindowsDefenderEveryFiveMins()).isEqualTo(true);
    }

    @Test
    public void shouldNotUpdateWindowsDefenderEveryFiveMins(){
        int ram = 8;
        int cores = 4;
        String name = "Acer";
        Computer.OperatingSystem operatingSystem = Computer.OperatingSystem.MacOS;

        Computer testComputer = new Computer(ram, cores, name, operatingSystem);

        assertThat(testComputer.updatesWindowsDefenderEveryFiveMins()).isEqualTo(false);
    }

    @Test
    public void shouldBeForHackermans(){
        int ram = 8;
        int cores = 4;
        String name = "Kali Linux";
        Computer.OperatingSystem operatingSystem = Computer.OperatingSystem.Linux;

        Computer testComputer = new Computer(ram, cores, name, operatingSystem);

        assertThat(testComputer.isForHackermans()).isEqualTo(true);
    }

    @Test
    public void shouldNotBeForHackermans(){
        int ram = 8;
        int cores = 4;
        String name = "Acer";
        Computer.OperatingSystem operatingSystem = Computer.OperatingSystem.MacOS;

        Computer testComputer = new Computer(ram, cores, name, operatingSystem);

        assertThat(testComputer.isForHackermans()).isEqualTo(false);
    }
}
