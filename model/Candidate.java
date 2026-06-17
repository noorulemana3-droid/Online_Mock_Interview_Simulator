package model;

public class Candidate extends User {

    public Candidate(String username, String password) {
        super(username, password);
    }

    @Override
    public String toString() {
        return "Candidate: " + getUsername();
    }
}