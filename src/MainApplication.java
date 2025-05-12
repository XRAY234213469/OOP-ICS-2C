public class MainApplication {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(7890, "Melissa", "pw@Admin!75");
        User curUser = new User(3322, "Carlos");

        curAdmin.performOperation(new Delete()); // Admin deletes data
        curUser.performOperation(new View());    // User views data
}
}
