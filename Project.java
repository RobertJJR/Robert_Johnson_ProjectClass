public class Project {
    private String name;
    private String description;
    private double initialCost;

//This is Project 1 method
    public void setProject() {
        name ="I'm a Name :)";
        description = "My purpose in life is to set a first run description.";
        initialCost = 0.0;
    } 
  
//This is Project 2 method 
    public void setProject(String name) {
        this.name = name;
        this.description="default";
        this.initialCost = 0.0;
    } //setter

//This is Project 3 method
    public void setProject(String name, String description, double cost) {
         this.name = name;
         this.description = description;
         this.initialCost = cost;
    } //setter

    public String getProjectName() {
        return name;
    } //getter

    public String getProjectDescription() {
        return description;
    } //getter

    public String getProjectCost() {
        return Double.toString(initialCost);
    } //getter

    public String elevatorPitch() {
        return "Our company costs: $" + "" + initialCost + ", our goal is to " + description;
    } // getter

}