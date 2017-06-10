package benchmarks;

import org.openjdk.jmh.annotations.*;

public class SimpleBenchmark {

    @Benchmark
    @Fork(1)
    @Measurement(iterations = 10, batchSize = 1)
    @Warmup(iterations = 10)
    public void HelloWorld() {
        //System.out.println("Helllo TACS !");
    }

}

//@CompilerControl.Mode.DONT_INLINE