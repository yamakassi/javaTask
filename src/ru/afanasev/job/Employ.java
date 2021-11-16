package ru.afanasev.job;

public class Employ {
 final String name;
 Department department;
    public Employ(String name, Department department){
        this.name=name;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        Department department = this.department;
        return department;
    }

    public void setDepartment(Department department) {
        if(department==null) throw new IllegalArgumentException("Вы не передали отдел");
        if(this.department==department) throw new IllegalArgumentException("Error нельзя перевести сотрудника в тот отдел в которм он состоит");
       if(this.department.chief==this) this.department.chief=null;
        this.department=department;
    }

    public String toString(){
        if(name==department.getChief().name) return name+" начальник отдела "+department.getName();
        return name+" работает в отделе "+department.getName()+", начальник которого "+department.getChief().name;
    }
}
