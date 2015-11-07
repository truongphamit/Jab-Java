import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Dictionary {
    private String path;
    private FileInputStream fstream;
    private FileOutputStream fostream;
    private BufferedReader br;
    private BufferedWriter bw;
    private TreeSet<Word> words;

    public Dictionary(String path) throws IOException {
        this.path = path;
        words = new TreeSet<>();
        fstream = new FileInputStream(path);
        br = new BufferedReader(new InputStreamReader(fstream));
        readWordsFromFile();
    }

    public TreeSet<Word> getWords() {
        return words;
    }

    public boolean add(Word word) throws IOException {
        if (words.add(word)) {
            writeWordsToFile();
            return true;
        }
        return false;
    }

    public boolean edit(Word oldWord, Word newWord) throws IOException {
        if (words.remove(oldWord) && words.add(newWord)) {
            writeWordsToFile();
            return true;
        }
        words.add(oldWord);
        return false;
    }

    private void readWordsFromFile() throws IOException {
        String strLine;
        while ((strLine = br.readLine()) != null) {
            words.add(readWord(strLine));
        }
    }

    private Word readWord(String s) {
        String w;
        String r;
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\t')
                break;
        }
        w = s.substring(0, i);
        r = s.substring(i + 1, s.length());
        return new Word(w, r);
    }

    private void writeWordsToFile() throws IOException {
        fostream = new FileOutputStream(path, false);
        bw = new BufferedWriter(new OutputStreamWriter(fostream));
        for (Word n : words) {
            bw.write(n.toString());
            bw.newLine();
        }
        bw.close();
        fostream.close();
    }
}
