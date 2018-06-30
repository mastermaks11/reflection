package by.itacademi.ziptext;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


/**
 * Created by user on 29.06.2018.
 */
public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static {
        try (InputStream in = Main.class.getResourceAsStream("log.properties");) {
            LogManager.getLogManager().readConfiguration(in);
        } catch (IOException e) {
            LOGGER.log(Level.INFO, e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            TextHandler textHandler = new TextHandler();
            String text = "Heeelllo wwwwwwworld";
            System.out.println("The original text: " + text);
            String zipText = textHandler.compressText(text);
            System.out.println("The text zip :" + zipText);
            System.out.println("The text unzip:" + textHandler.unzipText(zipText));
        } catch (Exception e)

        {
            LOGGER.log(Level.INFO, e.getMessage());
        }
    }
}
