class DrawState(firstPlayer: Player, secondPlayer: Player = firstPlayer) : State(firstPlayer, secondPlayer)
{
    override fun score(): String
    {
        return when (firstPlayer.score)
        {
            0    -> "Love-All"
            1    -> "Fifteen-All"
            2    -> "Thirty-All"
            else -> "Deuce"
        }
    }

}
