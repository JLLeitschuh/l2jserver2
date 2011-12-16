/*
 * This file is part of l2jserver2 <l2jserver2.com>.
 *
 * l2jserver2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver2.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.game.net.packet.server;

import org.jboss.netty.buffer.ChannelBuffer;

import com.l2jserver.game.net.Lineage2Client;
import com.l2jserver.game.net.packet.AbstractServerPacket;
import com.l2jserver.model.world.L2Character;
import com.l2jserver.util.geometry.Point3D;

/**
 * This packet notifies the client that the chosen character has been
 * successfully selected.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class SM_CHAR_TELEPORT extends AbstractServerPacket {
	/**
	 * The packet OPCODE
	 */
	public static final int OPCODE = 0x22;

	/**
	 * The selected character
	 */
	private final L2Character character;
	/**
	 * The teleportation point
	 */
	private final Point3D point;

	public SM_CHAR_TELEPORT(L2Character character, Point3D point) {
		super(OPCODE);
		this.character = character;
		this.point = point;
	}

	@Override
	public void write(Lineage2Client conn, ChannelBuffer buffer) {
		buffer.writeInt(character.getID().getID());
		buffer.writeInt(point.getX());
		buffer.writeInt(point.getY());
		buffer.writeInt(point.getZ());
		buffer.writeInt(0x00); // isValidation ??
		buffer.writeInt((int) point.getAngle()); // nYaw
	}
}