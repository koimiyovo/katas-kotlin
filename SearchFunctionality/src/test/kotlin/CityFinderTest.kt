import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class CityFinderTest
{
    @Test
    internal fun `empty referential`()
    {
        val cityFinder = CityFinder(emptyList())
        assertEquals(emptyList(), cityFinder.find("Paris"))
    }

    @Test
    internal fun `given city name in database then get it`()
    {
        val cityFinder = CityFinder(listOf("Lyon", "Paris", "Lomé"))
        assertAll(
                { assertEquals(listOf("Paris"), cityFinder.find("Paris")) },
                { assertEquals(listOf("Lomé"), cityFinder.find("Lomé")) }
        )
    }
}