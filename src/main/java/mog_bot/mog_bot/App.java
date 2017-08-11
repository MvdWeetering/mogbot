package mog_bot.mog_bot;

import javax.security.auth.login.LoginException;

import codebase.loadInsults;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

//local commit

public class App extends ListenerAdapter {
	public static void main(String[] args)
			throws LoginException, IllegalArgumentException, InterruptedException, RateLimitedException {
		JDA jdaBot = new JDABuilder(AccountType.BOT)
				.setToken("MzQ1NTUzMDQ3NzcxOTM4ODE5.DG89Aw.Nr3x3_M3yjXBpl2viDUa1qfZoDc").buildBlocking();
		jdaBot.addEventListener(new App());
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent e) {

		Message objMsg = e.getMessage();
		MessageChannel objChannel = e.getChannel();
		User objUser = e.getAuthor();

		if (objMsg.getContent().equalsIgnoreCase("test")) {

			switch (objUser.getName()) {

			case "Teefy":
					
				objChannel.sendMessage("Hello, you " + loadInsults.returnInsult() + objUser.getAsMention()).queue();
				break;
			case "Icestorm":
				objChannel.sendMessage("Hello, you " + loadInsults.returnInsult() + objUser.getAsMention()).queue();
				break;
			case "Mog_no_1":
				objChannel.sendMessage("oh look, its the " + loadInsults.returnInsult() + objUser.getAsMention()).queue();
				objChannel.sendMessage("please, just get fucking lost... ").queue();
				break;

			default:
				objChannel.sendMessage("Welcome, simple pleb").queue();
				break;
			}
		}
	}
}
