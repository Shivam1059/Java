
class Test{
  public static void main(String args[]){
     String name = "Harry";
     String nam  = "shivay ahirwar  ";
     int v = name.length();
     System.out.println(v);
     System.out.println(name.toUpperCase());
     System.out.println(name.toLowerCase());
     System.out.println(nam.trim());

     System.out.println(nam.substring(3,8));
     System.out.println(name.replace('r','s'));
     System.out.println(name.startsWith("Ha"));
     System.out.println(name.endsWith("r"));


     System.out.println(name.charAt(2));
     System.out.println(nam.indexOf('y',6));
     System.out.println(nam.lastIndexOf('r'));

     System.out.println(name.equals("Harry"));
     System.out.println(name.equalsIgnoreCase("harry"));


     

     


  
  }
}