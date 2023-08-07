package task;
class SumCalculator extends Thread 
{
    private int[] array;
    private int threadCount;

    SumCalculator(int[] array, int threadCount) 
    {
        this.array = array;
        this.threadCount = threadCount;
    }

    public void run()
    {
        int sum = calculateSum();
        System.out.println("Thread " + threadCount + ": Sum of Array" + threadCount + ": " + sum);
    }

    private int calculateSum() 
    {
        int totalSum = 0;
        for (int num : array) 
        {
            totalSum += num;
        }
        return totalSum;
    }
}

public class threads 
{
    public static void main(String[] args)
    {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 6, 7, 8, 9, 10 };
        int[] array3 = { 11, 12, 13, 14, 15 };
        int[] array4 = { 121, 1212, 1323, 14244, 1512 };


        // Create and start three threads
        SumCalculator calculator1 = new SumCalculator(array1, 1);
        SumCalculator calculator2 = new SumCalculator(array2, 2);
        SumCalculator calculator3 = new SumCalculator(array3, 3);
        SumCalculator calculator4 = new SumCalculator(array4, 4);


        calculator1.start();
        calculator2.start();
        calculator3.start();
        calculator4.start();

    }
}
