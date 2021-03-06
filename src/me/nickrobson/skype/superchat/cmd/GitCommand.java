package me.nickrobson.skype.superchat.cmd;

import xyz.gghost.jskype.Group;
import xyz.gghost.jskype.message.Message;
import xyz.gghost.jskype.user.GroupUser;

public class GitCommand implements Command {

	@Override
	public String[] names() {
		return new String[]{ "git" };
	}

	@Override
	public String[] help(GroupUser user) {
		return new String[]{ "", "tells you the bot's git repo" };
	}

	@Override
	public void exec(GroupUser user, Group group, String used, String[] args, Message message) {
		group.sendMessage("<a href=\"http://github.com/nickrobson/SuperChat/\">http://github.com/nickrobson/SuperChat/</a>");
	}

}
