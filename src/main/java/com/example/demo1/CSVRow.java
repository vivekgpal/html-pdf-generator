 package com.example.demo1;
 public class CSVRow {
     String fund;
     String acno;
     String funddesc;
     String cycledate;
     String startdate;
     String enddt;
     String amount;
     String transactionype;
     String targetscheme_stp;
     String frequency;
     String sip_status;
     public CSVRow(String fund, String acno, String funddesc, String cycledate, String startdate, String enddt,
             String amount, String transactionype, String targetscheme_stp, String frequency, String sip_status) {
         this.fund = fund;
         this.acno = acno;
         this.funddesc = funddesc;
         this.cycledate = cycledate;
         this.startdate = startdate;
         this.enddt = enddt;
         this.amount = amount;
         this.transactionype = transactionype;
         this.targetscheme_stp = targetscheme_stp;
         this.frequency = frequency;
         this.sip_status = sip_status;
     }
     public String getFund() {
         return fund;
     }
     public void setFund(String fund) {
         this.fund = fund;
     }
     public String getAcno() {
         return acno;
     }
     public void setAcno(String acno) {
         this.acno = acno;
     }
     public String getFunddesc() {
         return funddesc;
     }
     public void setFunddesc(String funddesc) {
         this.funddesc = funddesc;
     }
     public String getCycledate() {
         return cycledate;
     }
     public void setCycledate(String cycledate) {
         this.cycledate = cycledate;
     }
     public String getStartdate() {
         return startdate;
     }
     public void setStartdate(String startdate) {
         this.startdate = startdate;
     }
     public String getEnddt() {
         return enddt;
     }
     public void setEnddt(String enddt) {
         this.enddt = enddt;
     }
     public String getAmount() {
         return amount;
     }
     public void setAmount(String amount) {
         this.amount = amount;
     }
     public String getTransactionype() {
         return transactionype;
     }
     public void setTransactionype(String transactionype) {
         this.transactionype = transactionype;
     }
     public String getTargetscheme_stp() {
         return targetscheme_stp;
     }
     public void setTargetscheme_stp(String targetscheme_stp) {
         this.targetscheme_stp = targetscheme_stp;
     }
     public String getFrequency() {
         return frequency;
     }
     public void setFrequency(String frequency) {
         this.frequency = frequency;
     }
     public String getSip_status() {
         return sip_status;
     }
     public void setSip_status(String sip_status) {
         this.sip_status = sip_status;
     }

    /* @Override
     public String toString() {
         return "CSVRow{" +
                 "fund='" + fund + '\'' +
                 ", acno='" + acno + '\'' +
                 ", funddesc='" + funddesc + '\'' +
                 ", cycledate='" + cycledate + '\'' +
                 ", startdate='" + startdate + '\'' +
                 ", enddt='" + enddt + '\'' +
                 ", amount='" + amount + '\'' +
                 ", transactionype='" + transactionype + '\'' +
                 ", targetscheme_stp='" + targetscheme_stp + '\'' +
                 ", frequency='" + frequency + '\'' +
                 ", sip_status='" + sip_status + '\'' +
                 '}';
     }*/
 }