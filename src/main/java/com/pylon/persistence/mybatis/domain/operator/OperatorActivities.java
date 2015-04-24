package com.pylon.persistence.mybatis.domain.operator;

import java.sql.Timestamp;

/**
 * Created by simon on 4/22/15.
 */
public class OperatorActivities {
    private long id;
    private String lastLoginRegion;
    private String lastLoginIp;
    private Timestamp lastLoginDate;
    private OperatorAccessWhitelist operatorAccessWhitelistByLastLoginWhitelistId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastLoginRegion() {
        return lastLoginRegion;
    }

    public void setLastLoginRegion(String lastLoginRegion) {
        this.lastLoginRegion = lastLoginRegion;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperatorActivities that = (OperatorActivities) o;

        if (id != that.id) return false;
        if (lastLoginRegion != null ? !lastLoginRegion.equals(that.lastLoginRegion) : that.lastLoginRegion != null)
            return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(that.lastLoginIp) : that.lastLoginIp != null) return false;
        if (lastLoginDate != null ? !lastLoginDate.equals(that.lastLoginDate) : that.lastLoginDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (lastLoginRegion != null ? lastLoginRegion.hashCode() : 0);
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + (lastLoginDate != null ? lastLoginDate.hashCode() : 0);
        return result;
    }

    public OperatorAccessWhitelist getOperatorAccessWhitelistByLastLoginWhitelistId() {
        return operatorAccessWhitelistByLastLoginWhitelistId;
    }

    public void setOperatorAccessWhitelistByLastLoginWhitelistId(OperatorAccessWhitelist operatorAccessWhitelistByLastLoginWhitelistId) {
        this.operatorAccessWhitelistByLastLoginWhitelistId = operatorAccessWhitelistByLastLoginWhitelistId;
    }
}
