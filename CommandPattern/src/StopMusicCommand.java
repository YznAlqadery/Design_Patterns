// ConcreteCommand, implements command, defines binding between Action and Receiver
public class StopMusicCommand implements Command{

    private final MusicPlayer musicPlayer;

    public StopMusicCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override
    public void execute(){
        this.musicPlayer.stop();
    }
}
