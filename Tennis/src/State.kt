abstract class State(val firstPlayer: Player, val secondPlayer: Player)
{
    val scoreDifference = firstPlayer.score - secondPlayer.score

    abstract fun score(): String
}
