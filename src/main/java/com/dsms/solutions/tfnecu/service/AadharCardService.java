/**
 * 
 */
package com.dsms.solutions.tfnecu.service;

import java.util.List;

/**
 * @author Babu
 *
 */
public interface AadharCardService<T extends Object> {

	public abstract boolean addAadharCard(Object paramObject);

	public abstract List<? extends Object> getAadharCard(String paramObject);
}
