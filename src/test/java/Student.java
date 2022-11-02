public class Student {
    //---------------------ATTRIBUTES--------------------------
    private String firstName;
    private String lastname;
    private String email;
    private String phone;

    // пустой конструктор по умолчанию создаётся Джавой для класса
    public Student() {

    }
    // пустой конструктор, не надо создавать сеттеры;  cod - generate - construktor


    public Student(String firstName, String lastname, String email, String phone) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }
    //-------------------------------------GETTERS / SETTERS------------------------------------------

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //--------------------CUSTOM METHODS------------------------
    public String getFullName() {
        return firstName + " " + lastname;
    }
}
