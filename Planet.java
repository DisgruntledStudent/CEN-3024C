public class Planet {
    private String designation; //name, but fancy
    private int[] address; //stargate addresses are represented ad a series of numbers that represent to a series of glyphs on the gate
    private String owner; //who controls the planet

    public Planet(String designation, int[] address, String owner) {
        this.designation = designation;
        this.address = address;
        this.owner = owner;
    }

    //getters and setters
    public String getDesignation() {
        return designation;
    }
    public int[] getAddress() {
        return address;
    }
    public String getOwner() {
        return owner;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setAddress(int[] address) {
        this.address = address;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String add = "";
        for (int i = 0; i < address.length; i++) {
            add += String.valueOf(address[i]);
            if (i < address.length - 1) {add += ", ";}
        }
        return "designation= " + designation + ", address= " + add + ", owner= " + owner;
    }

}
