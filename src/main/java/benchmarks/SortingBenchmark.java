package benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static sorting.BubbleSort.bubble_srt;
import static sorting.QuickSort.quick_sort;

public class SortingBenchmark {

    static int[] generateLst(int size){
        Random rnd = new Random(0);
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rnd.nextInt();
        }

        return numbers;
    }

    @Benchmark
    @Fork(1)
    @Measurement(iterations = 10, batchSize = 1)
    @Warmup(iterations = 10)
    public void BubbleSrt10() {
        bubble_srt(generateLst(10));
    }

    @Benchmark
    @Fork(1)
    @Measurement(iterations = 10, batchSize = 1)
    @Warmup(iterations = 10)
    public void QuickSrt10() {
        quick_sort(generateLst(10));
    }

    @Benchmark
    @Fork(1)
    @Measurement(iterations = 10, batchSize = 1)
    @Warmup(iterations = 10)
    public void BubbleSrt1000() {
        bubble_srt(generateLst(1000));
    }

    @Benchmark
    @Fork(1)
    @Measurement(iterations = 10, batchSize = 1)
    @Warmup(iterations = 10)
    public void QuickSrt1000() {
        quick_sort(generateLst(1000));
    }

    //Flags a probar
    //@CompilerControl.Mode.DONT_INLINE
}

