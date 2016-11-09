package aclik.model;

public class Student {
    private Integer id;

    private String studid;

    private String studname;

    private String studpwd;

    private String studsex;

    private String studplace;

    private String studphone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudid() {
        return studid;
    }

    public void setStudid(String studid) {
        this.studid = studid == null ? null : studid.trim();
    }

    public String getStudname() {
        return studname;
    }

    public void setStudname(String studname) {
        this.studname = studname == null ? null : studname.trim();
    }

    public String getStudpwd() {
        return studpwd;
    }

    public void setStudpwd(String studpwd) {
        this.studpwd = studpwd == null ? null : studpwd.trim();
    }

    public String getStudsex() {
        return studsex;
    }

    public void setStudsex(String studsex) {
        this.studsex = studsex == null ? null : studsex.trim();
    }

    public String getStudplace() {
        return studplace;
    }

    public void setStudplace(String studplace) {
        this.studplace = studplace == null ? null : studplace.trim();
    }

    public String getStudphone() {
        return studphone;
    }

    public void setStudphone(String studphone) {
        this.studphone = studphone == null ? null : studphone.trim();
    }
}