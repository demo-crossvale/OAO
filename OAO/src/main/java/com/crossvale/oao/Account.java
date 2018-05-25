package com.crossvale.oao;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class Account implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Account Number")
   private java.lang.String accountNumber;

   @org.kie.api.definition.type.Label("Customer Number")
   private java.lang.String customerNumber;

   @org.kie.api.definition.type.Label("Account Name")
   private java.lang.String accountName;

   @org.kie.api.definition.type.Label("Account Type")
   private java.lang.String accountType;

   @org.kie.api.definition.type.Label("Amount Available")
   private Double available;

   @org.kie.api.definition.type.Label("Posted")
   private boolean posted;

   @org.kie.api.definition.type.Label("Status")
   private java.lang.String status;

   public Account()
   {
   }

   public java.lang.String getAccountNumber()
   {
      return this.accountNumber;
   }

   public void setAccountNumber(java.lang.String accountNumber)
   {
      this.accountNumber = accountNumber;
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public java.lang.String getAccountName()
   {
      return this.accountName;
   }

   public void setAccountName(java.lang.String accountName)
   {
      this.accountName = accountName;
   }

   public java.lang.String getAccountType()
   {
      return this.accountType;
   }

   public void setAccountType(java.lang.String accountType)
   {
      this.accountType = accountType;
   }

   public boolean isPosted()
   {
      return this.posted;
   }

   public void setPosted(boolean posted)
   {
      this.posted = posted;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.Double getAvailable()
   {
      return this.available;
   }

   public void setAvailable(java.lang.Double available)
   {
      this.available = available;
   }

   public Account(java.lang.String accountNumber, java.lang.String customerNumber,
         java.lang.String accountName, java.lang.String accountType,
         java.lang.Double available, boolean posted, java.lang.String status)
   {
      this.accountNumber = accountNumber;
      this.customerNumber = customerNumber;
      this.accountName = accountName;
      this.accountType = accountType;
      this.available = available;
      this.posted = posted;
      this.status = status;
   }

}