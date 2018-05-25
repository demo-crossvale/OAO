package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Requestor")
public class Requestor implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("ssn")
   private java.lang.String ssn;
   @org.kie.api.definition.type.Label("vipFlag")
   private java.lang.String vipFlag;
   @org.kie.api.definition.type.Label("firstName")
   private java.lang.String firstName;
   @org.kie.api.definition.type.Label("lastName")
   private java.lang.String lastName;
   @org.kie.api.definition.type.Label("business")
   private java.lang.String business;
   @org.kie.api.definition.type.Label("customerNumber")
   private java.lang.String customerNumber;
   @org.kie.api.definition.type.Label("sourceApp")
   private java.lang.String sourceApp;
   @org.kie.api.definition.type.Label("type")
   private com.crossvale.oao.CodeValue type;

   public Requestor()
   {
   }

   public java.lang.String getSsn()
   {
      return this.ssn;
   }

   public void setSsn(java.lang.String ssn)
   {
      this.ssn = ssn;
   }

   public java.lang.String getVipFlag()
   {
      return this.vipFlag;
   }

   public void setVipFlag(java.lang.String vipFlag)
   {
      this.vipFlag = vipFlag;
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.lang.String getBusiness()
   {
      return this.business;
   }

   public void setBusiness(java.lang.String business)
   {
      this.business = business;
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public java.lang.String getSourceApp()
   {
      return this.sourceApp;
   }

   public void setSourceApp(java.lang.String sourceApp)
   {
      this.sourceApp = sourceApp;
   }

   public com.crossvale.oao.CodeValue getType()
   {
      return this.type;
   }

   public void setType(com.crossvale.oao.CodeValue type)
   {
      this.type = type;
   }

   public Requestor(java.lang.String ssn, java.lang.String vipFlag,
         java.lang.String firstName, java.lang.String lastName,
         java.lang.String business, java.lang.String customerNumber,
         java.lang.String sourceApp, com.crossvale.oao.CodeValue type)
   {
      this.ssn = ssn;
      this.vipFlag = vipFlag;
      this.firstName = firstName;
      this.lastName = lastName;
      this.business = business;
      this.customerNumber = customerNumber;
      this.sourceApp = sourceApp;
      this.type = type;
   }

}