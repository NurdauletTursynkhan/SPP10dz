class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audioSystem;
    private DVDPlayer dvdPlayer;
    private GameConsole gameConsole;

    public HomeTheaterFacade() {
        this.tv = new TV();
        this.audioSystem = new AudioSystem();
        this.dvdPlayer = new DVDPlayer();
        this.gameConsole = new GameConsole();
    }

    public void watchMovie() {
        tv.on();
        audioSystem.on();
        dvdPlayer.play();
        System.out.println("Приятного просмотра фильма!");
    }

    public void endMovie() {
        dvdPlayer.stop();
        audioSystem.off();
        tv.off();
        System.out.println("Просмотр фильма завершен.");
    }

    public void playGame() {
        tv.on();
        gameConsole.on();
        gameConsole.playGame();
        System.out.println("Приятной игры!");
    }

    public void listenToMusic() {
        tv.on();
        audioSystem.on();
        audioSystem.setVolume(5);
        System.out.println("Приятного прослушивания музыки!");
    }

    public void setVolume(int level) {
        audioSystem.setVolume(level);
        System.out.println("Громкость установлена на " + level);
    }

    class TV {
        public void on() { System.out.println("Телевизор включен"); }
        public void off() { System.out.println("Телевизор выключен"); }
        public void setChannel(int channel) { System.out.println("Канал установлен на " + channel); }
    }

    class AudioSystem {
        public void on() { System.out.println("Аудиосистема включена"); }
        public void off() { System.out.println("Аудиосистема выключена"); }
        public void setVolume(int level) { System.out.println("Громкость аудиосистемы установлена на " + level); }
    }

    class DVDPlayer {
        public void play() { System.out.println("DVD воспроизводится"); }
        public void pause() { System.out.println("DVD на паузе"); }
        public void stop() { System.out.println("DVD остановлен"); }
    }

    class GameConsole {
        public void on() { System.out.println("Игровая консоль включена"); }
        public void playGame() { System.out.println("Игра запущена"); }
    }
}

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie();
        homeTheater.setVolume(10);
        homeTheater.endMovie();

        homeTheater.playGame();
        homeTheater.listenToMusic();
    }
}
