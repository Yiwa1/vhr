package ga.yiwa.vhrmodel;

public class Role {
    private int id;
    private String name;
    private String nameZh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name==null ? null : name.trim();
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh= nameZh==null? null : nameZh.trim();
    }
}
