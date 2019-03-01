package cn.ulegal.seed.entity;

import javax.persistence.*;

@Table(name = "case_relations")
public class CaseRelations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 第三人名字
     */
    private String name;

    /**
     * 第三人身份证号
     */
    @Column(name = "identity_id")
    private String identityId;

    @Column(name = "case_id")
    private Integer caseId;

    /**
     * 1：证人 2：鉴定人
     */
    private Integer type;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取第三人名字
     *
     * @return name - 第三人名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置第三人名字
     *
     * @param name 第三人名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取第三人身份证号
     *
     * @return identity_id - 第三人身份证号
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * 设置第三人身份证号
     *
     * @param identityId 第三人身份证号
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * @return case_id
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * @param caseId
     */
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    /**
     * 获取1：证人 2：鉴定人
     *
     * @return type - 1：证人 2：鉴定人
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1：证人 2：鉴定人
     *
     * @param type 1：证人 2：鉴定人
     */
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", identityId=").append(identityId);
        sb.append(", caseId=").append(caseId);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}