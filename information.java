package fr.efrei.domain;

public class Information {
    private String id;
    private String Email_adress;
    private String Postal_adress;
    private int Phone_number;

    public Information() {
    }

    public Information(Builder builder) {
        this.id = builder.id;
        this.Email_adress = builder.Email_adress;
        this.Postal_adress = builder.Postal_adress;
        this.Phone_number = builder.Phone_number;
    }

    public String getId() {
        return id;
    }

    public String getEmail_adress() {
        return Email_adress;
    }

    public String getPostal_adress() {
        return Postal_adress;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id='" + id + '\'' +
                ", Email_adress='" + Email_adress + '\'' +
                ", Postal_adress='" + Postal_adress + '\'' +
                ", Phone_number='" + Phone_number + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String Email_adress;
        private String Postal_adress;
        private int Phone_number;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setEmail_adress(String Email_adress) {
            this.Email_adress = Email_adress;
            return this;
        }

        public Builder setPostal_adress(String Postal_adress) {
            this.Postal_adress = Postal_adress;
            return this;
        }

        public Builder setPhone_number(String Phone_number) {
            this.Phone_number = Phone_number;
            return this;
        }

        public Builder copy(Information Information){
            this.id = Information.id;
            this.Email_adress = Information.Email_adress;
            this.Postal_adress = Information.Postal_adress;
            this.Phone_number = Information.Phone_number;
            return this;
        }


        public Information build() {
            return new Information(this);
        }
    }

}
