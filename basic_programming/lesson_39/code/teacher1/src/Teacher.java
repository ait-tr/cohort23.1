public class Teacher {

  private   String job = "Teacher";
  private   String school = "AIT";


  protected void setJob(String job){
      this.job = job;
  }

  protected String getJob(){
      return job;
  }

  protected void setSchool(String school){
      this.school = school;
  }

  protected String getSchool(){
      return school;
  }

    void work(){
        System.out.println("Teaching");
    }
}
