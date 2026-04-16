class Main 
{
  public static void main(String[] args) 
  {
    // ===== Person 1 (using setters) =====
    DACArecipient person1 = new DACArecipient();

    person1.setSurname("Mendez");
    person1.setGivenName("Javier");
    person1.setUscisNumber("56-3-445");
    person1.setCountryOfOrigin("Venezuela");
    person1.setBirthday(2451564);
    person1.setValidFromDate(3956753);
    person1.setExpirationDate(3956840);
    person1.setSex('M');

    // ===== Person 2 (using setAll) =====
    DACArecipient person2 = new DACArecipient();

    person2.setAll(
        "Chapeton-Lamas",
        "Nery",
        "12-4-789",
        "Guatemala",
        2451564,
        3956753,
        3956840,
        'M'
    );

    // ===== OUTPUT =====
    System.out.println("Person 1");
    System.out.println("-----------------------------");
    System.out.println("Surname: " + person1.getSurname());
    System.out.println("Given name: " + person1.getGivenName());
    System.out.println("USCIS Number: " + person1.getUscisNumber());
    System.out.println("Country of Origin: " + person1.getCountryOfOrigin());
    System.out.println("Birthday (JDN): " + person1.getBirthday());
    System.out.println("Valid From Date (JDN): " + person1.getValidFromDate());
    System.out.println("Expiration Date (JDN): " + person1.getExpirationDate());
    System.out.println("Sex: " + person1.getSex());

    System.out.println("\nPerson 2");
    System.out.println("-----------------------------");
    System.out.println("Surname: " + person2.getSurname());
    System.out.println("Given name: " + person2.getGivenName());
    System.out.println("USCIS Number: " + person2.getUscisNumber());
    System.out.println("Country of Origin: " + person2.getCountryOfOrigin());
    System.out.println("Birthday (JDN): " + person2.getBirthday());
    System.out.println("Valid From Date (JDN): " + person2.getValidFromDate());
    System.out.println("Expiration Date (JDN): " + person2.getExpirationDate());
    System.out.println("Sex: " + person2.getSex());
  }
}