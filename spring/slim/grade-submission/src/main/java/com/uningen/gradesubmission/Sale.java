package com.uningen.gradesubmission;

import java.math.BigDecimal;

public class Sale {
  private String itemName;
  private BigDecimal revenue;
  private BigDecimal cost;
  private BigDecimal profit;

  public Sale() {
  }

  public Sale(String itemName, BigDecimal revenue, BigDecimal cost) {
    this.itemName = itemName;
    this.revenue = revenue;
    this.cost = cost;
    this.profit = revenue.subtract(cost);
  }

  public String getItemName() {
    return this.itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public BigDecimal getRevenue() {
    return this.revenue;
  }

  public void setRevenue(BigDecimal revenue) {
    this.revenue = revenue;
  }

  public BigDecimal getCost() {
    return this.cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public BigDecimal getProfit() {
    return this.profit;
  }

}
