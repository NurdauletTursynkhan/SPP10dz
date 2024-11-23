// Фасадный класс для управления мультимедиа-центром
class HomeTheaterFacade {
    // Подсистемы мультимедиа-центра
    private TV tv;
    private AudioSystem audioSystem;
    private DVDPlayer dvdPlayer;
    private GameConsole gameConsole;

    // Конструктор фасада
    public HomeTheaterFacade() {
        this.tv = new TV();
        this.audioSystem = new AudioSystem();
        this.dvdPlayer = new DVDPlayer();
        this.gameConsole = new GameConsole();
    }

    // Метод для начала просмотра фильма
    public void watchMovie() {
        tv.on();
        audioSystem.on();
        dvdPlayer.play();
        System.out.println("Приятного просмотра фильма!");
    }

    // Метод для завершения просмотра фильма
    public void endMovie() {
        dvdPlayer.stop();
        audioSystem.off();
        tv.off();
        System.out.println("Просмотр фильма завершен.");
    }

    // Метод для запуска игры
    public void playGame() {
        tv.on();
        gameConsole.on();
        gameConsole.playGame();
        System.out.println("Приятной игры!");
    }

    // Метод для прослушивания музыки
    public void listenToMusic() {
        tv.on();
        audioSystem.on();
        audioSystem.setVolume(5);
        System.out.println("Приятного прослушивания музыки!");
    }

    // Метод для регулировки громкости
    public void setVolume(int level) {
        audioSystem.setVolume(level);
        System.out.println("Громкость установлена на " + level);
    }

    // Подсистема TV
    class TV {
        public void on() { System.out.println("Телевизор включен"); }
        public void off() { System.out.println("Телевизор выключен"); }
        public void setChannel(int channel) { System.out.println("Канал установлен на " + channel); }
    }

    // Подсистема AudioSystem
    class AudioSystem {
        public void on() { System.out.println("Аудиосистема включена"); }
        public void off() { System.out.println("Аудиосистема выключена"); }
        public void setVolume(int level) { System.out.println("Громкость аудиосистемы установлена на " + level); }
    }

    // Подсистема DVDPlayer
    class DVDPlayer {
        public void play() { System.out.println("DVD воспроизводится"); }
        public void pause() { System.out.println("DVD на паузе"); }
        public void stop() { System.out.println("DVD остановлен"); }
    }

    // Подсистема GameConsole
    class GameConsole {
        public void on() { System.out.println("Игровая консоль включена"); }
        public void playGame() { System.out.println("Игра запущена"); }
    }
}

// Клиентский код для демонстрации работы фасада
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
