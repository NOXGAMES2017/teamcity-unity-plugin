

package jetbrains.buildServer.unity.logging

class PlayerStatisticsBlock : LogBlock {

    override val name = "Player statistics"

    override val logFirstLine = LogType.None

    override val logLastLine = LogType.Inside

    override fun isBlockStart(text: String) = blockStart.containsMatchIn(text)

    override fun isBlockEnd(text: String) = blockEnd.containsMatchIn(text)

    override fun getText(text: String) = text

    companion object {
        private val blockStart = Regex("\\*\\*\\*Player size statistics\\*\\*\\*")
        private val blockEnd = Regex("Total compressed size.*")
    }
}
