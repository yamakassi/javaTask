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

    private NutritionFacts(Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstname=" + servingSize +
                ", lastname=" + servings +
                ", patronic=" + calories +
                
                '}';
    }
}