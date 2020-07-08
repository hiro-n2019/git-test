public class ThreadSample1A {
2.
3.  public static void main(String[] args) {
4.    Thread th1 = new ThreadA("Thread1");
5.    Thread th2 = new ThreadA("Thread2");
6.    
7.    th1.start();
8.    th2.start();
9.  }
10.
11.}
12.
13.class ThreadA extends Thread {
14.  String name;
15.  int count = 0;
16.  ThreadA(String name) {
17.    this.name = name;
18.  }
19.  public void run(){
20.    for ( int i = 0; i < 5; i++ ) {
21.      count++;
22.      System.out.println(name+"-"+count);
23.      try {
24.        Thread.sleep(500);
25.      } catch ( InterruptedException e ) {
26.        e.printStackTrace();
27.      }
28.    }
29.  }
30.}
