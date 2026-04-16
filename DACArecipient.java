/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * @version 1.0
 **/

// TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOfOrigin() : String
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char

+ setSurname(String) : void
+ setGivenName(String) : void
+ setUscisNumber(String) : void
+ setCountryOfOrigin(String) : void
+ setBirthday(int) : void
+ setValidFromDate(int) : void
+ setExpirationDate(int) : void
+ setSex(char) : void

+ setAll(String, String, String, String, int, int, int, char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;

	private int birthday;
	private int validFromDate;
	private int expirationDate;

	private char sex;

	/***** ACCESSORS *****/

	/**
	 * @return surname of recipient
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @return given name of recipient
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * @return USCIS number
	 */
	public String getUscisNumber() {
		return uscisNumber;
	}

	/**
	 * @return country of origin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * @return birthday as Julian Day Number
	 */
	public int getBirthday() {
		return birthday;
	}

	/**
	 * @return valid from date as Julian Day Number
	 */
	public int getValidFromDate() {
		return validFromDate;
	}

	/**
	 * @return expiration date as Julian Day Number
	 */
	public int getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @return sex of recipient
	 */
	public char getSex() {
		return sex;
	}

	/***** MUTATORS *****/

	/**
	 * Sets surname of recipient
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Sets given name of recipient
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/**
	 * Sets USCIS number
	 */
	public void setUscisNumber(String uscisNumber) {
		this.uscisNumber = uscisNumber;
	}

	/**
	 * Sets country of origin
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	/**
	 * Sets birthday (Julian Day Number)
	 */
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	/**
	 * Sets valid from date (Julian Day Number)
	 */
	public void setValidFromDate(int validFromDate) {
		this.validFromDate = validFromDate;
	}

	/**
	 * Sets expiration date (Julian Day Number)
	 */
	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * Sets sex of recipient
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	/**
	 * Sets ALL instance variables at once.
	 */
	public void setAll(String surname,
					   String givenName,
					   String uscisNumber,
					   String countryOfOrigin,
					   int birthday,
					   int validFromDate,
					   int expirationDate,
					   char sex)
	{
		this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;
	}
}