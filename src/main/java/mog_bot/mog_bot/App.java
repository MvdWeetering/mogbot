package mog_bot.mog_bot;

import javax.security.auth.login.LoginException;

import codebase.ContentFilter;
import codebase.contentReader;
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

		String FilteredMessage = ContentFilter.FilteredMessge(objMsg.getContent(), objUser.getName());
		
		if (FilteredMessage !=null) {
		objChannel.sendMessage(FilteredMessage).queue();
		}		
	}
	
	public void finduser() {
	}
	
	
	
}
