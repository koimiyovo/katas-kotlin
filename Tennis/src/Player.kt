data class Player(val name: String)
{
    var score: Int = 0
        private set

    fun wonPoint()
    {
        this.score++
    }
}
