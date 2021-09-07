class Referee(private val firstPlayer: Player, private val secondPlayer: Player)
{
    private val scoreDifference = firstPlayer.score - secondPlayer.score

    fun detectState(): State
    {
        return when
        {
            draw()      -> DrawState(firstPlayer)
            advantage() -> AdvantageState(firstPlayer, secondPlayer)
            win()       -> WinState(firstPlayer, secondPlayer)
            else        -> OnGoingState(firstPlayer, secondPlayer)
        }
    }

    private fun draw() = firstPlayer.score == secondPlayer.score

    private fun advantage() = (firstPlayer.score >= 4 || secondPlayer.score >= 4) && (scoreDifference == 1 || scoreDifference == -1)

    private fun win() = (firstPlayer.score >= 4 || secondPlayer.score >= 4) && (scoreDifference >= 2 || scoreDifference <= -2)
}
