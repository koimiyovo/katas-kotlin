import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class CityFinderTest
{
    private val cities = listOf("Lyon", "Paris", "Lomé", "Hong Kong", "Accra", "Bangkok")
    private val cityFinder = CityFinder(cities)

    @Test
    internal fun `empty referential`()
    {
        val emptyCityFinder = CityFinder(emptyList())
        assertEquals(emptyList(), emptyCityFinder.find("Paris"))
    }

    @Test
    internal fun `given city name in database then get it`()
    {
        assertAll(
                { assertEquals(listOf("Paris"), cityFinder.find("Paris")) },
                { assertEquals(listOf("Lomé"), cityFinder.find("Lomé")) }
        )
    }

    @Test
    internal fun `should get all city names starting with search text`()
    {
        assertAll(
                { assertEquals(listOf("Lyon"), cityFinder.find("Ly")) },
                { assertEquals(listOf("Paris"), cityFinder.find("Pa")) }
        )
    }

    @Test
    internal fun `given search text less than 2 characters then get empty list`()
    {
        assertAll(
                { assertEquals(emptyList(), cityFinder.find("")) },
                { assertEquals(emptyList(), cityFinder.find("P")) }
        )
    }

    @Test
    internal fun `search text is case insensitive`()
    {
        assertAll(
                { assertEquals(listOf("Accra"), cityFinder.find("accra")) },
                { assertEquals(listOf("Lyon"), cityFinder.find("lY")) }
        )
    }

    @Test
    internal fun `should get all city names containing search text`()
    {
        assertAll(
                { assertEquals(listOf("Lomé"), cityFinder.find("om")) },
                { assertEquals(listOf("Hong Kong", "Bangkok"), cityFinder.find("ng")) },
        )
    }

    @Test
    internal fun `given asterisk as search text then get all city names`()
    {
        assertEquals(cities, cityFinder.find("*"))
    }
}