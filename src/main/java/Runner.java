

public class Runner {

    public static void main(String[] args) {

        FriendlyDude[] dudes = new FriendlyDude[2];
        dudes[0] = new DudeAlice(15);
        dudes[1] = new DudeBob();

        for (FriendlyDude dude : dudes) {
            dude.sayHello();
        }

    }

}
