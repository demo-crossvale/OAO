package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Audit implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "userCreation")
   private java.lang.String userCreation;
   @org.kie.api.definition.type.Label(value = "timeCreation")
   private java.util.Date timeCreation;
   @org.kie.api.definition.type.Label(value = "timeModification")
   private java.util.Date timeModification;

   public Audit()
   {
   }

   public java.lang.String getUserCreation()
   {
      return this.userCreation;
   }

   public void setUserCreation(java.lang.String userCreation)
   {
      this.userCreation = userCreation;
   }

   public java.util.Date getTimeCreation()
   {
      return this.timeCreation;
   }

   public void setTimeCreation(java.util.Date timeCreation)
   {
      this.timeCreation = timeCreation;
   }

   public java.util.Date getTimeModification()
   {
      return this.timeModification;
   }

   public void setTimeModification(java.util.Date timeModification)
   {
      this.timeModification = timeModification;
   }

   public Audit(java.lang.String userCreation, java.util.Date timeCreation,
         java.util.Date timeModification)
   {
      this.userCreation = userCreation;
      this.timeCreation = timeCreation;
      this.timeModification = timeModification;
   }

}