class AdvantageState(firstPlayer: Player, secondPlayer: Player) : State(firstPlayer, secondPlayer)
{
    override fun score(): String
    {
        if (scoreDifference == 1)
        {
            return "Advantage ${firstPlayer.name}"
        }
        else
        {
            return "Advantage ${secondPlayer.name}"
        }
    }

}
