// ConcreteCommand, implements command, defines binding between Action and Receiver
public class PlayMusicCommand implements Command{

    private final MusicPlayer musicPlayer;

    public PlayMusicCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute(){
        this.musicPlayer.play();
    }
}
