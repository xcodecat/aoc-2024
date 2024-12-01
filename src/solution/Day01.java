package solution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day01 extends BaseFile {
    public Day01(String inputFilePath) throws IOException {
        super(inputFilePath);
    }
    

    @Override
    public void part1() {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (String line : input) {
            if (line.trim().isEmpty()) continue;
            String[] split = line.split("\\s+");
            l1.add(Integer.parseInt(split[0]));
            l2.add(Integer.parseInt(split[1]));
        }

        Collections.sort(l1);
        Collections.sort(l2);

        int totalDistance = 0;
        for (int i = 0; i < l1.size(); i++) {
            totalDistance += Math.abs(l1.get(i) - l2.get(i));
        }
        System.out.println("Part 1: " + totalDistance);
    }

    @Override
    public void part2() {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (String line : input) {
            if (line.trim().isEmpty()) continue;
            String[] split = line.split("\\s+");
            l1.add(Integer.parseInt(split[0]));
            l2.add(Integer.parseInt(split[1]));
        }

        int similarityScore = 0;

        for (int leftNum : l1) {
            int count = 0;
            for (int rightNum : l2) {
                if (leftNum == rightNum) {
                    count++;
                }
            }
            similarityScore += leftNum * count;
        }
        System.out.println("Part 2: " + similarityScore);
    }

    public static void main(String[] args) throws IOException {
        String inputFilePath = "src/input/day01";
        Day01 solution = new Day01(inputFilePath);
        solution.part1();
        solution.part2();
    }
}