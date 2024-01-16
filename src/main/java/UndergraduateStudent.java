public class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
