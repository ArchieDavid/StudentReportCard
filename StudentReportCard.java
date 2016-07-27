package com.archiedavid.www.testreportcard;

/**
 * Created by Archie David on 27/07/2016.
 */
public class StudentReportCard {
    private int studentId;
    private String studentName;
    private int mathGrade;
    private int scienceGrade;
    private int englishGrade;

    public static class Builder {
        //required
        private final int studentId;

        //optional
        private int mathGrade = 0;
        private int scienceGrade = 0;
        private int englishGrade = 0;
        private String studentName = null;

        public Builder(int studentId) {
            this.studentId = studentId;
        }

        public Builder studentName(String name) {
            studentName = name;
            return this;
        }
        
        public Builder mathGrade(int value) {
            mathGrade = value;
            return this;
        }

        public Builder scienceGrade(int value) {
            scienceGrade = value;
            return this;
        }

        public Builder englishGrade(int value) {
            englishGrade = value;
            return this;
        }

        public StudentReportCard build() {
            return new StudentReportCard(this);
        }
    }

    private StudentReportCard(Builder builder) {
        studentId = builder.studentId;
        mathGrade = builder.mathGrade;
        scienceGrade = builder.scienceGrade;
        englishGrade = builder.englishGrade;
        studentName = builder.studentName;
    }

    /**
     * Returns the string representation of the {@link StudentReportCard} object.
     */
    @Override
    public String toString() {
        return "StudentReportCard{" +
                "studentId='" + studentId + '\'' +
                ", mathGrade='" + mathGrade + '\'' +
                ", scienceGrade= '" + scienceGrade + '\''+
                ", englishGrade= '" + englishGrade + '\'' +
                ", studentName= '" + studentName + '\'' +
                '}';
    }
}