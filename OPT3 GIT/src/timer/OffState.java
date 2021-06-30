package timer;
import java.util.Scanner;

public class OffState extends State{
    Scanner scanner = new Scanner(System.in);

    public OffState(TaskTimer timer) {
        super(timer);
    }

    @Override
    public String start() {
        return "De timer is gestart. ";
    }

    @Override
    public String stop() {
        return "De timer is al gepauzeerd. ";
    }

    @Override
    public boolean askStart(){
        System.out.println("""
                Start de timer van deze taak?\s
                1. Ja\s
                2. Nee""");
        int choice = scanner.nextInt();
        if(choice == 1){
            return true;
        }
        else if(choice == 2){
            return false;
        }
        else{
            System.out.println("Verkeerde invoer, probeer opnieuw: ");
            return askStart();
        }
    }

    @Override
    public boolean askPause(){
        System.out.println("De timer telt niet. ");
        return false;
    }

    @Override
    public boolean isRunning(){
        return false;
    }
}
