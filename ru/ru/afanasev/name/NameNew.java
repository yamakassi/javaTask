package ru.afanasev.name;

public class NameNew {
    private final String lastname;
    private final String firstname;
    private final String patronic;


    public static class Builder {
        // обяз параметр
        private final String firstname;


        // не обяз
        private String lastname;
        private String patronic;


        public Builder(String firstname) {
            this.firstname = firstname;

        }

        public Builder lastname(String str) {
            lastname = str;
            return this;
        }

        public Builder patronic(String str) {
            patronic = str;
            return this;
        }


        public NameNew build() {
            return new NameNew(this);
        }
    }

    private NameNew(Builder builder) {
        firstname = builder.firstname;
        lastname = builder.lastname;
        patronic = builder.patronic;

    }

    public String getPatronic() {
        return patronic;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstname=" + firstname +
                ", lastname=" + lastname +
                ", patronic=" + patronic +

                '}';
    }
}