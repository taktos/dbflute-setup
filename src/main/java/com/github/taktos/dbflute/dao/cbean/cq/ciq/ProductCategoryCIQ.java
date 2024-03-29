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
 * The condition-query for in-line of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryCIQ extends AbstractBsProductCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsProductCategoryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ProductCategoryCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsProductCategoryCQ myCQ) {
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
    protected ConditionValue getCValueProductCategoryCode() { return _myCQ.getProductCategoryCode(); }
    public String keepProductCategoryCode_ExistsReferrer_ProductList(ProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(ProductCategoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductCategoryCode_NotExistsReferrer_ProductList(ProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(ProductCategoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductCategoryCode_InScopeRelation_ProductList(ProductCQ sq)
    { return _myCQ.keepProductCategoryCode_InScopeRelation_ProductList(sq); }
    public String keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(ProductCategoryCQ sq)
    { return _myCQ.keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(sq); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductList(ProductCQ sq)
    { return _myCQ.keepProductCategoryCode_NotInScopeRelation_ProductList(sq); }
    public String keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(ProductCategoryCQ sq)
    { return _myCQ.keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(sq); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(ProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductList(ProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueProductCategoryName() { return _myCQ.getProductCategoryName(); }
    protected ConditionValue getCValueParentCategoryCode() { return _myCQ.getParentCategoryCode(); }
    public String keepParentCategoryCode_InScopeRelation_ProductCategorySelf(ProductCategoryCQ sq)
    { return _myCQ.keepParentCategoryCode_InScopeRelation_ProductCategorySelf(sq); }
    public String keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(ProductCategoryCQ sq)
    { return _myCQ.keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(sq); }
    public String keepScalarCondition(ProductCategoryCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepMyselfInScope(ProductCategoryCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ProductCategoryCB.class.getName(); }
    protected String xinCQ() { return ProductCategoryCQ.class.getName(); }
}
