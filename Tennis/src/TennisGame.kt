class TennisGame(firstPlayerName: String, secondPlayerName: String)
{
    private val firstPlayer = Player(firstPlayerName)
    private val secondPlayer = Player(secondPlayerName)

    fun wonPoint(playerName: String)
    {
        if (playerName === firstPlayer.name)
            firstPlayer.wonPoint()
        else
            secondPlayer.wonPoint()
    }

    fun getScore(): String
    {
        return when
        {
            draw()           -> drawResult()
            advantageOrWin() -> advantageOrWinResult()
            else             -> onGoingResult()
        }
    }

    private fun draw() = firstPlayer.score == secondPlayer.score

    private fun drawResult(): String
    {
        return when (firstPlayer.score)
        {
            0    -> "Love-All"
            1    -> "Fifteen-All"
            2    -> "Thirty-All"
            else -> "Deuce"
        }
    }

    private fun advantageOrWin() = firstPlayer.score >= 4 || secondPlayer.score >= 4

    private fun advantageOrWinResult(): String
    {
        val scoreDifference = firstPlayer.score - secondPlayer.score
        if (scoreDifference == 1)
        {
            return "Advantage ${firstPlayer.name}"
        }
        else if (scoreDifference == -1)
        {
            return "Advantage ${secondPlayer.name}"
        }
        else if (scoreDifference >= 2)
        {
            return "Win for ${firstPlayer.name}"
        }
        else
        {
            return "Win for ${secondPlayer.name}"
        }
    }

    private fun onGoingResult() = "${translateScore(firstPlayer.score)}-${translateScore(secondPlayer.score)}"

    private fun translateScore(score: Int) = when (score)
    {
        0    -> "Love"
        1    -> "Fifteen"
        2    -> "Thirty"
        3    -> "Forty"
        else -> ""
    }
}