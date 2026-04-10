class Course{
  private int coursePrice;
  private String courseName;

  Course(){
    this.courseName = "Java Full Stack Development";
    this.coursePrice = 5000;
  }

  // void display(){
  //   System.out.println(courseName);
  //   System.out.println(coursePrice);
  // }

    public int getCoursePrice() {
        return coursePrice;
    }

    // public void setCoursePrice(int coursePrice) {
    //     this.coursePrice = coursePrice;
    // }

    public String getCourseName() {
        return courseName;
    }

    // public void setCourseName(String courseName) {
    //     this.courseName = courseName;
    // }

}



public class Cons {
  public static void main(String[] args) {
    Course c1 = new Course();
    // c1.display();
    System.out.println(c1.getCourseName());
    System.out.println(c1.getCoursePrice());
    // c1.setCourseName("Java Full Stack Development");
    // c1.setCoursePrice(5000);
    // System.out.println(c1.getCourseName());
    // System.out.println(c1.getCoursePrice());

  }
  
}
