public class DudeAlice implements FriendlyDude {

    private int id;

    public DudeAlice(int id) {
        this.id = id;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I am " + getClass().getName() + ": id=" + id);
    }
}
