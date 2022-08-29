public class Empleado {
    private long id;
    private String email;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empleado(long id, String email) {
        this.id = id;
        this.email = email;
    }
}
