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
 * The base condition-query of SERVICE_RANK.
 * @author DBFlute(AutoGenerator)
 */
public class BsServiceRankCQ extends AbstractBsServiceRankCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ServiceRankCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsServiceRankCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SERVICE_RANK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ServiceRankCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = createInlineQuery(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ServiceRankCIQ createInlineQuery()
    { return new ServiceRankCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this); }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SERVICE_RANK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ServiceRankCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ServiceRankCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _serviceRankCode;
    public ConditionValue getServiceRankCode() {
        if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
        return _serviceRankCode;
    }
    protected ConditionValue getCValueServiceRankCode() { return getServiceRankCode(); }

    protected Map<String, MemberServiceCQ> _serviceRankCode_ExistsReferrer_MemberServiceListMap;
    public Map<String, MemberServiceCQ> getServiceRankCode_ExistsReferrer_MemberServiceList() { return _serviceRankCode_ExistsReferrer_MemberServiceListMap; }
    public String keepServiceRankCode_ExistsReferrer_MemberServiceList(MemberServiceCQ subQuery) {
        if (_serviceRankCode_ExistsReferrer_MemberServiceListMap == null) { _serviceRankCode_ExistsReferrer_MemberServiceListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_serviceRankCode_ExistsReferrer_MemberServiceListMap.size() + 1);
        _serviceRankCode_ExistsReferrer_MemberServiceListMap.put(key, subQuery); return "serviceRankCode_ExistsReferrer_MemberServiceList." + key;
    }

    protected Map<String, MemberServiceCQ> _serviceRankCode_NotExistsReferrer_MemberServiceListMap;
    public Map<String, MemberServiceCQ> getServiceRankCode_NotExistsReferrer_MemberServiceList() { return _serviceRankCode_NotExistsReferrer_MemberServiceListMap; }
    public String keepServiceRankCode_NotExistsReferrer_MemberServiceList(MemberServiceCQ subQuery) {
        if (_serviceRankCode_NotExistsReferrer_MemberServiceListMap == null) { _serviceRankCode_NotExistsReferrer_MemberServiceListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_serviceRankCode_NotExistsReferrer_MemberServiceListMap.size() + 1);
        _serviceRankCode_NotExistsReferrer_MemberServiceListMap.put(key, subQuery); return "serviceRankCode_NotExistsReferrer_MemberServiceList." + key;
    }

    protected Map<String, MemberServiceCQ> _serviceRankCode_InScopeRelation_MemberServiceListMap;
    public Map<String, MemberServiceCQ> getServiceRankCode_InScopeRelation_MemberServiceList() { return _serviceRankCode_InScopeRelation_MemberServiceListMap; }
    public String keepServiceRankCode_InScopeRelation_MemberServiceList(MemberServiceCQ subQuery) {
        if (_serviceRankCode_InScopeRelation_MemberServiceListMap == null) { _serviceRankCode_InScopeRelation_MemberServiceListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_serviceRankCode_InScopeRelation_MemberServiceListMap.size() + 1);
        _serviceRankCode_InScopeRelation_MemberServiceListMap.put(key, subQuery); return "serviceRankCode_InScopeRelation_MemberServiceList." + key;
    }

    protected Map<String, MemberServiceCQ> _serviceRankCode_NotInScopeRelation_MemberServiceListMap;
    public Map<String, MemberServiceCQ> getServiceRankCode_NotInScopeRelation_MemberServiceList() { return _serviceRankCode_NotInScopeRelation_MemberServiceListMap; }
    public String keepServiceRankCode_NotInScopeRelation_MemberServiceList(MemberServiceCQ subQuery) {
        if (_serviceRankCode_NotInScopeRelation_MemberServiceListMap == null) { _serviceRankCode_NotInScopeRelation_MemberServiceListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_serviceRankCode_NotInScopeRelation_MemberServiceListMap.size() + 1);
        _serviceRankCode_NotInScopeRelation_MemberServiceListMap.put(key, subQuery); return "serviceRankCode_NotInScopeRelation_MemberServiceList." + key;
    }

    protected Map<String, MemberServiceCQ> _serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap;
    public Map<String, MemberServiceCQ> getServiceRankCode_SpecifyDerivedReferrer_MemberServiceList() { return _serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap; }
    public String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(MemberServiceCQ subQuery) {
        if (_serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap == null) { _serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap.size() + 1);
        _serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap.put(key, subQuery); return "serviceRankCode_SpecifyDerivedReferrer_MemberServiceList." + key;
    }

    protected Map<String, MemberServiceCQ> _serviceRankCode_QueryDerivedReferrer_MemberServiceListMap;
    public Map<String, MemberServiceCQ> getServiceRankCode_QueryDerivedReferrer_MemberServiceList() { return _serviceRankCode_QueryDerivedReferrer_MemberServiceListMap; }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(MemberServiceCQ subQuery) {
        if (_serviceRankCode_QueryDerivedReferrer_MemberServiceListMap == null) { _serviceRankCode_QueryDerivedReferrer_MemberServiceListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_serviceRankCode_QueryDerivedReferrer_MemberServiceListMap.size() + 1);
        _serviceRankCode_QueryDerivedReferrer_MemberServiceListMap.put(key, subQuery); return "serviceRankCode_QueryDerivedReferrer_MemberServiceList." + key;
    }
    protected Map<String, Object> _serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap;
    public Map<String, Object> getServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter() { return _serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap; }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object parameterValue) {
        if (_serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap == null) { _serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap.size() + 1);
        _serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap.put(key, parameterValue); return "serviceRankCode_QueryDerivedReferrer_MemberServiceListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * SERVICE_RANK_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankCode_Asc() { regOBA("SERVICE_RANK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SERVICE_RANK_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankCode_Desc() { regOBD("SERVICE_RANK_CODE"); return this; }

    protected ConditionValue _serviceRankName;
    public ConditionValue getServiceRankName() {
        if (_serviceRankName == null) { _serviceRankName = nCV(); }
        return _serviceRankName;
    }
    protected ConditionValue getCValueServiceRankName() { return getServiceRankName(); }

    /** 
     * Add order-by as ascend. <br />
     * SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankName_Asc() { regOBA("SERVICE_RANK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankName_Desc() { regOBD("SERVICE_RANK_NAME"); return this; }

    protected ConditionValue _servicePointIncidence;
    public ConditionValue getServicePointIncidence() {
        if (_servicePointIncidence == null) { _servicePointIncidence = nCV(); }
        return _servicePointIncidence;
    }
    protected ConditionValue getCValueServicePointIncidence() { return getServicePointIncidence(); }

    /** 
     * Add order-by as ascend. <br />
     * SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServicePointIncidence_Asc() { regOBA("SERVICE_POINT_INCIDENCE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServicePointIncidence_Desc() { regOBD("SERVICE_POINT_INCIDENCE"); return this; }

    protected ConditionValue _newAcceptableFlg;
    public ConditionValue getNewAcceptableFlg() {
        if (_newAcceptableFlg == null) { _newAcceptableFlg = nCV(); }
        return _newAcceptableFlg;
    }
    protected ConditionValue getCValueNewAcceptableFlg() { return getNewAcceptableFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_NewAcceptableFlg_Asc() { regOBA("NEW_ACCEPTABLE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_NewAcceptableFlg_Desc() { regOBD("NEW_ACCEPTABLE_FLG"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = nCV(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    /** 
     * Add order-by as ascend. <br />
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br />
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder() {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsServiceRankCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsServiceRankCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, ServiceRankCQ> _scalarConditionMap;
    public Map<String, ServiceRankCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(ServiceRankCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, ServiceRankCQ> _myselfInScopeMap;
    public Map<String, ServiceRankCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(ServiceRankCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ServiceRankCB.class.getName(); }
    protected String xCQ() { return ServiceRankCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
