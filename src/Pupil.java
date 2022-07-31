import java.util.List;

public class Pupil {

    public static List<Pupil> list;
    private int id;
    private String namep;
    private String surnamep;
    private int entryGradep;
    private String addressp;
    private String university_idp;

    public int getId() {
        return id;
    }

    public String getNamep() {
        return namep;
    }

    public String getSurnamep() {
        return surnamep;
    }

    public int getEntryGradep() {
        return entryGradep;
    }

    public String getAddressp() {
        return addressp;
    }

    public String getUniversity_idp() {
        return university_idp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }

    public void setSurnamep(String surnamep) {
        this.surnamep = surnamep;
    }

    public void setEntryGradep(int entryGradep) {
        this.entryGradep = entryGradep;
    }

    public void setAddressp(String addressp) {
        this.addressp = addressp;
    }

    public void setUniversity_idp(String university_idp) {
        this.university_idp = university_idp;
    }

    public String toString(int id) {
        return "id." + id +
                ", namep='" + namep + '\'' +
                ", surnamep='" + surnamep + '\'' +
                ", entryGradep=" + entryGradep +
                ", addressp='" + addressp + '\'' +
                ", university_idp='" + university_idp + '\'';
    }

}
