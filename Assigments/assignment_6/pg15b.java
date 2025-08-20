class Test{
  public static void main(String[] args){
     int a[] =  {1,1,1,1,0};
     int count = 0;
     for(int i=3; i<a.length; i++){
        for(int j=i+1; j<a.length; j++){
            count++;
        }
     }
     System.out.print(count);
 
  }
}

