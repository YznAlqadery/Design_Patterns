// Client

public class Main {
    public static void main(String[] args) {

        // Receiver
        MusicPlayer musicPlayer = new MusicPlayer();

        //Concrete classes
        PlayMusicCommand playMusicCommand = new PlayMusicCommand(musicPlayer);
        StopMusicCommand stopMusicCommand = new StopMusicCommand(musicPlayer);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(playMusicCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(stopMusicCommand);
        remoteControl.pressButton();
    }
}