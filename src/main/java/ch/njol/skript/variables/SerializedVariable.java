/*
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 * Copyright 2011-2013 Peter Güttinger
 * 
 */

package ch.njol.skript.variables;

import java.io.Serializable;

import org.eclipse.jdt.annotation.Nullable;

/**
 * @author Peter Güttinger
 */
public class SerializedVariable implements Serializable {
	private static final long serialVersionUID = -1895962303654561763L;
	
	public String name;
	@Nullable
	public Value value;
	
	public SerializedVariable(final String name, final @Nullable Value value) {
		this.name = name;
		this.value = value;
	}
	
	public final static class Value implements Serializable {
		private static final long serialVersionUID = -4548432385432002060L;
		
		public String type;
		public byte[] data;
		
		public Value(final String type, final byte[] data) {
			this.type = type;
			this.data = data;
		}
	}
	
}