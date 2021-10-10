import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CityFinderTest
{
    @Test
    internal fun `empty referential`()
    {
        val cityFinder = CityFinder(emptyList())
        assertEquals(emptyList(), cityFinder.find("Paris"))
    }
}