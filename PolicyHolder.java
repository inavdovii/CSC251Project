public class PolicyHolder {
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private boolean policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;
    private double bmi;
    
    public PolicyHolder(String policyholderFirstName, String policyholderLastName, int policyholderAge, boolean policyholderSmokingStatus, double policyholderHeight, double policyholderWeight) {
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
        this.bmi = calculateBMI(policyholderHeight, policyholderWeight);
    }
    
    public String getFirstName() {
        return policyholderFirstName;
    }
    
    public String getLastName() {
        return policyholderLastName;
    }
    
    public int getAge() {
        return policyholderAge;
    }
    
    public boolean policyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }
    
    public double getHeight() {
        return policyholderHeight;
    }
    
    public double getWeight() {
        return policyholderWeight;
    }
    
    public double getBMI() {
        return bmi;
    }
    
    private double calculateBMI(double policyholderHeight, double policyholderWeight) {
        return (policyholderWeight / (policyholderHeight * policyholderHeight)) * 703;
    }
    
    public String toString() {
        return "Policyholder's First Name: " + policyholderFirstName + "\n" +
               "Policyholder's Last Name: " + policyholderLastName + "\n" +
               "Policyholder's Age: " + policyholderAge + "\n" +
               "Policyholder's Smoking Status (Y/N): " + (policyholderSmokingStatus ? "smoker" : "non-smoker") + "\n" +
               "Policyholder's Height: " + policyholderHeight + " inches\n" +
               "Policyholder's Weight: " + policyholderWeight + " pounds\n" +
               "Policyholder's BMI: " + bmi + "\n";
    }
}