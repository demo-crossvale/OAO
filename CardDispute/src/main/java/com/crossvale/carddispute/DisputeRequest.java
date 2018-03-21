package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DisputeRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Fraud")
   private java.lang.String fraud;

   @org.kie.api.definition.type.Label("Amount")
   private java.lang.Double amount;

   @org.kie.api.definition.type.Label(value = "chargeback")
   private java.lang.String chargeback;

   public DisputeRequest()
   {
   }

   public java.lang.String getFraud()
   {
      return this.fraud;
   }

   public void setFraud(java.lang.String fraud)
   {
      this.fraud = fraud;
   }

   public java.lang.Double getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Double amount)
   {
      this.amount = amount;
   }

   public java.lang.String getChargeback()
   {
      return this.chargeback;
   }

   public void setChargeback(java.lang.String chargeback)
   {
      this.chargeback = chargeback;
   }

   public DisputeRequest(java.lang.String fraud, java.lang.Double amount,
         java.lang.String chargeback)
   {
      this.fraud = fraud;
      this.amount = amount;
      this.chargeback = chargeback;
   }

}