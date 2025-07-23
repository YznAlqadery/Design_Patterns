public class HomeTheaterFacade {
    private Projector projector;
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(){
        this.projector = new Projector();
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DVDPlayer();
    }

    public void watchMovie(){
        projector.on();
        amplifier.on();
        dvdPlayer.play();
    }

}
