package cn.ulegal.seed.entity;

import javax.persistence.*;

@Table(name = "case_judges")
public class JudgesBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 审判人员姓名
     */
    private String name;

    /**
     * 审判人员类别
1 -- 审判长，
2 -- 审判员，
3 -- 书记员，
4 -- 陪审员，
5 -- 执行员，
6 -- 院长，
7 -- 审委会委员，
8 -- 翻译人员，
9 -- 鉴定人员，
10 -- 勘验人员；
256--调解员
     */
    private Integer type;

    /**
     * 审判人员身份证号
     */
    @Column(name = "identity_id")
    private String identityId;

    /**
     * 对应案件的id
     */
    @Column(name = "case_id")
    private Integer caseId;

    /**
     * 添加来源 1：数据中心导入数据 2：移动端导入数据
     */
    private Integer source;

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
     * 获取审判人员姓名
     *
     * @return name - 审判人员姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置审判人员姓名
     *
     * @param name 审判人员姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取审判人员类别
1 -- 审判长，
2 -- 审判员，
3 -- 书记员，
4 -- 陪审员，
5 -- 执行员，
6 -- 院长，
7 -- 审委会委员，
8 -- 翻译人员，
9 -- 鉴定人员，
10 -- 勘验人员；
256--调解员
     *
     * @return type - 审判人员类别
1 -- 审判长，
2 -- 审判员，
3 -- 书记员，
4 -- 陪审员，
5 -- 执行员，
6 -- 院长，
7 -- 审委会委员，
8 -- 翻译人员，
9 -- 鉴定人员，
10 -- 勘验人员；
256--调解员
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置审判人员类别
1 -- 审判长，
2 -- 审判员，
3 -- 书记员，
4 -- 陪审员，
5 -- 执行员，
6 -- 院长，
7 -- 审委会委员，
8 -- 翻译人员，
9 -- 鉴定人员，
10 -- 勘验人员；
256--调解员
     *
     * @param type 审判人员类别
1 -- 审判长，
2 -- 审判员，
3 -- 书记员，
4 -- 陪审员，
5 -- 执行员，
6 -- 院长，
7 -- 审委会委员，
8 -- 翻译人员，
9 -- 鉴定人员，
10 -- 勘验人员；
256--调解员
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取审判人员身份证号
     *
     * @return identity_id - 审判人员身份证号
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * 设置审判人员身份证号
     *
     * @param identityId 审判人员身份证号
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * 获取对应案件的id
     *
     * @return case_id - 对应案件的id
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * 设置对应案件的id
     *
     * @param caseId 对应案件的id
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
        sb.append(", caseId=").append(caseId);
        sb.append(", source=").append(source);
        sb.append("]");
        return sb.toString();
    }
}