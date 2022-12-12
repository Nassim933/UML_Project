package fr.efrei.domain;

public class Salary {
    private String id;
    private int Salary;

    public Salary() {
    }

    public Salary(Builder builder) {
        this.id = builder.id;
        this.Salary = builder.Salary;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id='" + id + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private int Salary;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSalary(int Salary) {
            this.Salary = Salary;
            return this;
        }

        public Builder copy(Salary Salary){
            this.id = Salary.id;
            this.Salary = Salary.Salary;
            return this;
        }


        public Salary build() {
            return new Salary(this);
        }
    }

}