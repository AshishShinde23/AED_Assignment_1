/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author asus
 */
public class personProfile {
    
    private String Name;
    private String geographicData; //Address
    private Date DOB;
    private Long telephoneNumber;
    private Long faxNumber;
    private String emailID;
    private Long ssnNumber;
    private Long medicalRecordNumber;
    private Long healthPlanBeneficiaryNumber;
    private Long bankAccountNumber;
    private String liscenceNumber;
    private String vechicalIdentifierNumber;
    private String deviceSerialNumber;
    private String LinkedIn;
    private String ipAddress;
    private Long uniqueIdentifierNumber;
    // biometric scan image
    //private String biometricScanFileName = null;
    private ImageIcon biometricScan_Image;
    // person photo image
   // private String photoImageFileName = null;
    private ImageIcon photo_Image;
    
    
    // getter and setter methods
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public String getDOB() {
        return DOB.toString();
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(Long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    public Long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(Long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public Long getSsnNumber() {
        return ssnNumber;
    }

    public void setSsnNumber(Long ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public Long getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(Long medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public Long getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(Long healthPlanBeneficiaryNumber) {
        this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
    }

    public Long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(Long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getLiscenceNumber() {
        return liscenceNumber;
    }

    public void setLiscenceNumber(String liscenceNumber) {
        this.liscenceNumber = liscenceNumber;
    }

    public String getVechicalIdentifierNumber() {
        return vechicalIdentifierNumber;
    }

    public void setVechicalIdentifierNumber(String vechicalIdentifierNumber) {
        this.vechicalIdentifierNumber = vechicalIdentifierNumber;
    }

    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getUniqueIdentifierNumber() {
        return uniqueIdentifierNumber;
    }

    public void setUniqueIdentifierNumber(Long uniqueIdentifierNumber) {
        this.uniqueIdentifierNumber = uniqueIdentifierNumber;
    }

    //public String getBiometricScanFileName() {
      //  return biometricScanFileName;
    //}

    //public void setBiometricScanFileName(String biometricScanFileName) {
    //    this.biometricScanFileName = biometricScanFileName;
    //}

    public ImageIcon getBiometricScan_Image() {
        return biometricScan_Image;
    }

    public void setBiometricScan_Image(ImageIcon biometricScan_Image) {
        this.biometricScan_Image = biometricScan_Image;
    }

  //  public String getPhotoImageFileName() {
    //    return photoImageFileName;
   // }

   // public void setPhotoImageFileName(String photoImageFileName) {
    //    this.photoImageFileName = photoImageFileName;
   // }

    public ImageIcon getPhoto_Image() {
        return photo_Image;
    }

    public void setPhoto_Image(ImageIcon photo_Image) {
        this.photo_Image = photo_Image;
    }
    
}
