/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectozone;

/**
 *
 * @author Ray
 */
public class Applicant {

    /**
     * @return the fieldAns
     */
    public String getFieldAns() {
        return fieldAns;
    }

    /**
     * @param fieldAns the fieldAns to set
     */
    public void setFieldAns(String fieldAns) {
        this.fieldAns = fieldAns;
    }

    /**
     * @return the felonyAns
     */
    public String getFelonyAns() {
        return felonyAns;
    }

    /**
     * @param felonyAns the felonyAns to set
     */
    public void setFelonyAns(String felonyAns) {
        this.felonyAns = felonyAns;
    }

    /**
     * @return the drugAns
     */
    public String getDrugAns() {
        return drugAns;
    }

    /**
     * @param drugAns the drugAns to set
     */
    public void setDrugAns(String drugAns) {
        this.drugAns = drugAns;
    }

    public Applicant(String fname, String lname, String address, String city, String state, String zipCode, String phone, 
            String mobile, String email, String fieldAns, String felonyAns, String drugAns, String position, String startDate, 
            String pay, String school, String location, String years, String degree, String major, String refName, 
            String title, String company, String refPhone) {
        
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.fieldAns = fieldAns;
        this.felonyAns = felonyAns;
        this.drugAns = drugAns;
        this.position = position;
        this.startDate = startDate;
        this.pay = pay;
        this.school = school;
        this.location = location;
        this.years = years;
        this.degree = degree;
        this.major = major;
        this.refName = refName;
        this.title = title;
        this.company = company;
        this.refPhone = refPhone;
    }

    private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String mobile;
    private String email;
    //Buttons on Part 1
    private String fieldAns;
    private String felonyAns;
    private String drugAns;
    // Split1
    private String position;
    private String startDate;
    private String pay;
    // Split2
    private String school;        
    private String location;        
    private String years;        
    private String degree;        
    private String major;  
    //Split 3
    private String refName;
    private String title;
    private String company;
    private String refPhone;
    
    // Constructor
   

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the pay
     */
    public String getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(String pay) {
        this.pay = pay;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the years
     */
    public String getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(String years) {
        this.years = years;
    }

    /**
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the refName
     */
    public String getRefName() {
        return refName;
    }

    /**
     * @param refName the refName to set
     */
    public void setRefName(String refName) {
        this.refName = refName;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the refPhone
     */
    public String getRefPhone() {
        return refPhone;
    }

    /**
     * @param refPhone the refPhone to set
     */
    public void setRefPhone(String refPhone) {
        this.refPhone = refPhone;
    }
   
 
}
