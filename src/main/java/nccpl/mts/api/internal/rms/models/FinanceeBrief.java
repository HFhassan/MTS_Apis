package nccpl.mts.api.internal.rms.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class FinanceeBrief implements Serializable {

    private String cmId;
    private String cmName;
    private String symbol;
    private String uin;
    private int exposure;
    private int exposureDemand;
    private int concentrationMargin;
    private int additionalMargin;

    public FinanceeBrief()
    {}
    public FinanceeBrief(String cmId,
                         String cmName,
                         String symbol,
                         String uin,
                         int exposure,
                         int exposureDemand,
                         int concentrationMargin,
                         int additionalMargin
                         )
    {
        this.cmId = cmId;
        this.symbol = symbol;
        this.cmName = cmName;
        this.concentrationMargin = concentrationMargin;
        this.additionalMargin = additionalMargin;
        this.exposure = exposure;
        this.exposureDemand = exposureDemand;
        this.uin = uin;
    }

    public int getAdditionalMargin() {
        return additionalMargin;
    }

    public void setAdditionalMargin(int additionalMargin) {
        this.additionalMargin = additionalMargin;
    }

    public String getCmId() {
        return cmId;
    }

    public void setCmId(String cmId) {
        this.cmId = cmId;
    }

    public int getConcentrationMargin() {
        return concentrationMargin;
    }

    public void setConcentrationMargin(int concentrationMargin) {
        this.concentrationMargin = concentrationMargin;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getExposure() {
        return exposure;
    }

    public void setExposure(int exposure) {
        this.exposure = exposure;
    }

    public int getExposureDemand() {
        return exposureDemand;
    }

    public void setExposureDemand(int exposureDemand) {
        this.exposureDemand = exposureDemand;
    }

    public String getCmName() {
        return cmName;
    }

    public void setCmName(String cmName) {
        this.cmName = cmName;
    }

    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin;
    }
    @Override
    public String toString ()
    {
        return "FinanceeBrief{" +
                "cmId =" + cmId+
                ",cmName = '" + cmName+'\''+
                ",symbol = '" + symbol+ '\''+
                ",uin = '" + uin+ '\''+
                ",exposure = '" + exposure+ '\''+
                ",exposureDemand = '" + exposureDemand+'\''+
                ",additionalMargin = '" + additionalMargin+'\''+
                ",concentrationMargin = '" + concentrationMargin+'\''+
                '}';
    }


}
