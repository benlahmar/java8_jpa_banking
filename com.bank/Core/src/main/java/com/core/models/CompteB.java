/**
 * 
 */
package com.core.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author moi
 *
 */
@Entity
@DiscriminatorColumn(name = "type")
@DiscriminatorValue(value = "B")
public class CompteB extends Compte{

}
