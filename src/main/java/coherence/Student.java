package coherence;

import java.util.List;
// TODO: Analyze if cohesion of this class is high or low, explain why
public class Student {
    private String name;
    private int id;
    private List<Double> grades;

    public double calculateGPA() {
        return grades.stream().mapToDouble(d -> d).average().orElse(0.0);
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }
}
