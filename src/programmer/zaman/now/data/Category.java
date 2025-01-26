package programmer.zaman.now.data;

public class Category {
    private String id;
    private boolean expensive;

    // bikin method untuk getter dan setternya
    // kegunaannya supaya orang tidak bisa akses field nya secara langsung
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return this.expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
