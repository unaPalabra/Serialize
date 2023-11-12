package org.example.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentData  implements Serializable{
    @JsonProperty("firsName")
        private String firstName;
    @JsonProperty("lastName")
        private String lastName;
    @JsonProperty("grade")
        private int grade;

    @Override
    public String toString() {
        return "StudentData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

}
