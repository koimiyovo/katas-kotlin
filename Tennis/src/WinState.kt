class WinState(firstPlayer: Player, secondPlayer: Player) : State(firstPlayer, secondPlayer)
{
    override fun score(): String
    {
        if (scoreDifference >= 2)
        {
            return "Win for ${firstPlayer.name}"
        }
        else
        {
            return "Win for ${secondPlayer.name}"
        }
    }

}
