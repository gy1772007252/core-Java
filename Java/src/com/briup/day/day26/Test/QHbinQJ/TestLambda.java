package com.briup.day.day26.Test.QHbinQJ;

interface Compute<T, R> {
    R compute(T t1, T t2);
}

public class TestLambda {

    public static void main(String[] args) {

        Compute<Long, Long> computeQH = (long1, long2) -> long1 + long2;
        Compute<Long, Long> computeQJ = (long1, long2) -> long1 * long2;

        TestLambda testLambda = new TestLambda();
        Long long1 = 2L;
        Long long2 = 3L;

        System.out.println("求和：" + testLambda.compute(long1, long2, computeQH));
        System.out.println("求和：" + testLambda.compute(long1, long2, computeQJ));

    }

    private Long compute(Long long1, Long long2, Compute compute) {
        return (Long) compute.compute(long1, long2);
    }

}
