package pkgShape;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class RectangleTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    Rectangle rectangle;

    @Test
    public void constructorTest() {
        rectangle = new Rectangle(4, 5);
        assertEquals("Constructor is not working as expected.", 4, rectangle.iWidth);
        assertEquals("Constructor is not working as expected.", 5, rectangle.iLength);
    }

    @Test
    public void constructorIllegalArgumentTest(){
        exception.expect(IllegalArgumentException.class);
        rectangle = new Rectangle(-4, 5);
    }

    @Test
    public void constructorIllegalArgumentTest2() {
        exception.expect(IllegalArgumentException.class);
        rectangle = new Rectangle(1, -5);
    }

    @Test
    public void areaTest() {
        rectangle = new Rectangle(4, 5);
        assertEquals("Area method is not working as expected.", 20, rectangle.area(), 1e-9);
    }

    @Test
    public void perimeterTest() {
        rectangle = new Rectangle(4, 5);
        assertEquals("Perimeter method is not working as expected.", 18, rectangle.perimeter(), 1e-9);
    }

    @Test
    public void setiWidthTest() {
        rectangle = new Rectangle(4, 5);
        rectangle.setiWidth(3);
        assertEquals("SetiWidth method is not working as expected.", 3, rectangle.iWidth, 0);
    }

    @Test
    public void getiWidthTest() {
        rectangle = new Rectangle(4,5);
        assertEquals("GetiWidth method is not working as expected.", 4, rectangle.getiWidth(), 0);
    }

    @Test
    public void setiLengthTest() {
        rectangle = new Rectangle(4, 5);
        rectangle.setiLength(6);
        assertEquals("SetiLength method is not working as expected.", 6, rectangle.iLength, 0);
    }

    @Test
    public void getiLengthTest() {
        rectangle = new Rectangle(4,5);
        assertEquals("GetiLength method is not working as expected.", 5, rectangle.getiLength(), 0);
    }

    @Test
    public void compareToTest() {
        rectangle = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(4, 5);
        assertTrue("CompareTo is now working as expected.", rectangle.compareTo(rectangle2) < 0);
    }
}