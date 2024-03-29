package com.github.taktos.dbflute.dao.cbean.cq.ciq;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.github.taktos.dbflute.dao.cbean.*;
import com.github.taktos.dbflute.dao.cbean.cq.bs.*;
import com.github.taktos.dbflute.dao.cbean.cq.*;

/**
 * The condition-query for in-line of SERVICE_RANK.
 * @author DBFlute(AutoGenerator)
 */
public class ServiceRankCIQ extends AbstractBsServiceRankCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsServiceRankCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ServiceRankCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsServiceRankCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueServiceRankCode() { return _myCQ.getServiceRankCode(); }
    public String keepServiceRankCode_ExistsReferrer_MemberServiceList(MemberServiceCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepServiceRankCode_NotExistsReferrer_MemberServiceList(MemberServiceCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepServiceRankCode_InScopeRelation_MemberServiceList(MemberServiceCQ sq)
    { return _myCQ.keepServiceRankCode_InScopeRelation_MemberServiceList(sq); }
    public String keepServiceRankCode_NotInScopeRelation_MemberServiceList(MemberServiceCQ sq)
    { return _myCQ.keepServiceRankCode_NotInScopeRelation_MemberServiceList(sq); }
    public String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(MemberServiceCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(MemberServiceCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueServiceRankName() { return _myCQ.getServiceRankName(); }
    protected ConditionValue getCValueServicePointIncidence() { return _myCQ.getServicePointIncidence(); }
    protected ConditionValue getCValueNewAcceptableFlg() { return _myCQ.getNewAcceptableFlg(); }
    protected ConditionValue getCValueDescription() { return _myCQ.getDescription(); }
    protected ConditionValue getCValueDisplayOrder() { return _myCQ.getDisplayOrder(); }
    public String keepScalarCondition(ServiceRankCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepMyselfInScope(ServiceRankCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ServiceRankCB.class.getName(); }
    protected String xinCQ() { return ServiceRankCQ.class.getName(); }
}
