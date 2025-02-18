package org.example.model;

public class Student {
    private String groupNumber;
    private String averageGrade;
    private String recordBookNumber;

    public String getGroupNumber() {
        return groupNumber;
    }

    public String getAverageGrade() {
        return averageGrade;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    private Student(StudentBuilder studentBuilder) {
        groupNumber = studentBuilder.groupNumber;
        averageGrade = studentBuilder.averageGrade;
        recordBookNumber = studentBuilder.recordBookNumber;
    }

    public static class StudentBuilder{
        private String groupNumber;
        private String averageGrade;
        private String recordBookNumber;

        public StudentBuilder(String groupNumber, String averageGrade) {
            this.groupNumber = groupNumber;
            this.averageGrade = averageGrade;
        }

        public StudentBuilder setRecordBookNumber(String recordBookNumber) {
            this.recordBookNumber = recordBookNumber;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupNumber='" + groupNumber + '\'' +
                ", averageGrade='" + averageGrade + '\'' +
                ", recordBookNumber='" + recordBookNumber + '\'' +
                '}';
    }
}

