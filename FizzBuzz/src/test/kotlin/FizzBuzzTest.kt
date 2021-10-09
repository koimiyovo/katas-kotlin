import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class FizzBuzzTest
{
    @Test
    internal fun `given number not divisible by 3 nor 5 then get itself`()
    {
        assertAll(
                { assertEquals("1", fizzBuzz(1)) },
                { assertEquals("454", fizzBuzz(454)) }
        )
    }

    @Test
    internal fun `given number divisible by 3 then get Fizz`()
    {
        assertAll(
                { assertEquals("Fizz", fizzBuzz(3)) },
                { assertEquals("Fizz", fizzBuzz(51)) }
        )
    }

    @Test
    internal fun `given number divisible by 5 then get Buzz`()
    {
        assertAll(
                { assertEquals("Buzz", fizzBuzz(5)) },
                { assertEquals("Buzz", fizzBuzz(95)) }
        )
    }

    @Test
    internal fun `given number divisible by 3 and 5 then get FizzBuzz`()
    {
        assertAll(
                { assertEquals("FizzBuzz", fizzBuzz(15)) },
                { assertEquals("FizzBuzz", fizzBuzz(270)) }
        )
    }
}