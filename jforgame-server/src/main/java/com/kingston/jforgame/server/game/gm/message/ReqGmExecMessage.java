package com.kingston.jforgame.server.game.gm.message;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.kingston.jforgame.net.socket.annotation.MessageMeta;
import com.kingston.jforgame.net.socket.message.Message;
import com.kingston.jforgame.server.game.Modules;
import com.kingston.jforgame.server.game.gm.GmConstant;

@MessageMeta(module=Modules.GM, cmd=GmConstant.REQ_GM_EXEC)
public class ReqGmExecMessage extends Message {
	
	@Protobuf(order = 1)
	public String command;

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	@Override
	public String toString() {
		return "ReqGmExecMessage [command=" + command + "]";
	}
	
	


}
