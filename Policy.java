public class Policy {
  private String policyNumber;
  private String providerName;
  private String policyholderFirstName;
  private String policyholderLastName;
  private int policyholderAge;
  private String policyholderSmokingStatus;
  private double policyholderHeight;
  private double policyholderWeight;

  public Policy() {
    policyNumber = "";
    providerName = "";
    policyholderFirstName = "";
    policyholderLastName = "";
    policyholderAge = 0;
    policyholderSmokingStatus = "";
    policyholderHeight = 0;
    policyholderWeight = 0;
  }

  public Policy(String policyNumber, String providerName, String policyholderFirstName, String policyholderLastName,
                int policyholderAge, String policyholderSmokingStatus, double policyholderHeight, double policyholderWeight) {
    this.policyNumber = policyNumber;
    this.providerName = providerName;
    this.policyholderFirstName = policyholderFirstName;
    this.policyholderLastName = policyholderLastName;
    this.policyholderAge = policyholderAge;
    this.policyholderSmokingStatus = policyholderSmokingStatus;
    this.policyholderHeight = policyholderHeight;
    this.policyholderWeight = policyholderWeight;
  }

  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public String getPolicyholderFirstName() {
    return policyholderFirstName;
  }

  public void setPolicyholderFirstName(String policyholderFirstName) {
    this.policyholderFirstName = policyholderFirstName;
  }

  public String getPolicyholderLastName() {
    return policyholderLastName;
  }

  public void setPolicyholderLastName(String policyholderLastName) {
    this.policyholderLastName = policyholderLastName;
  }

  public int getPolicyholderAge() {
    return policyholderAge;
  }

  public void setPolicyholderAge(int policyholderAge) {
    this.policyholderAge = policyholderAge;
  }

  public String getPolicyholderSmokingStatus() {
    return policyholderSmokingStatus;
  }

  public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
    this.policyholderSmokingStatus = policyholderSmokingStatus;
  }

  public double getPolicyholderHeight() {
    return policyholderHeight;
  }

  public void setPolicyholderHeight(double policyholderHeight) {
    this.policyholderHeight = policyholderHeight;
  }

  public double getPolicyholderWeight() {
    return policyholderWeight;
  }

  public void setPolicyholderWeight(double policyholderWeight) {
    this.policyholderWeight = policyholderWeight;
  }

  public double calculateBMI() {
    return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
}

  public double calculatePrice() {
  double price = 600;
  if (policyholderAge > 50) {
    price += 75;
  }
  if (policyholderSmokingStatus.equals("smoker")) {
    price += 100;
  }
  double bmi = calculateBMI();
  if (bmi > 35) {
    price += (bmi - 35) * 20;
  }
  return price;
}
}