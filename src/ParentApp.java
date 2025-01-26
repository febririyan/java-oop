class ParentApp {
   public static void main(String[] args) {

    Child child = new Child();
    child.name = "Febry";

    child.doIt();
    System.out.println(child.name);

    // buat konversi ke parent
    Parent parent = (Parent) child;
    parent.doIt();

    // ketika akses dia name nya ngambil di parent field namenya
    System.out.println(parent.name);
   } 
}
