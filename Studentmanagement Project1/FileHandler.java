
import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.*;

public class FileHandler {
    private final Path file = Paths.get("students.txt");

    public FileHandler() {
        try {
            if (Files.notExists(file)) {
                Files.createFile(file);
            }
        } catch (IOException e) {
            throw new RuntimeException("Could not create student file", e);
        }
    }

    public List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();

        try {
            for (String line : Files.readAllLines(file)) {
                if (line.isBlank()) {
                    continue;
                }

                String[] data = line.split("\\|", -1);

                if (data.length != 6) {
                    System.err.println("Skipping invalid record.");
                    continue;
                }

                try {
                    students.add(new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        data[3],
                        LocalDateTime.parse(data[4]),
                        LocalDateTime.parse(data[5])
                    ));
                } catch (RuntimeException e) {
                    System.err.println("Skipping invalid record.");
                }
            }
        } catch (IOException e) {
            System.err.println("Could not read file: " + e.getMessage());
        }

        return students;
    }

    public void saveStudents(List<Student> students) {
        try (BufferedWriter writer =
                     Files.newBufferedWriter(file)) {

            for (Student s : students) {
                writer.write(
                    s.getId() + "|" +
                    s.getName() + "|" +
                    s.getAge() + "|" +
                    s.getCourse() + "|" +
                    s.getCreatedAt() + "|" +
                    s.getUpdatedAt()
                );
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException("Could not save students", e);
        }
    }
}
