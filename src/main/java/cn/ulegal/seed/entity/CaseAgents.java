package cn.ulegal.seed.entity;

import javax.persistence.*;

@Table(name = "case_agents")
public class CaseAgents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 代理人名称
     */
    private String name;

    /**
     * 代理人类型（1--律师 2--监护人 3--亲友 4--其他法律工作者 5--当事人所在社区、单位及团体的公民 6--法定代表人/主要负责人  255--诉讼代理人
     */
    private Integer type;

    /**
     * 代理人证件号码
     */
    @Column(name = "identity_id")
    private String identityId;

    /**
     * 证件类型（1-居民身份证  2-律师证 ）
     */
    @Column(name = "identity_type")
    private Integer identityType;

    /**
     * 对应顺序(当事人sequence等于代理人sequence时，说明关系对应，否则无关)
     */
    private String sequence;

    /**
     * 关联案件表的id
     */
    @Column(name = "case_id")
    private Integer caseId;

    /**
     * 添加来源 1：数据中心导入数据 2：移动端导入数据
     */
    private Integer source;

    /**
     * 送达地址
     */
    private String address;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private String updateTime;

    @Column(name = "phone_id")
    private String phoneId;

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
     * 获取代理人名称
     *
     * @return name - 代理人名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置代理人名称
     *
     * @param name 代理人名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取代理人类型（1--律师 2--监护人 3--亲友 4--其他法律工作者 5--当事人所在社区、单位及团体的公民 6--法定代表人/主要负责人  255--诉讼代理人
     *
     * @return type - 代理人类型（1--律师 2--监护人 3--亲友 4--其他法律工作者 5--当事人所在社区、单位及团体的公民 6--法定代表人/主要负责人  255--诉讼代理人
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置代理人类型（1--律师 2--监护人 3--亲友 4--其他法律工作者 5--当事人所在社区、单位及团体的公民 6--法定代表人/主要负责人  255--诉讼代理人
     *
     * @param type 代理人类型（1--律师 2--监护人 3--亲友 4--其他法律工作者 5--当事人所在社区、单位及团体的公民 6--法定代表人/主要负责人  255--诉讼代理人
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取代理人证件号码
     *
     * @return identity_id - 代理人证件号码
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * 设置代理人证件号码
     *
     * @param identityId 代理人证件号码
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * 获取证件类型（1-居民身份证  2-律师证 ）
     *
     * @return identity_type - 证件类型（1-居民身份证  2-律师证 ）
     */
    public Integer getIdentityType() {
        return identityType;
    }

    /**
     * 设置证件类型（1-居民身份证  2-律师证 ）
     *
     * @param identityType 证件类型（1-居民身份证  2-律师证 ）
     */
    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    /**
     * 获取对应顺序(当事人sequence等于代理人sequence时，说明关系对应，否则无关)
     *
     * @return sequence - 对应顺序(当事人sequence等于代理人sequence时，说明关系对应，否则无关)
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * 设置对应顺序(当事人sequence等于代理人sequence时，说明关系对应，否则无关)
     *
     * @param sequence 对应顺序(当事人sequence等于代理人sequence时，说明关系对应，否则无关)
     */
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取关联案件表的id
     *
     * @return case_id - 关联案件表的id
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * 设置关联案件表的id
     *
     * @param caseId 关联案件表的id
     */
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    /**
     * 获取添加来源 1：数据中心导入数据 2：移动端导入数据
     *
     * @return source - 添加来源 1：数据中心导入数据 2：移动端导入数据
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置添加来源 1：数据中心导入数据 2：移动端导入数据
     *
     * @param source 添加来源 1：数据中心导入数据 2：移动端导入数据
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取送达地址
     *
     * @return address - 送达地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置送达地址
     *
     * @param address 送达地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return phone_id
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * @param phoneId
     */
    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", identityId=").append(identityId);
        sb.append(", identityType=").append(identityType);
        sb.append(", sequence=").append(sequence);
        sb.append(", caseId=").append(caseId);
        sb.append(", source=").append(source);
        sb.append(", address=").append(address);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", phoneId=").append(phoneId);
        sb.append("]");
        return sb.toString();
    }
}