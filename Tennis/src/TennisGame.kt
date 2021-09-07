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
        var score = ""
        var tempScore = 0
        if (firstPlayer.score == secondPlayer.score)
        {
            when (firstPlayer.score)
            {
                0    -> score = "Love-All"
                1    -> score = "Fifteen-All"
                2    -> score = "Thirty-All"
                else -> score = "Deuce"
            }
        }
        else if (firstPlayer.score >= 4 || secondPlayer.score >= 4)
        {
            val minusResult = firstPlayer.score - secondPlayer.score
            if (minusResult == 1)
            {
                score = "Advantage ${firstPlayer.name}"
            }
            else if (minusResult == -1)
            {
                score = "Advantage ${secondPlayer.name}"
            }
            else if (minusResult >= 2)
            {
                score = "Win for ${firstPlayer.name}"
            }
            else
            {
                score = "Win for ${secondPlayer.name}"
            }
        }
        else
        {
            for (i in 1..2)
            {
                if (i == 1)
                    tempScore = firstPlayer.score
                else
                {
                    score += "-"
                    tempScore = secondPlayer.score
                }
                when (tempScore)
                {
                    0 -> score += "Love"
                    1 -> score += "Fifteen"
                    2 -> score += "Thirty"
                    3 -> score += "Forty"
                }
            }
        }
        return score
    }
}