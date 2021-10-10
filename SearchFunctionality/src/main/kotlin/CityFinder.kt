class CityFinder(private val cities: List<String>)
{
    fun find(cityName: String): List<String>
    {
        return when
        {
            cities.isEmpty() -> emptyList()
            else             -> cities.filter { it == cityName }
        }
    }
}
