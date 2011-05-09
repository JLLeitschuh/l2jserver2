package com.l2jserver.game.net.packet.client;

import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;

import com.google.inject.Inject;
import com.l2jserver.db.dao.CharacterDAO;
import com.l2jserver.game.net.Lineage2Connection;
import com.l2jserver.game.net.Lineage2Session;
import com.l2jserver.game.net.packet.AbstractClientPacket;
import com.l2jserver.game.net.packet.server.CharacterEnterWorldPacket;
import com.l2jserver.model.world.L2Character;
import com.l2jserver.util.BufferUtils;

/**
 * This packet is sent by the client once the login server has authorized
 * authentication into this server. A new {@link Lineage2Session} object will be
 * set to the current connection and the character list is sent to the client.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class AuthLoginPacket extends AbstractClientPacket {
	public static final int OPCODE = 0x2b;

	private final CharacterDAO characterDao;

	// packet
	private String loginName;
	private int playKey1;
	private int playKey2;
	private int loginKey1;
	private int loginKey2;

	@Inject
	public AuthLoginPacket(CharacterDAO characterDao) {
		this.characterDao = characterDao;
	}

	@Override
	public void read(ChannelBuffer buffer) {
		this.loginName = BufferUtils.readString(buffer).toLowerCase();
		this.playKey1 = buffer.readInt();
		this.playKey2 = buffer.readInt();
		this.loginKey1 = buffer.readInt();
		this.loginKey2 = buffer.readInt();
	}

	@Override
	public void process(final Lineage2Connection conn) {
		conn.setSession(new Lineage2Session(loginName, playKey1, playKey2,
				loginKey1, loginKey2));

		final List<L2Character> chars = characterDao.selectByAccount(conn
				.getSession().getUsername());
//		conn.write(CharacterSelectionListPacket.fromL2Session(
//				conn.getSession(), chars.toArray(new L2Character[0])));
		conn.write(new CharacterEnterWorldPacket(chars.get(0), playKey1));
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @return the playKey1
	 */
	public int getPlayKey1() {
		return playKey1;
	}

	/**
	 * @return the playKey2
	 */
	public int getPlayKey2() {
		return playKey2;
	}

	/**
	 * @return the loginKey1
	 */
	public int getLoginKey1() {
		return loginKey1;
	}

	/**
	 * @return the loginKey2
	 */
	public int getLoginKey2() {
		return loginKey2;
	}
}