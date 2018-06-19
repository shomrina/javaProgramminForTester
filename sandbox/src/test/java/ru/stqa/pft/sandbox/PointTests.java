package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Double.NEGATIVE_INFINITY;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;

public class PointTests {

    @Test
    public void testNullPoint() {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(0.0, 0.0);
        Assert.assertEquals(p1.distance(p2), 0.0);
        Point p3 = new Point(1.0, 2.0);
        Point p4 = new Point(1.0, 2.0);
        Assert.assertEquals(p3.distance(p4), 0.0);
    }

    @Test
    public void testNegativeCoordinate() {
        Point p3 = new Point(-1.0, 2.0);
        Point p4 = new Point(1.0, -2.0);
        Assert.assertEquals(p3.distance(p4), Math.sqrt(20));
    }

    @Test
    public void testPointWithSpecialType() {
        Point p1 = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Point p2 = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);
        Assert.assertEquals(p1.distance(p2), 6.074000998537886E9);

        Point p3 = new Point(Double.MAX_VALUE, Double.MAX_VALUE);
        Point p4 = new Point(Double.MIN_VALUE, Double.MIN_VALUE);
        Assert.assertEquals(p3.distance(p4), Infinity);

        Point p5 = new Point(Double.MIN_VALUE, Double.MIN_VALUE);
        Point p6 = new Point(Double.MIN_VALUE, Double.MIN_VALUE);
        Assert.assertEquals(p5.distance(p6), 0.0);

        Point p7 = new Point(Infinity, Infinity);
        Point p8 = new Point(Infinity, Infinity);
        Assert.assertEquals(p7.distance(p8), NaN);

        Point p9 = new Point(NEGATIVE_INFINITY, NEGATIVE_INFINITY);
        Point p10 = new Point(NEGATIVE_INFINITY, NEGATIVE_INFINITY);
        Assert.assertEquals(p9.distance(p10), NaN);

        Point p11 = new Point(NEGATIVE_INFINITY, Infinity);
        Point p12 = new Point(Infinity, NEGATIVE_INFINITY);
        Assert.assertEquals(p11.distance(p12), Infinity);
    }
}
