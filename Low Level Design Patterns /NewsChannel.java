/* Observer Pattern (Behavioral) - The Vibe: "The 'Notify Me' button on YouTube."
One object (the Subject) maintains a list of dependents (Observers) and
pings them automatically whenever its state changes. */ 

public class NewsChannel {
    private List<Subscriber> users = new ArrayList<>();

    public void uploadVideo() {
        for (Subscriber user : users) {
            user.update(); // Notifies everyone at once
        }
    }
}
