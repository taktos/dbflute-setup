package com.github.taktos.dbflute.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.github.taktos.dbflute.dao.cbean.cq.ciq.*;
import com.github.taktos.dbflute.dao.cbean.*;
import com.github.taktos.dbflute.dao.cbean.cq.*;

/**
 * The base condition-query of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberLoginCQ extends AbstractBsMemberLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberLoginCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_LOGIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberLoginCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = createInlineQuery(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberLoginCIQ createInlineQuery()
    { return new MemberLoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this); }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_LOGIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberLoginCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberLoginCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberLoginId;
    public ConditionValue getMemberLoginId() {
        if (_memberLoginId == null) { _memberLoginId = nCV(); }
        return _memberLoginId;
    }
    protected ConditionValue getCValueMemberLoginId() { return getMemberLoginId(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberLoginId_Asc() { regOBA("MEMBER_LOGIN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberLoginId_Desc() { regOBD("MEMBER_LOGIN_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MemberCQ> _memberId_InScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_InScopeRelation_Member() { return _memberId_InScopeRelation_MemberMap; }
    public String keepMemberId_InScopeRelation_Member(MemberCQ subQuery) {
        if (_memberId_InScopeRelation_MemberMap == null) { _memberId_InScopeRelation_MemberMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberMap.size() + 1);
        _memberId_InScopeRelation_MemberMap.put(key, subQuery); return "memberId_InScopeRelation_Member." + key;
    }

    protected Map<String, MemberCQ> _memberId_NotInScopeRelation_MemberMap;
    public Map<String, MemberCQ> getMemberId_NotInScopeRelation_Member() { return _memberId_NotInScopeRelation_MemberMap; }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberMap == null) { _memberId_NotInScopeRelation_MemberMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberMap.size() + 1);
        _memberId_NotInScopeRelation_MemberMap.put(key, subQuery); return "memberId_NotInScopeRelation_Member." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _loginDatetime;
    public ConditionValue getLoginDatetime() {
        if (_loginDatetime == null) { _loginDatetime = nCV(); }
        return _loginDatetime;
    }
    protected ConditionValue getCValueLoginDatetime() { return getLoginDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_DATETIME: {UQ+, IX, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginDatetime_Asc() { regOBA("LOGIN_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_DATETIME: {UQ+, IX, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginDatetime_Desc() { regOBD("LOGIN_DATETIME"); return this; }

    protected ConditionValue _mobileLoginFlg;
    public ConditionValue getMobileLoginFlg() {
        if (_mobileLoginFlg == null) { _mobileLoginFlg = nCV(); }
        return _mobileLoginFlg;
    }
    protected ConditionValue getCValueMobileLoginFlg() { return getMobileLoginFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * MOBILE_LOGIN_FLG: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MobileLoginFlg_Asc() { regOBA("MOBILE_LOGIN_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * MOBILE_LOGIN_FLG: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MobileLoginFlg_Desc() { regOBD("MOBILE_LOGIN_FLG"); return this; }

    protected ConditionValue _loginMemberStatusCode;
    public ConditionValue getLoginMemberStatusCode() {
        if (_loginMemberStatusCode == null) { _loginMemberStatusCode = nCV(); }
        return _loginMemberStatusCode;
    }
    protected ConditionValue getCValueLoginMemberStatusCode() { return getLoginMemberStatusCode(); }

    protected Map<String, MemberStatusCQ> _loginMemberStatusCode_InScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_InScopeRelation_MemberStatus() { return _loginMemberStatusCode_InScopeRelation_MemberStatusMap; }
    public String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ subQuery) {
        if (_loginMemberStatusCode_InScopeRelation_MemberStatusMap == null) { _loginMemberStatusCode_InScopeRelation_MemberStatusMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_loginMemberStatusCode_InScopeRelation_MemberStatusMap.size() + 1);
        _loginMemberStatusCode_InScopeRelation_MemberStatusMap.put(key, subQuery); return "loginMemberStatusCode_InScopeRelation_MemberStatus." + key;
    }

    protected Map<String, MemberStatusCQ> _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getLoginMemberStatusCode_NotInScopeRelation_MemberStatus() { return _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap; }
    public String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ subQuery) {
        if (_loginMemberStatusCode_NotInScopeRelation_MemberStatusMap == null) { _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_loginMemberStatusCode_NotInScopeRelation_MemberStatusMap.size() + 1);
        _loginMemberStatusCode_NotInScopeRelation_MemberStatusMap.put(key, subQuery); return "loginMemberStatusCode_NotInScopeRelation_MemberStatus." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginMemberStatusCode_Asc() { regOBA("LOGIN_MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginMemberStatusCode_Desc() { regOBD("LOGIN_MEMBER_STATUS_CODE"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        MemberLoginCQ baseQuery = (MemberLoginCQ)baseQueryAsSuper;
        MemberLoginCQ unionQuery = (MemberLoginCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryMember()) {
            unionQuery.queryMember().reflectRelationOnUnionQuery(baseQuery.queryMember(), unionQuery.queryMember());
        }
        if (baseQuery.hasConditionQueryMemberStatus()) {
            unionQuery.queryMemberStatus().reflectRelationOnUnionQuery(baseQuery.queryMemberStatus(), unionQuery.queryMemberStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * MEMBER as 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return getConditionQueryMember();
    }
    protected MemberCQ _conditionQueryMember;
    public MemberCQ getConditionQueryMember() {
        if (_conditionQueryMember == null) {
            _conditionQueryMember = xcreateQueryMember();
            xsetupOuterJoinMember();
        }
        return _conditionQueryMember;
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = resolveNextRelationPath("MEMBER_LOGIN", "member");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberCQ cq = new MemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetForeignPropertyName("member");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMember() {
        MemberCQ cq = getConditionQueryMember();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "member");
    }
    public boolean hasConditionQueryMember() {
        return _conditionQueryMember != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * MEMBER_STATUS as 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return getConditionQueryMemberStatus();
    }
    protected MemberStatusCQ _conditionQueryMemberStatus;
    public MemberStatusCQ getConditionQueryMemberStatus() {
        if (_conditionQueryMemberStatus == null) {
            _conditionQueryMemberStatus = xcreateQueryMemberStatus();
            xsetupOuterJoinMemberStatus();
        }
        return _conditionQueryMemberStatus;
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = resolveNextRelationPath("MEMBER_LOGIN", "memberStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberStatusCQ cq = new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetForeignPropertyName("memberStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberStatus() {
        MemberStatusCQ cq = getConditionQueryMemberStatus();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("LOGIN_MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "memberStatus");
    }
    public boolean hasConditionQueryMemberStatus() {
        return _conditionQueryMemberStatus != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberLoginCQ> _scalarConditionMap;
    public Map<String, MemberLoginCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberLoginCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberLoginCQ> _myselfInScopeMap;
    public Map<String, MemberLoginCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberLoginCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberLoginCB.class.getName(); }
    protected String xCQ() { return MemberLoginCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
