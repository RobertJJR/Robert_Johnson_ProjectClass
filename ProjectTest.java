public class ProjectTest {
    public static void main(String[] args){
        Project project = new Project();
        project.setProject();
        Project project2 = new Project();
        project2.setProject("Traditional College");
        Project project3 = new Project();
        project3.setProject("Merit America", "Help people get jobs!", 2300.25);
        System.out.println("==============Project Attempt 1==============");
        System.out.println(project.getProjectName());
        System.out.println(project.getProjectDescription());
        System.out.println(project.elevatorPitch());

        System.out.println("==============Project Attempt 2==============");
        System.out.println(project2.getProjectName());
        System.out.println(project2.getProjectDescription());
        System.out.println(project2.elevatorPitch());

        System.out.println("==============Project Attempt 3==============");
        System.out.println(project3.getProjectName());
        System.out.println(project3.getProjectDescription());
        System.out.println(project3.elevatorPitch());
    }
}