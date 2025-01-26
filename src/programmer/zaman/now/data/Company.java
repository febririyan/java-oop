package programmer.zaman.now.data;

// inner class
public class Company {
    private String name;

    // tambahkan getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ini innerclass bisa langsung di akses
    public class Employee {
        private String name;

        public String getCompany() {
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
