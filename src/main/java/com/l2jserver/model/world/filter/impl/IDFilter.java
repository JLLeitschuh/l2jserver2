package com.l2jserver.model.world.filter.impl;

import com.l2jserver.model.id.ObjectID;
import com.l2jserver.model.world.capability.Positionable;
import com.l2jserver.model.world.filter.WorldObjectFilter;

/**
 * Filter objects based on its ID.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class IDFilter implements WorldObjectFilter<Positionable> {
	/**
	 * The object id
	 */
	private final ObjectID<?> id;

	/**
	 * Creates a new instance
	 * 
	 * @param id
	 *            the desired object ID
	 */
	public IDFilter(final ObjectID<?> id) {
		this.id = id;
	}

	@Override
	public boolean accept(Positionable other) {
		if (other == null)
			return false;
		return other.getID().equals(id);
	}
}
