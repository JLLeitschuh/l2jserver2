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
package com.l2jserver.model.world;

import com.l2jserver.util.geometry.Coordinate;
import com.l2jserver.util.geometry.Point3D;

/**
 * This is an abstract object that objects that can be placed in world should
 * extend.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public abstract class PositionableObject extends AbstractObject {
	/**
	 * The point this object is currently in
	 */
	private Point3D point;

	/**
	 * @return the coordinate point
	 */
	public Point3D getPoint() {
		return point;
	}

	/**
	 * @param point
	 *            the coordinate point to set
	 */
	public void setPoint(Point3D point) {
		desireUpdate();
		this.point = point;
	}

	/**
	 * @return the position coodinate
	 */
	public Coordinate getPosition() {
		return point.getCoordinate();
	}

	/**
	 * @param coord
	 *            sets the current position
	 */
	public void setPosition(Coordinate coord) {
		desireUpdate();
		this.point = new Point3D(coord, (point != null ? point.getAngle() : 0));
	}
}
