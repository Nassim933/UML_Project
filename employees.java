package fr.efrei.domain;

public class Employees {
    private String id;
    private String FirstName;
    private String LastName;
    private int ID_Employees;

    public Employees() {
    }

    public Employees(Builder builder) {
        this.id = builder.id;
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.ID_Employees = builder.ID_Employees;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getID_Employees() {
        return ID_Employees;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id='" + id + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ID_Employees='" + ID_Employees + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String FirstName;
        private String LastName;
        private int ID_Employees;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String FirstName) {
            this.FirstName = FirstName;
            return this;
        }

        public Builder setLastName(String LastName) {
            this.LastName = LastName;
            return this;
        }

        public Builder setID_Employees(String ID_Employees) {
            this.ID_Employees = ID_Employees;
            return this;
        }

        public Builder copy(Employees Employees){
            this.id = Employees.id;
            this.FirstName = Employees.FirstName;
            this.LastName = Employees.LastName;
            this.ID_Employees = Employees.ID_Employees;
            return this;
        }


        public Employees build() {
            return new Employees(this);
        }
    }

}
