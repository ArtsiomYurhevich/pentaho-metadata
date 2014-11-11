/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2006 - 2009 Pentaho Corporation..  All rights reserved.
 */
package org.pentaho.pms.schema.concept.types.string;

import org.pentaho.metadata.model.concept.Property;
import org.pentaho.pms.schema.concept.ConceptPropertyInterface;
import org.pentaho.pms.schema.concept.types.ConceptPropertyBase;
import org.pentaho.pms.schema.concept.types.ConceptPropertyType;

/**
 * @deprecated as of metadata 3.0.
 */
public class ConceptPropertyString extends ConceptPropertyBase implements ConceptPropertyInterface, Cloneable {
  private String value;
  private static final String EMPTY_STRING = "";

  public ConceptPropertyString( String name, String value ) {
    this( name, value, false );
  }

  public ConceptPropertyString( String name, String value, boolean required ) {
    super( name, required );
    setValue( new Property<String>( value ) );
  }

  public String toString() {
    return value;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public ConceptPropertyType getType() {
    return ConceptPropertyType.STRING;
  }
  
  public Property getValue() {
    return new Property<String>( value );
  }
  
  public void setValue( Property value ) {
    if ( null != value && null != value.getValue()) {
      this.value = (String) value.getValue();
    } else {
      this.value = EMPTY_STRING;
    }
  }

  public boolean equals( Object obj ) {
    return value.equals( obj );
  }

  public int hashCode() {
    return value.hashCode();
  }
}
