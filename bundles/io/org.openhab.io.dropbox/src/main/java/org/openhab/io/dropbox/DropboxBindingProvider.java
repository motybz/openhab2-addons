/**
 * openHAB, the open Home Automation Bus.
 * Copyright (C) 2010-2012, openHAB.org <admin@openhab.org>
 *
 * See the contributors.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or
 * combining it with Eclipse (or a modified version of that library),
 * containing parts covered by the terms of the Eclipse Public License
 * (EPL), the licensors of this Program grant you additional permission
 * to convey the resulting work.
 */
package org.openhab.io.dropbox;

import java.util.Collection;

import org.openhab.core.binding.BindingProvider;
import org.openhab.core.items.Item;


/**
 * This interface is implemented by classes that can map openHAB items to
 * Dropbox binding types.
 * 
 * Implementing classes should register themselves as a service in order to be 
 * taken into account.
 * 
 * @author Thomas.Eichstaedt-Engelen
 * @since 1.0.0
 */
public interface DropboxBindingProvider extends BindingProvider {

	/**
	 * Returns all items of the given <code>clazz</code>. To be more precise
	 * all items which class is assignable from <code>clazz</code>
	 * 
	 * @param clazz the Item class of which class the returned items should be
	 * @return a {@link Collection} of items which class is assignable from
	 * <code>clazz</code>. The {@link Collection} is never <code>null</code>.
	 */
	Collection<String> getItemNamesOf(Class<? extends Item> clazz);
	
}
