package cn.ulegal.seed.entity;

import javax.persistence.*;

@Table(name = "case_litigants")
public class CaseLitigants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 当事人姓名或名称
     */
    private String name;

    /**
     * 当事人类型 （1-自然人  2- 法人组织 3-非法人组织）
     */
    private Integer type;

    /**
     * 身份证号码
     */
    @Column(name = "identity_id")
    private String identityId;

    /**
     * 证件类型（1-居民身份证 3-社会统一信用代码 ）
     */
    @Column(name = "identity_type")
    private Integer identityType;

    /**
     * 诉讼地位
     */
    @Column(name = "position_name")
    private String positionName;

    /**
     * 诉讼地位（1-原告 2-被告 3-第三人 4-上诉人 5-被上诉人 6-申请人 7-被申请人 8-被执行人）
     */
    private Integer position;

    /**
     * 对应顺序(当代理人sequence等于代理人sequence时，说明关系对应，否则无关)
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
     * 联系方式
     */
    @Column(name = "phone_id")
    private String phoneId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private String updateTime;

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
     * 获取当事人姓名或名称
     *
     * @return name - 当事人姓名或名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置当事人姓名或名称
     *
     * @param name 当事人姓名或名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取当事人类型 （1-自然人  2- 法人组织 3-非法人组织）
     *
     * @return type - 当事人类型 （1-自然人  2- 法人组织 3-非法人组织）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置当事人类型 （1-自然人  2- 法人组织 3-非法人组织）
     *
     * @param type 当事人类型 （1-自然人  2- 法人组织 3-非法人组织）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取身份证号码
     *
     * @return identity_id - 身份证号码
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * 设置身份证号码
     *
     * @param identityId 身份证号码
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * 获取证件类型（1-居民身份证 3-社会统一信用代码 ）
     *
     * @return identity_type - 证件类型（1-居民身份证 3-社会统一信用代码 ）
     */
    public Integer getIdentityType() {
        return identityType;
    }

    /**
     * 设置证件类型（1-居民身份证 3-社会统一信用代码 ）
     *
     * @param identityType 证件类型（1-居民身份证 3-社会统一信用代码 ）
     */
    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    /**
     * 获取诉讼地位
     *
     * @return position_name - 诉讼地位
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * 设置诉讼地位
     *
     * @param positionName 诉讼地位
     */
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    /**
     * 获取诉讼地位（1-原告 2-被告 3-第三人 4-上诉人 5-被上诉人 6-申请人 7-被申请人 8-被执行人）
     *
     * @return position - 诉讼地位（1-原告 2-被告 3-第三人 4-上诉人 5-被上诉人 6-申请人 7-被申请人 8-被执行人）
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置诉讼地位（1-原告 2-被告 3-第三人 4-上诉人 5-被上诉人 6-申请人 7-被申请人 8-被执行人）
     *
     * @param position 诉讼地位（1-原告 2-被告 3-第三人 4-上诉人 5-被上诉人 6-申请人 7-被申请人 8-被执行人）
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 获取对应顺序(当代理人sequence等于代理人sequence时，说明关系对应，否则无关)
     *
     * @return sequence - 对应顺序(当代理人sequence等于代理人sequence时，说明关系对应，否则无关)
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * 设置对应顺序(当代理人sequence等于代理人sequence时，说明关系对应，否则无关)
     *
     * @param sequence 对应顺序(当代理人sequence等于代理人sequence时，说明关系对应，否则无关)
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
     * 获取联系方式
     *
     * @return phone_id - 联系方式
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * 设置联系方式
     *
     * @param phoneId 联系方式
     */
    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
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
        sb.append(", positionName=").append(positionName);
        sb.append(", position=").append(position);
        sb.append(", sequence=").append(sequence);
        sb.append(", caseId=").append(caseId);
        sb.append(", source=").append(source);
        sb.append(", address=").append(address);
        sb.append(", phoneId=").append(phoneId);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}