package tech.aelson.algorithms.model;

public record Grade(String studentName, double result) {
    @Override
    public String toString() {
        return studentName + ": " + result;
    }
}
