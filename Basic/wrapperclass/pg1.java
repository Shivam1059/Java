//Problem 1 -> ("1 2 3  4 5 6 7 8 9");

class TestMain{
  public static void main(String args[]){
    String num1 = "1 2 3 4 5 6 7 8 9 10";
    String [] numberStrings = num1.split(" ");

    int[] numbers = new int[numberStrings.length];

       for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        
        int sum = 0;
        System.out.print("Converted integers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }
    System.out.println();
   System.out.println("Sum : "+sum);
  }
}