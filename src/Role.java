public class Role {
    public String name;
    public String id;
    public String gender;

    public Role(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public Role(String id) {

        this.id = id;
    }
    public String getName() {
        return name;
    }
        public String getId() {
        return id;
    }
    public String getGender() {
        return gender;
    }


    

}
