package at.hannibal2.skyhanni.discord.command

import net.dv8tion.jda.api.events.message.MessageReceivedEvent

object TestRepoCommand : BaseCommand() {
    override val name: String = "testrepo"
    override val description: String = "Explains how to change the repo to test a Feature requiring repo changes."

    override fun MessageReceivedEvent.execute(args: List<String>) {
        if (args.isEmpty()) return wrongUsage("<number>")
    }
}