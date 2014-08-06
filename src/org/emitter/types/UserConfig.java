/**
 * 
 */
package org.emitter.types;

import com.google.gson.annotations.Since;

/**
 * @author jeremy
 * 
 */
public class UserConfig
{
	@Since(1.0) private String	address;
	@Since(1.0) private String	addressAppt;
	@Since(1.0) private String	email;
	@Since(1.0) private String	zipPostal;
	@Since(1.0) private String	phoneNumber;
	/**
	 * 
	 */
	public UserConfig()
	{
	
	}
	/**
	 * @return the address
	 */
	public final String getAddress()
	{
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address)
	{
		this.address = address;
	}
	/**
	 * @return the addressAppt
	 */
	public final String getAddressAppt()
	{
		return addressAppt;
	}
	/**
	 * @param addressAppt the addressAppt to set
	 */
	public final void setAddressAppt(String addressAppt)
	{
		this.addressAppt = addressAppt;
	}
	/**
	 * @return the email
	 */
	public final String getEmail()
	{
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email)
	{
		this.email = email;
	}
	/**
	 * @return the zipPostal
	 */
	public final String getZipPostal()
	{
		return zipPostal;
	}
	/**
	 * @param zipPostal the zipPostal to set
	 */
	public final void setZipPostal(String zipPostal)
	{
		this.zipPostal = zipPostal;
	}
	/**
	 * @return the phoneNumber
	 */
	public final String getPhoneNumber()
	{
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public final void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

}
