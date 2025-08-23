class Test{
    public static void main(String[] args){
    int a[] = {1,0,0,1,0,1,1};
    int count = 0;

    for(int i=0; i<a.length; i++){
      for(int j=i+1; j<a.length; j++){
        if(a[i]==a[j]){
          count++;
        }
      }
    }
     System.out.print("Total sub equal : "+count);
    }   
}