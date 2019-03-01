package cn.ulegal.seed.entity;

import javax.persistence.*;

@Table(name = "dic_administrative_act")
public class DicAdministrativeAct {
    /**
     * 代码
     */
    @Id
    private String dm;

    /**
     * 内容
     */
    @Column(name = "mc_nr")
    private String mcNr;

    /**
     * 说明
     */
    private String sm;

    /**
     * 获取代码
     *
     * @return dm - 代码
     */
    public String getDm() {
        return dm;
    }

    /**
     * 设置代码
     *
     * @param dm 代码
     */
    public void setDm(String dm) {
        this.dm = dm;
    }

    /**
     * 获取内容
     *
     * @return mc_nr - 内容
     */
    public String getMcNr() {
        return mcNr;
    }

    /**
     * 设置内容
     *
     * @param mcNr 内容
     */
    public void setMcNr(String mcNr) {
        this.mcNr = mcNr;
    }

    /**
     * 获取说明
     *
     * @return sm - 说明
     */
    public String getSm() {
        return sm;
    }

    /**
     * 设置说明
     *
     * @param sm 说明
     */
    public void setSm(String sm) {
        this.sm = sm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dm=").append(dm);
        sb.append(", mcNr=").append(mcNr);
        sb.append(", sm=").append(sm);
        sb.append("]");
        return sb.toString();
    }
}