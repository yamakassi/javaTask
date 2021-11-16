package ru.afanasev.name;

/**
 * будем считать если перадают только
 * одно значение это -имя
 * два -  фамилию имя
 * три - ФИО
 */
public class Name {
    private String lastname;
    private String firstname;
    private String patronic;

    Name(String firstname) {
        this(firstname, null);
    }

    Name(String firstname, String lastname) {
        this(firstname, lastname, null);
    }

    Name(String firstname, String lastname, String patronic) {
        if (firstname == null && firstname == "") throw new IllegalArgumentException("is not a legal name;");

        if (lastname == null) lastname = "";
        if (patronic == null) patronic = "";
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronic = patronic;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronic() {
        return patronic;
    }


    public String toString() {
        return firstname + " " + lastname + " " + patronic;
    }
}
