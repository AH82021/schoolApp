public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Research Topic: " + researchTopic;
    }
}
