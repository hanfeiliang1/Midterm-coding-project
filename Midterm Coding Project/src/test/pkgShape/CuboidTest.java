package pkgShape;

import org.junit.*;
import org.junit.rules.ExpectedException;


import java.util.Arrays;

import static org.junit.Assert.*;

public class CuboidTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    Cuboid cuboid;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Start testing Cuboid...");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Test finished.");
    }

    @Test
    public void constructorTest() {
        cuboid = new Cuboid(4, 5, 6);
        assertEquals("Constructor is not working as expected.", 4, cuboid.iDepth);
        assertEquals("Constructor is not working as expected.", 5, cuboid.iWidth);
        assertEquals("Constructor is not working as expected.", 6, cuboid.iLength);
    }

    @Test
    public void constructorIllegalArgumentTest(){
        exception.expect(IllegalArgumentException.class);
        cuboid = new Cuboid(-4, 5, 6);
    }

    @Test
    public void constructorIllegalArgumentTest2() {
        exception.expect(IllegalArgumentException.class);
        cuboid = new Cuboid(4, -5, 6);
    }

    @Test
    public void constructorIllegalArgumentTest3() {
        exception.expect(IllegalArgumentException.class);
        cuboid = new Cuboid(4, 5, -6);
    }

    @Test
    public void setiDepthTest() {
        cuboid = new Cuboid(4, 5, 6);
        cuboid.setiDepth(3);
        assertEquals("SetiDepth method is not working as expected.", 3, cuboid.iDepth, 0);
    }

    @Test
    public void getiDepthTest() {
        cuboid = new Cuboid(4,5, 6);
        assertEquals("GetiDepth method is not working as expected.", 4, cuboid.getiDepth(), 0);
    }

    @Test
    public void volumeTest() {
        cuboid = new Cuboid(4,5, 6);
        assertEquals("Volume method is not working as expected.", 120, cuboid.volume(), 0);
    }

    @Test
    public void area() {
        cuboid = new Cuboid(4,5, 6);
        assertEquals("Area method is not working as expected.", 148, cuboid.area(), 0);
    }

    @Test
    public void perimeterTest() {
        cuboid = new Cuboid(4,5, 6);
        exception.expect(UnsupportedOperationException.class);
        exception.expectMessage("Perimeter is not supported in on this shape.");
        cuboid.perimeter();
    }

    @Test
    public void sortByAreaTest() {
        Cuboid[] cuboidsArray = new Cuboid[3];
        cuboidsArray[0] = new Cuboid(4, 5, 6);
        cuboidsArray[1] = new Cuboid(3, 2, 1);
        cuboidsArray[2] = new Cuboid(8, 8, 8);

        Cuboid[] expectedArray = { cuboidsArray[1], cuboidsArray[0], cuboidsArray[2] };

        Arrays.sort(cuboidsArray, new Cuboid.SortByArea());

        assertArrayEquals("SortByArea is not working as expected.", expectedArray, cuboidsArray);
    }

    @Test
    public void sortByVolumeTest() {
        Cuboid[] cuboidsArray = new Cuboid[3];
        cuboidsArray[0] = new Cuboid(4, 5, 6);
        cuboidsArray[1] = new Cuboid(3, 2, 1);
        cuboidsArray[2] = new Cuboid(8, 8, 8);

        Cuboid[] expectedArray = { cuboidsArray[1], cuboidsArray[0], cuboidsArray[2] };

        Arrays.sort(cuboidsArray, new Cuboid.SortByVolume());

        assertArrayEquals("SortByVolume is not working as expected.", expectedArray, cuboidsArray);
    }
}