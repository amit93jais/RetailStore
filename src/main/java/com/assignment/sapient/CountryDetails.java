package com.assignment.sapient;
public class CountryDetails
{
    String city;
    String country;
    String gender;
    String currency;
    long amout;

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return "CountryDetails [city=" + city + ", country=" + country + ", gender=" + gender + ", currency=" + currency
                + ", amout=" + amout + "]";
    }

    public CountryDetails(String city, String country, String gender, String currency, long amout)
    {
        super();
        this.city = city;
        this.country = country;
        this.gender = gender;
        this.currency = currency;
        this.amout = amout;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public long getAmout()
    {
        return amout;
    }

    public void setAmout(long amout)
    {
        this.amout = amout;
    }
}
