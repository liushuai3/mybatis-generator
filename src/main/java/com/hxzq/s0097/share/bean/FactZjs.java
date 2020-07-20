package com.hxzq.s0097.share.bean;

import java.math.BigDecimal;

public class FactZjs {
    /**
     * 预约日期
     */
    private Long appoint_date;

    /**
     * 预约时间
     */
    private String appoint_time;

    /**
     * null
     */
    private String appoint_brokercode;

    /**
     * null
     */
    private String appoint_brokertype;

    /**
     * null
     */
    private String appoint_broker_orgid;

    /**
     * 存量客户号
     */
    private Long oldclient_clientid;

    /**
     * null
     */
    private String oldclient_phone;

    /**
     * null
     */
    private String oldclient_fundid;

    /**
     * null
     */
    private String oldclient_opendate;

    /**
     * null
     */
    private String oldclient_xx_activatedt;

    /**
     * null
     */
    private String oldclient_orgid;

    /**
     * null
     */
    private String oldclient_brokercode;

    /**
     * null
     */
    private String oldclient_brokername;

    /**
     * null
     */
    private String oldclient_brokertype;

    /**
     * null
     */
    private BigDecimal oldclient_topnetasset_bymonth;

    /**
     * 新客客户号
     */
    private Long newclient_clientid;

    /**
     * 新客手机号
     */
    private String newclient_phone;

    /**
     * 新客开户时间
     */
    private String newclient_opentime;

    /**
     * 新客开户日期
     */
    private String newclient_opendate;

    /**
     * null
     */
    private String newclient_closedate;

    /**
     * 新客开户日期当月
     */
    private Long newclient_openmonth_1;

    /**
     * 新客开户日期下月
     */
    private Long newclient_openmonth_2;

    /**
     * null
     */
    private String newclient_xx_activatedt;

    /**
     * null
     */
    private String newclient_fundid;

    /**
     * null
     */
    private String newclient_orgid;

    /**
     * 新客净资产峰值
     */
    private BigDecimal newclient_topnetasset;

    /**
     * 新客市值峰值
     */
    private BigDecimal newclient_topmktvalue;

    /**
     * null
     */
    private String newclient_brokercode;

    /**
     * null
     */
    private String newclient_brokername;

    /**
     * null
     */
    private String newclient_brokertype;

    /**
     * null
     */
    private String newclient_is_dormant_activate;

    /**
     * 新客开户前6个月是否注销
     */
    private String newclient_is_close_bym6;

    /**
     * 新客是否满足奖励标准
     */
    private String is_satisfy_awardstanard;

    /**
     * 新客奖励等级
     */
    private String current_award_level;

    /**
     * 新客净资产达到1w的日期
     */
    private Long newclient_asset_1w_dt;

    /**
     * 新客市值达到20w的日期
     */
    private Long newclient_mkt_20w_dt;

    /**
     * 新客当前净资产
     */
    private BigDecimal newclient_current_netasset;

    /**
     * 新客当前市值
     */
    private BigDecimal newclient_current_mkt;

    /**
     * null
     */
    private Long bizdate;

    public Long getAppoint_date() {
        return appoint_date;
    }

    public void setAppoint_date(Long appoint_date) {
        this.appoint_date = appoint_date;
    }

    public String getAppoint_time() {
        return appoint_time;
    }

    public void setAppoint_time(String appoint_time) {
        this.appoint_time = appoint_time;
    }

    public String getAppoint_brokercode() {
        return appoint_brokercode;
    }

    public void setAppoint_brokercode(String appoint_brokercode) {
        this.appoint_brokercode = appoint_brokercode;
    }

    public String getAppoint_brokertype() {
        return appoint_brokertype;
    }

    public void setAppoint_brokertype(String appoint_brokertype) {
        this.appoint_brokertype = appoint_brokertype;
    }

    public String getAppoint_broker_orgid() {
        return appoint_broker_orgid;
    }

    public void setAppoint_broker_orgid(String appoint_broker_orgid) {
        this.appoint_broker_orgid = appoint_broker_orgid;
    }

    public Long getOldclient_clientid() {
        return oldclient_clientid;
    }

    public void setOldclient_clientid(Long oldclient_clientid) {
        this.oldclient_clientid = oldclient_clientid;
    }

    public String getOldclient_phone() {
        return oldclient_phone;
    }

    public void setOldclient_phone(String oldclient_phone) {
        this.oldclient_phone = oldclient_phone;
    }

    public String getOldclient_fundid() {
        return oldclient_fundid;
    }

    public void setOldclient_fundid(String oldclient_fundid) {
        this.oldclient_fundid = oldclient_fundid;
    }

    public String getOldclient_opendate() {
        return oldclient_opendate;
    }

    public void setOldclient_opendate(String oldclient_opendate) {
        this.oldclient_opendate = oldclient_opendate;
    }

    public String getOldclient_xx_activatedt() {
        return oldclient_xx_activatedt;
    }

    public void setOldclient_xx_activatedt(String oldclient_xx_activatedt) {
        this.oldclient_xx_activatedt = oldclient_xx_activatedt;
    }

    public String getOldclient_orgid() {
        return oldclient_orgid;
    }

    public void setOldclient_orgid(String oldclient_orgid) {
        this.oldclient_orgid = oldclient_orgid;
    }

    public String getOldclient_brokercode() {
        return oldclient_brokercode;
    }

    public void setOldclient_brokercode(String oldclient_brokercode) {
        this.oldclient_brokercode = oldclient_brokercode;
    }

    public String getOldclient_brokername() {
        return oldclient_brokername;
    }

    public void setOldclient_brokername(String oldclient_brokername) {
        this.oldclient_brokername = oldclient_brokername;
    }

    public String getOldclient_brokertype() {
        return oldclient_brokertype;
    }

    public void setOldclient_brokertype(String oldclient_brokertype) {
        this.oldclient_brokertype = oldclient_brokertype;
    }

    public BigDecimal getOldclient_topnetasset_bymonth() {
        return oldclient_topnetasset_bymonth;
    }

    public void setOldclient_topnetasset_bymonth(BigDecimal oldclient_topnetasset_bymonth) {
        this.oldclient_topnetasset_bymonth = oldclient_topnetasset_bymonth;
    }

    public Long getNewclient_clientid() {
        return newclient_clientid;
    }

    public void setNewclient_clientid(Long newclient_clientid) {
        this.newclient_clientid = newclient_clientid;
    }

    public String getNewclient_phone() {
        return newclient_phone;
    }

    public void setNewclient_phone(String newclient_phone) {
        this.newclient_phone = newclient_phone;
    }

    public String getNewclient_opentime() {
        return newclient_opentime;
    }

    public void setNewclient_opentime(String newclient_opentime) {
        this.newclient_opentime = newclient_opentime;
    }

    public String getNewclient_opendate() {
        return newclient_opendate;
    }

    public void setNewclient_opendate(String newclient_opendate) {
        this.newclient_opendate = newclient_opendate;
    }

    public String getNewclient_closedate() {
        return newclient_closedate;
    }

    public void setNewclient_closedate(String newclient_closedate) {
        this.newclient_closedate = newclient_closedate;
    }

    public Long getNewclient_openmonth_1() {
        return newclient_openmonth_1;
    }

    public void setNewclient_openmonth_1(Long newclient_openmonth_1) {
        this.newclient_openmonth_1 = newclient_openmonth_1;
    }

    public Long getNewclient_openmonth_2() {
        return newclient_openmonth_2;
    }

    public void setNewclient_openmonth_2(Long newclient_openmonth_2) {
        this.newclient_openmonth_2 = newclient_openmonth_2;
    }

    public String getNewclient_xx_activatedt() {
        return newclient_xx_activatedt;
    }

    public void setNewclient_xx_activatedt(String newclient_xx_activatedt) {
        this.newclient_xx_activatedt = newclient_xx_activatedt;
    }

    public String getNewclient_fundid() {
        return newclient_fundid;
    }

    public void setNewclient_fundid(String newclient_fundid) {
        this.newclient_fundid = newclient_fundid;
    }

    public String getNewclient_orgid() {
        return newclient_orgid;
    }

    public void setNewclient_orgid(String newclient_orgid) {
        this.newclient_orgid = newclient_orgid;
    }

    public BigDecimal getNewclient_topnetasset() {
        return newclient_topnetasset;
    }

    public void setNewclient_topnetasset(BigDecimal newclient_topnetasset) {
        this.newclient_topnetasset = newclient_topnetasset;
    }

    public BigDecimal getNewclient_topmktvalue() {
        return newclient_topmktvalue;
    }

    public void setNewclient_topmktvalue(BigDecimal newclient_topmktvalue) {
        this.newclient_topmktvalue = newclient_topmktvalue;
    }

    public String getNewclient_brokercode() {
        return newclient_brokercode;
    }

    public void setNewclient_brokercode(String newclient_brokercode) {
        this.newclient_brokercode = newclient_brokercode;
    }

    public String getNewclient_brokername() {
        return newclient_brokername;
    }

    public void setNewclient_brokername(String newclient_brokername) {
        this.newclient_brokername = newclient_brokername;
    }

    public String getNewclient_brokertype() {
        return newclient_brokertype;
    }

    public void setNewclient_brokertype(String newclient_brokertype) {
        this.newclient_brokertype = newclient_brokertype;
    }

    public String getNewclient_is_dormant_activate() {
        return newclient_is_dormant_activate;
    }

    public void setNewclient_is_dormant_activate(String newclient_is_dormant_activate) {
        this.newclient_is_dormant_activate = newclient_is_dormant_activate;
    }

    public String getNewclient_is_close_bym6() {
        return newclient_is_close_bym6;
    }

    public void setNewclient_is_close_bym6(String newclient_is_close_bym6) {
        this.newclient_is_close_bym6 = newclient_is_close_bym6;
    }

    public String getIs_satisfy_awardstanard() {
        return is_satisfy_awardstanard;
    }

    public void setIs_satisfy_awardstanard(String is_satisfy_awardstanard) {
        this.is_satisfy_awardstanard = is_satisfy_awardstanard;
    }

    public String getCurrent_award_level() {
        return current_award_level;
    }

    public void setCurrent_award_level(String current_award_level) {
        this.current_award_level = current_award_level;
    }

    public Long getNewclient_asset_1w_dt() {
        return newclient_asset_1w_dt;
    }

    public void setNewclient_asset_1w_dt(Long newclient_asset_1w_dt) {
        this.newclient_asset_1w_dt = newclient_asset_1w_dt;
    }

    public Long getNewclient_mkt_20w_dt() {
        return newclient_mkt_20w_dt;
    }

    public void setNewclient_mkt_20w_dt(Long newclient_mkt_20w_dt) {
        this.newclient_mkt_20w_dt = newclient_mkt_20w_dt;
    }

    public BigDecimal getNewclient_current_netasset() {
        return newclient_current_netasset;
    }

    public void setNewclient_current_netasset(BigDecimal newclient_current_netasset) {
        this.newclient_current_netasset = newclient_current_netasset;
    }

    public BigDecimal getNewclient_current_mkt() {
        return newclient_current_mkt;
    }

    public void setNewclient_current_mkt(BigDecimal newclient_current_mkt) {
        this.newclient_current_mkt = newclient_current_mkt;
    }

    public Long getBizdate() {
        return bizdate;
    }

    public void setBizdate(Long bizdate) {
        this.bizdate = bizdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appoint_date=").append(appoint_date);
        sb.append(", appoint_time=").append(appoint_time);
        sb.append(", appoint_brokercode=").append(appoint_brokercode);
        sb.append(", appoint_brokertype=").append(appoint_brokertype);
        sb.append(", appoint_broker_orgid=").append(appoint_broker_orgid);
        sb.append(", oldclient_clientid=").append(oldclient_clientid);
        sb.append(", oldclient_phone=").append(oldclient_phone);
        sb.append(", oldclient_fundid=").append(oldclient_fundid);
        sb.append(", oldclient_opendate=").append(oldclient_opendate);
        sb.append(", oldclient_xx_activatedt=").append(oldclient_xx_activatedt);
        sb.append(", oldclient_orgid=").append(oldclient_orgid);
        sb.append(", oldclient_brokercode=").append(oldclient_brokercode);
        sb.append(", oldclient_brokername=").append(oldclient_brokername);
        sb.append(", oldclient_brokertype=").append(oldclient_brokertype);
        sb.append(", oldclient_topnetasset_bymonth=").append(oldclient_topnetasset_bymonth);
        sb.append(", newclient_clientid=").append(newclient_clientid);
        sb.append(", newclient_phone=").append(newclient_phone);
        sb.append(", newclient_opentime=").append(newclient_opentime);
        sb.append(", newclient_opendate=").append(newclient_opendate);
        sb.append(", newclient_closedate=").append(newclient_closedate);
        sb.append(", newclient_openmonth_1=").append(newclient_openmonth_1);
        sb.append(", newclient_openmonth_2=").append(newclient_openmonth_2);
        sb.append(", newclient_xx_activatedt=").append(newclient_xx_activatedt);
        sb.append(", newclient_fundid=").append(newclient_fundid);
        sb.append(", newclient_orgid=").append(newclient_orgid);
        sb.append(", newclient_topnetasset=").append(newclient_topnetasset);
        sb.append(", newclient_topmktvalue=").append(newclient_topmktvalue);
        sb.append(", newclient_brokercode=").append(newclient_brokercode);
        sb.append(", newclient_brokername=").append(newclient_brokername);
        sb.append(", newclient_brokertype=").append(newclient_brokertype);
        sb.append(", newclient_is_dormant_activate=").append(newclient_is_dormant_activate);
        sb.append(", newclient_is_close_bym6=").append(newclient_is_close_bym6);
        sb.append(", is_satisfy_awardstanard=").append(is_satisfy_awardstanard);
        sb.append(", current_award_level=").append(current_award_level);
        sb.append(", newclient_asset_1w_dt=").append(newclient_asset_1w_dt);
        sb.append(", newclient_mkt_20w_dt=").append(newclient_mkt_20w_dt);
        sb.append(", newclient_current_netasset=").append(newclient_current_netasset);
        sb.append(", newclient_current_mkt=").append(newclient_current_mkt);
        sb.append(", bizdate=").append(bizdate);
        sb.append("]");
        return sb.toString();
    }
}