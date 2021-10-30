public class Course {

    private String name;
    private int numberOfAssignments;
    private boolean fun;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfAssignments(int numberOfAssignments) {
        this.numberOfAssignments = numberOfAssignments;
    }

    public int getNumberOfAssignments() {
        return numberOfAssignments;
    }

    public boolean isFun() {
        return this.numberOfAssignments <= 30;
    }


}
