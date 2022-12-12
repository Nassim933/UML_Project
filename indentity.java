package fr.efrei.domain;

public class Identity {
    private String id;
    private String IdentityName;
    private String IdentityValue;

    public Identity() {
    }

    public Identity(Builder builder) {
        this.id = builder.id;
        this.IdentityName = builder.IdentityName;
        this.IdentityValue = builder.IdentityValue;
    }

    public String getId() {
        return id;
    }

    public String getIdentityName() {
        return IdentityName;
    }

    public String getIdentityValue() {
        return IdentityValue;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "id='" + id + '\'' +
                ", IdentityName='" + IdentityName + '\'' +
                ", IdentityValue='" + IdentityValue + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String IdentityName;
        private String IdentityValue;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIdentityName(String IdentityName) {
            this.IdentityName = IdentityName;
            return this;
        }

        public Builder setIdentityValue(String IdentityValue) {
            this.IdentityValue = IdentityValue;
            return this;
        }

        public Builder copy(Identity Identity){
            this.id = Identity.id;
            this.IdentityName = Identity.IdentityName;
            this.IdentityValue = Identity.IdentityValue;
            return this;
        }


        public Identity build() {
            return new Identity(this);
        }
    }

}
