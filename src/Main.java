import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GameProgress progress1 = new GameProgress(100, 2, 3, 50.5);
        GameProgress progress2 = new GameProgress(80, 5, 4, 70.0);
        GameProgress progress3 = new GameProgress(55, 7, 5, 100.0);

        String saveDir = "Users/nikolaspetrov/Library/Games/GunRunner/";
        GameSaver.saveGame(saveDir + "save1.dat", progress1);
        GameSaver.saveGame(saveDir + "save2.dat", progress2);
        GameSaver.saveGame(saveDir + "save3.dat", progress3);

        List<String> filesToZip = Arrays.asList(
                saveDir + "save1.dat",
                saveDir + "save2.dat",
                saveDir + "save3.dat"
        );
        Zipper.zipFiles(saveDir + "saves.zip", filesToZip);

        FileDeleter.deleteFiles(filesToZip);

        System.out.println("Сохранения упакованы и удалены.");
    }
}