class OnGoingState(firstPlayer: Player, secondPlayer: Player) : State(firstPlayer, secondPlayer)
{
    override fun score() = "${translateScore(firstPlayer.score)}-${translateScore(secondPlayer.score)}"

    private fun translateScore(score: Int) = when (score)
    {
        0    -> "Love"
        1    -> "Fifteen"
        2    -> "Thirty"
        3    -> "Forty"
        else -> ""
    }
}
