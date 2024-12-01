package solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class BaseFile {

    protected List<String> input;

    public BaseFile(String inputFilePath) throws IOException {
        this.input = Files.readAllLines(Paths.get(inputFilePath));
    }

    public abstract void part1();

    public abstract void part2();
}
