//case 1 
class Task{
    synchronized public void m1(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("I am called");
    }
}
class A extends Thread{
    Task obj = null;
    public A(Task obj){
        this.obj = obj;
    }
    public void run(){
        obj.m1();
    }

}
class Test{
    public static void main(String[] args){
        Task task1 = new Task();
        Thread t1 = new A(task1);
        Thread t2 = new A(task1);
        t1.start();
        t2.start();
    }
}