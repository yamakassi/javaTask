package ru.afanasev.job;

public class Department {
    final String name;
    Employ chief;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employ getChief() {
        Employ chief = this.chief;
        return chief;
    }

    public void setChief(Employ chief) {
        if (chief != null)  chief.department = this;
        this.chief = chief;

    }

    public String toString() {
        if (chief != null) return "Отдел " + name + "В котором начальник" + chief.getName();
        return "Отдел" + name + "Начальника нет";
    }

}
