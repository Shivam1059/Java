class Test{
  public static void main(String[] args){
    int a[] = {1,5,10,20,40,80};
    int b[] = {6,7,20,80,100};
    int c[] = {3,4,15,20,30,70,80,120};

    for(int i=0; i<a.length; i++){
      for(int j=0; j<b.length;j++){
        for(int k=0; k<c.length; k++){
            if((a[i] == b[j] )&& (b[j] == c[k])){
                 System.out.print(c[k]+" ");
            }
            // System.out.print(c[k]+" ");
        }
      }
    }
  }  
}