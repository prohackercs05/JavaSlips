import java.io.*;

class SearchThread extends Thread {
    private File file;
    private String searchStr;

    public SearchThread(File file, String searchStr) {
        this.file = file;
        this.searchStr = searchStr;
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                if (line.contains(searchStr)) {
                    System.out.println("Found in " + file.getName() + " at line: " + lineNumber);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading " + file.getName() + ": " + e.getMessage());
        }
    }
}

public class Slip14_1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter string to search: ");
            String searchStr = reader.readLine();

            File currentDir = new File(".");
            File[] files = currentDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

            if (files == null || files.length == 0) {
                System.out.println("No .txt files found in the current directory.");
                return;
            }

            System.out.println("Searching for '" + searchStr + "' in " + files.length + " files...");
            for (File file : files) {
                SearchThread st = new SearchThread(file, searchStr);
                st.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
 * Explanation:
 * This program implements a multi-threaded file search engine.
 * 1. SearchThread Class: Extends Thread and handles searching within a single
 * file.
 * It reads the file line by line using BufferedReader and checks for the target
 * string.
 * 2. Multi-threading: In the main method, the program identifies all .txt files
 * in
 * the current folder. For each file, it spawns a unique thread instance.
 * 3. Efficiency: Each thread executes independently, allowing the operating
 * system
 * to parallelize file reads and string matching.
 * 4. Output: When a match is found, the thread prints the file name and the
 * line index.
 */
