package timer;
import java.util.Scanner;

public class OnState extends State{
    Scanner scanner = new Scanner(System.in);

    public OnState(TaskTimer timer) {
        super(timer);
    }

    @Override
    public String start() {
        return "De timer staat al aan. ";
    }

    @Override
    public String stop() {
        return "De timer is gepauzeerd. ";
    }

    @Override
    public boolean askStart(){
        System.out.println("De timer telt al. ");
        return false;
    }

    @Override
    public boolean askPause(){
        System.out.println("""
                De timer stoppen?\s
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
            return askPause();
        }
    }
    @Override
    public boolean isRunning(){
        return true;
    }
}
