class CityFinder(private val cities: List<String>)
{
    companion object
    {
        private const val ALL_CITIES_WILDCARD = "*"
    }

    fun find(cityName: String): List<String>
    {
        return when
        {
            cityName == ALL_CITIES_WILDCARD -> cities
            searchCriteriaIsValid(cityName) -> cities.filter { it.contains(cityName, ignoreCase = true) }
            else                            -> emptyList()
        }
    }

    private fun searchCriteriaIsValid(cityName: String) = cities.isNotEmpty() && cityName.length > 1
}
