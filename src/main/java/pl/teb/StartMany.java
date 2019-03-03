package pl.teb;

public class StartMany {
    public void startManyWorkers(int howMany) {
        for (int i = 0; i < howMany; i++) {
            Thread object = new Thread(new ShowYourSelf());
            object.start();
        }
    }
}
