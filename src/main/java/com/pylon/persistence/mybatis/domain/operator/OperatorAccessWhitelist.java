package com.pylon.persistence.mybatis.domain.operator;

/**
 * Created by simon on 4/22/15.
 */
public class OperatorAccessWhitelist {
    private long id;
    private long operatorId;
    private String addressPattern;
    private String addressLabel;
    private byte isEnabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }

    public String getAddressPattern() {
        return addressPattern;
    }

    public void setAddressPattern(String addressPattern) {
        this.addressPattern = addressPattern;
    }

    public String getAddressLabel() {
        return addressLabel;
    }

    public void setAddressLabel(String addressLabel) {
        this.addressLabel = addressLabel;
    }

    public byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperatorAccessWhitelist that = (OperatorAccessWhitelist) o;

        if (id != that.id) return false;
        if (operatorId != that.operatorId) return false;
        if (isEnabled != that.isEnabled) return false;
        if (addressPattern != null ? !addressPattern.equals(that.addressPattern) : that.addressPattern != null)
            return false;
        if (addressLabel != null ? !addressLabel.equals(that.addressLabel) : that.addressLabel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (operatorId ^ (operatorId >>> 32));
        result = 31 * result + (addressPattern != null ? addressPattern.hashCode() : 0);
        result = 31 * result + (addressLabel != null ? addressLabel.hashCode() : 0);
        result = 31 * result + (int) isEnabled;
        return result;
    }
}
