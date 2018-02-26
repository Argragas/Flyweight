package exemple.tools;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Permet la lecture d'un fichier.
 * @author Argragas
 *
 */
public class Fichier {


    public static List<String> readFile(File file) {

        List<String> result = new ArrayList<String>();

        FileReader fr;
        try {
            fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);

        for (String line = br.readLine(); line != null; line = br.readLine()) {
            result.add(line);
        }

        br.close();
        fr.close();
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        return result;
    }


    public static String getResourcePath(String fileName) {
        final File f = new File("");
        final String dossierPath = f.getAbsolutePath() + File.separator + fileName;
        return dossierPath;
    }

    public static File getResource(String fileName) {
        final String completeFileName = getResourcePath(fileName);
        File file = new File(completeFileName);
        return file;

    }


}
