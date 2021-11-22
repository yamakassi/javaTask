package ru.lecture.main;

public class NameNew {
     private final String lastname;
    private final String firstname;
    private final String patronic;


    public static class Builder {
        // Required parameters
        private final String firstname;
    

        // Optional parameters 
        private String lastname  ;
        private String patronic        ;
        

        public Builder(String firstname) {
            this.firstname = firstname;
           
        }

        public Builder lastname(String str)
        { lastname = str;      return this; }
        public Builder fat(String str)
        { patronic = str;           return this; }
       

        public NameNew build() {
            return new NameNew(this);
        }
    }

    private NameNew(Builder builder) {
        firstname  = builder.firstname;
        lastname   = builder.lastname;
        patronic   = builder.patronic;

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