package oakbot.listener;

import oakbot.bot.ChatResponse;
import oakbot.chat.ChatMessage;

/**
 * Listens to each new message and optionally responds to it.
 * @author Michael Angstadt
 */
public interface Listener {
	/**
	 * Gets the listener's name.
	 * @return the name
	 */
	String name();

	/**
	 * Gets the listener's description. This should be a short, one sentence
	 * description. SO markdown should not be used.
	 * @return the description
	 */
	String description();

	/**
	 * Gets the listener's help text. This is shown when this listener is
	 * queried with the "help" command. SO markdown should not be used.
	 * @return the help text
	 */
	String helpText();

	/**
	 * Called whenever a new message is received.
	 * @param message the message
	 * @param isAdmin true if the message sender is an admin, false if not
	 * @return the response or null not to send a response
	 */
	ChatResponse onMessage(ChatMessage message, boolean isAdmin);
}