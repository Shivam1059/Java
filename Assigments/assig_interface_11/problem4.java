interface  CertificateProvider{
   void generateCertificate();
}

abstract class Course{
      private String title;
      private int duration;
     
      public Course(String title, int duration){
        this.title = title;
        this.duration = duration;
      }

      public void courseDetails(){
        System.out.println("-------------------course Detatils---------------------");
        System.out.println (" Course Title :  "+title);
        System.out.println (" Course Duration :  "+duration);
      }
      abstract public void startCourse();
      abstract public void endCourse();
}

class VideoCourse extends Course implements CertificateProvider{
      private String start;
      private String end;
      public VideoCourse(String title, int duration, String start, String end){
        super(title,duration);
        this.start = start;
        this.end = end;
      }
      public void startCourse(){
          System.out.println(" Course start date  :  "+start);
      }
      public void endCourse(){
        System.out.println("   end course  : "+end);
      }
      public void generateCertificate(){
       System.out.println( " Your finaly completed your course");
      }
}
class LiveCourse extends Course implets{
      private String start;
      private String end;
      public LiveCourse(String title, int duration, String start, String end){
        super(title,duration);
        this.start = start;
        this.end = end;
      }
      public void startCourse(){
        System.out.println("   Start course  : "+start);
      }
      public void endCourse(){
        System.out.println("   end course  : "+end);
      }
     public void generateCertificate(){
        System.out.println( " Your finaly completed your course");
     }
}


class TestMain{
  public static void main(String[] args){
      VideoCourse obj = new VideoCourse("Java Course",5,"1/01/2025", "30/08/2025");
      obj.courseDetails();
      obj.startCourse(); 
      obj.endCourse();
      obj.generateCertificate();
    

      LiveCourse obj1 = new LiveCourse("C++ Course ",8, "1/05/2025", "30/010/2025");
      obj1.courseDetails();
      obj1.startCourse(); 
      obj1.endCourse();
      obj1.generateCertificate();
      
  }
}