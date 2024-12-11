package org.example;

public class Patron {
    private String patronName;
    private String patronID;
    private Gender gender;


    public Patron(String patronName, String patronID, Gender gender) {
        this.patronName = patronName;
        this.patronID = patronID;
        this.gender = gender;
    }

    public String getPatronName() {
        return patronName;
    }

    public void setPatronName(String patronName) {
        this.patronName = patronName;
    }

    public String getPatronID() {
        return patronID;
    }

    public void setPatronID(String patronID) {
        this.patronID = patronID;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "patronName='" + patronName + '\'' +
                ", patronID='" + patronID + '\'' +
                ", gender=" + gender +
                '}';
    }

    public enum Gender{
        MALE,FEMALE;
    }
}
