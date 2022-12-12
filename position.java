package fr.efrei.domain;

public class Position {
    private String id;
    private int ID_Position;
    private String Statue;

    public Position() {
    }

    public Position(Builder builder) {
        this.id = builder.id;
        this.ID_Position = builder.ID_Position;
        this.Statue = builder.Statue;
    }

    public String getId() {
        return id;
    }

    public String getID_Position() {
        return ID_Position;
    }

    public String getStatue() {
        return Statue;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id='" + id + '\'' +
                ", ID_Position='" + ID_Position + '\'' +
                ", Statue='" + Statue + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private int ID_Position;
        private String Statue;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setID_Position(int ID_Position) {
            this.ID_Position = ID_Position;
            return this;
        }

        public Builder setStatue(String Statue) {
            this.Statue = Statue;
            return this;
        }

        public Builder copy(Position Position){
            this.id = Position.id;
            this.ID_Position = Position.ID_Position;
            this.Statue = Position.Statue;
            return this;
        }


        public Position build() {
            return new Position(this);
        }
    }

}