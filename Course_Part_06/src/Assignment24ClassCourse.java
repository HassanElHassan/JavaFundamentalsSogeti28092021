public class Assignment24ClassCourse {
    public static void main(String[] args) {

        Course tmap = new Course();

        tmap.setName("Tmap");
        tmap.setNumberOfAssignments(35);

        System.out.printf("the course %s has %d assignments%n",
                tmap.getName(),
                tmap.getNumberOfAssignments());

        System.out.printf("the course %s has %d assignments and is %s%n",
                tmap.getName(),
                tmap.getNumberOfAssignments(),
                tmap.isFun() ? "fun" : "not fun"
        );

        Course leanGreenBelt = new Course();
        leanGreenBelt.setName("Lean Green Belt");
        leanGreenBelt.setNumberOfAssignments(13);

        System.out.printf("the course %s has %d assignments and is %s%n",
                leanGreenBelt.getName(),
                leanGreenBelt.getNumberOfAssignments(),
                leanGreenBelt.isFun() ? "fun" : "not fun"
        );

    }
}
