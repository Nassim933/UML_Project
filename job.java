package fr.efrei.domain;

public class Job {
    private String id;
    private String Title;
    private int ID_Position;

    public Job() {
    }

    public Job(Builder builder) {
        this.id = builder.id;
        this.Title = builder.Title;
        this.ID_Position = builder.ID_Position;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public int getID_Position() {
        return ID_Position;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", Title='" + Title + '\'' +
                ", ID_Position='" + ID_Position + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String Title;
        private int ID_Position;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String Title) {
            this.Title = Title;
            return this;
        }

        public Builder setID_Position(int ID_Position) {
            this.ID_Position = ID_Position;
            return this;
        }

        public Builder copy(Job Job){
            this.id = Job.id;
            this.Title = Job.Title;
            this.ID_Position = Job.ID_Position;
            return this;
        }

        public Job build() {
            return new Job(this);
        }
    }

}