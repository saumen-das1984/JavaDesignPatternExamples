package halfsynchalfasync.design.pattern.example;

import java.io.File;

public class DataUtil {

    private DataUtil() {}

    public static File getFile(String filename) {
        return new File(System.getProperty("user.dir") + "/data/" + filename);
    }
}
