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
        val gameState = Referee(firstPlayer, secondPlayer).detectState()
        return gameState.score()
    }
}