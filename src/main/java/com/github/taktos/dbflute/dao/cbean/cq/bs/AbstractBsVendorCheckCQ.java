package com.github.taktos.dbflute.dao.cbean.cq.bs;

import java.util.Collection;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.github.taktos.dbflute.dao.allcommon.*;
import com.github.taktos.dbflute.dao.cbean.*;
import com.github.taktos.dbflute.dao.cbean.cq.*;

/**
 * The abstract condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as equal.
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param vendorCheckId The value of vendorCheckId as notEqual.
     */
    public void setVendorCheckId_NotEqual(Long vendorCheckId) {
        doSetVendorCheckId_NotEqual(vendorCheckId);
    }

    protected void doSetVendorCheckId_NotEqual(Long vendorCheckId) {
        regVendorCheckId(CK_NES, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param vendorCheckId The value of vendorCheckId as greaterThan.
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param vendorCheckId The value of vendorCheckId as lessThan.
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param vendorCheckId The value of vendorCheckId as greaterEqual.
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param vendorCheckId The value of vendorCheckId as lessEqual.
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of vendorCheckId. (NullAllowed)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendorCheckId(), "VENDOR_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param vendorCheckIdList The collection of vendorCheckId as inScope.
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope.
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey k, Object v) { regQ(k, v, getCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    abstract protected ConditionValue getCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as equal.
     */
    public void setTypeOfChar_Equal(String typeOfChar) {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_Equal(String typeOfChar) {
        regTypeOfChar(CK_EQ, typeOfChar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfChar The value of typeOfChar as notEqual.
     */
    public void setTypeOfChar_NotEqual(String typeOfChar) {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_NotEqual(String typeOfChar) {
        regTypeOfChar(CK_NES, typeOfChar);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfChar The value of typeOfChar as greaterThan.
     */
    public void setTypeOfChar_GreaterThan(String typeOfChar) {
        regTypeOfChar(CK_GT, fRES(typeOfChar));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfChar The value of typeOfChar as lessThan.
     */
    public void setTypeOfChar_LessThan(String typeOfChar) {
        regTypeOfChar(CK_LT, fRES(typeOfChar));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfChar The value of typeOfChar as greaterEqual.
     */
    public void setTypeOfChar_GreaterEqual(String typeOfChar) {
        regTypeOfChar(CK_GE, fRES(typeOfChar));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfChar The value of typeOfChar as lessEqual.
     */
    public void setTypeOfChar_LessEqual(String typeOfChar) {
        regTypeOfChar(CK_LE, fRES(typeOfChar));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfCharList The collection of typeOfChar as inScope.
     */
    public void setTypeOfChar_InScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_InScope(typeOfCharList);
    }

    public void doSetTypeOfChar_InScope(Collection<String> typeOfCharList) {
        regINS(CK_INS, cTL(typeOfCharList), getCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfCharList The collection of typeOfChar as notInScope.
     */
    public void setTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_NotInScope(typeOfCharList);
    }

    public void doSetTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        regINS(CK_NINS, cTL(typeOfCharList), getCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfChar The value of typeOfChar as prefixSearch.
     */
    public void setTypeOfChar_PrefixSearch(String typeOfChar) {
        setTypeOfChar_LikeSearch(typeOfChar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfChar The value of typeOfChar as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfChar), getCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfChar The value of typeOfChar as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfChar), getCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfChar_IsNull() { regTypeOfChar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty(is null or empty). And OnlyOnceRegistered.
     */
    public void setTypeOfChar_IsNullOrEmpty() { regTypeOfChar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfChar_IsNotNull() { regTypeOfChar(CK_ISNN, DOBJ); }

    protected void regTypeOfChar(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfChar(), "TYPE_OF_CHAR"); }
    abstract protected ConditionValue getCValueTypeOfChar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as equal.
     */
    public void setTypeOfVarchar_Equal(String typeOfVarchar) {
        doSetTypeOfVarchar_Equal(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_Equal(String typeOfVarchar) {
        regTypeOfVarchar(CK_EQ, typeOfVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfVarchar The value of typeOfVarchar as notEqual.
     */
    public void setTypeOfVarchar_NotEqual(String typeOfVarchar) {
        doSetTypeOfVarchar_NotEqual(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_NotEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_NES, typeOfVarchar);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfVarchar The value of typeOfVarchar as greaterThan.
     */
    public void setTypeOfVarchar_GreaterThan(String typeOfVarchar) {
        regTypeOfVarchar(CK_GT, fRES(typeOfVarchar));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfVarchar The value of typeOfVarchar as lessThan.
     */
    public void setTypeOfVarchar_LessThan(String typeOfVarchar) {
        regTypeOfVarchar(CK_LT, fRES(typeOfVarchar));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfVarchar The value of typeOfVarchar as greaterEqual.
     */
    public void setTypeOfVarchar_GreaterEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_GE, fRES(typeOfVarchar));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfVarchar The value of typeOfVarchar as lessEqual.
     */
    public void setTypeOfVarchar_LessEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_LE, fRES(typeOfVarchar));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfVarcharList The collection of typeOfVarchar as inScope.
     */
    public void setTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_InScope(typeOfVarcharList);
    }

    public void doSetTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        regINS(CK_INS, cTL(typeOfVarcharList), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfVarcharList The collection of typeOfVarchar as notInScope.
     */
    public void setTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_NotInScope(typeOfVarcharList);
    }

    public void doSetTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        regINS(CK_NINS, cTL(typeOfVarcharList), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfVarchar The value of typeOfVarchar as prefixSearch.
     */
    public void setTypeOfVarchar_PrefixSearch(String typeOfVarchar) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfVarchar_IsNull() { regTypeOfVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty(is null or empty). And OnlyOnceRegistered.
     */
    public void setTypeOfVarchar_IsNullOrEmpty() { regTypeOfVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfVarchar_IsNotNull() { regTypeOfVarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR"); }
    abstract protected ConditionValue getCValueTypeOfVarchar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as equal.
     */
    public void setTypeOfClob_Equal(String typeOfClob) {
        doSetTypeOfClob_Equal(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_Equal(String typeOfClob) {
        regTypeOfClob(CK_EQ, typeOfClob);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfClob The value of typeOfClob as notEqual.
     */
    public void setTypeOfClob_NotEqual(String typeOfClob) {
        doSetTypeOfClob_NotEqual(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_NotEqual(String typeOfClob) {
        regTypeOfClob(CK_NES, typeOfClob);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfClob The value of typeOfClob as greaterThan.
     */
    public void setTypeOfClob_GreaterThan(String typeOfClob) {
        regTypeOfClob(CK_GT, fRES(typeOfClob));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfClob The value of typeOfClob as lessThan.
     */
    public void setTypeOfClob_LessThan(String typeOfClob) {
        regTypeOfClob(CK_LT, fRES(typeOfClob));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfClob The value of typeOfClob as greaterEqual.
     */
    public void setTypeOfClob_GreaterEqual(String typeOfClob) {
        regTypeOfClob(CK_GE, fRES(typeOfClob));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfClob The value of typeOfClob as lessEqual.
     */
    public void setTypeOfClob_LessEqual(String typeOfClob) {
        regTypeOfClob(CK_LE, fRES(typeOfClob));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfClobList The collection of typeOfClob as inScope.
     */
    public void setTypeOfClob_InScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_InScope(typeOfClobList);
    }

    public void doSetTypeOfClob_InScope(Collection<String> typeOfClobList) {
        regINS(CK_INS, cTL(typeOfClobList), getCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfClobList The collection of typeOfClob as notInScope.
     */
    public void setTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_NotInScope(typeOfClobList);
    }

    public void doSetTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        regINS(CK_NINS, cTL(typeOfClobList), getCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfClob The value of typeOfClob as prefixSearch.
     */
    public void setTypeOfClob_PrefixSearch(String typeOfClob) {
        setTypeOfClob_LikeSearch(typeOfClob, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfClob The value of typeOfClob as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfClob_LikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfClob), getCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfClob The value of typeOfClob as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfClob_NotLikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfClob), getCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfClob_IsNull() { regTypeOfClob(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty(is null or empty). And OnlyOnceRegistered.
     */
    public void setTypeOfClob_IsNullOrEmpty() { regTypeOfClob(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfClob_IsNotNull() { regTypeOfClob(CK_ISNN, DOBJ); }

    protected void regTypeOfClob(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfClob(), "TYPE_OF_CLOB"); }
    abstract protected ConditionValue getCValueTypeOfClob();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfText The value of typeOfText as equal.
     */
    public void setTypeOfText_Equal(String typeOfText) {
        doSetTypeOfText_Equal(fRES(typeOfText));
    }

    protected void doSetTypeOfText_Equal(String typeOfText) {
        regTypeOfText(CK_EQ, typeOfText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfText The value of typeOfText as notEqual.
     */
    public void setTypeOfText_NotEqual(String typeOfText) {
        doSetTypeOfText_NotEqual(fRES(typeOfText));
    }

    protected void doSetTypeOfText_NotEqual(String typeOfText) {
        regTypeOfText(CK_NES, typeOfText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfText The value of typeOfText as greaterThan.
     */
    public void setTypeOfText_GreaterThan(String typeOfText) {
        regTypeOfText(CK_GT, fRES(typeOfText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfText The value of typeOfText as lessThan.
     */
    public void setTypeOfText_LessThan(String typeOfText) {
        regTypeOfText(CK_LT, fRES(typeOfText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfText The value of typeOfText as greaterEqual.
     */
    public void setTypeOfText_GreaterEqual(String typeOfText) {
        regTypeOfText(CK_GE, fRES(typeOfText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfText The value of typeOfText as lessEqual.
     */
    public void setTypeOfText_LessEqual(String typeOfText) {
        regTypeOfText(CK_LE, fRES(typeOfText));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfTextList The collection of typeOfText as inScope.
     */
    public void setTypeOfText_InScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_InScope(typeOfTextList);
    }

    public void doSetTypeOfText_InScope(Collection<String> typeOfTextList) {
        regINS(CK_INS, cTL(typeOfTextList), getCValueTypeOfText(), "TYPE_OF_TEXT");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfTextList The collection of typeOfText as notInScope.
     */
    public void setTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_NotInScope(typeOfTextList);
    }

    public void doSetTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        regINS(CK_NINS, cTL(typeOfTextList), getCValueTypeOfText(), "TYPE_OF_TEXT");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfText The value of typeOfText as prefixSearch.
     */
    public void setTypeOfText_PrefixSearch(String typeOfText) {
        setTypeOfText_LikeSearch(typeOfText, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfText The value of typeOfText as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfText_LikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfText), getCValueTypeOfText(), "TYPE_OF_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfText The value of typeOfText as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfText_NotLikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfText), getCValueTypeOfText(), "TYPE_OF_TEXT", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfText_IsNull() { regTypeOfText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty(is null or empty). And OnlyOnceRegistered.
     */
    public void setTypeOfText_IsNullOrEmpty() { regTypeOfText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfText_IsNotNull() { regTypeOfText(CK_ISNN, DOBJ); }

    protected void regTypeOfText(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfText(), "TYPE_OF_TEXT"); }
    abstract protected ConditionValue getCValueTypeOfText();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as equal.
     */
    public void setTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        doSetTypeOfNumericInteger_Equal(typeOfNumericInteger);
    }

    protected void doSetTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_EQ, typeOfNumericInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericInteger The value of typeOfNumericInteger as notEqual.
     */
    public void setTypeOfNumericInteger_NotEqual(Integer typeOfNumericInteger) {
        doSetTypeOfNumericInteger_NotEqual(typeOfNumericInteger);
    }

    protected void doSetTypeOfNumericInteger_NotEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_NES, typeOfNumericInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterThan.
     */
    public void setTypeOfNumericInteger_GreaterThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GT, typeOfNumericInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessThan.
     */
    public void setTypeOfNumericInteger_LessThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LT, typeOfNumericInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterEqual.
     */
    public void setTypeOfNumericInteger_GreaterEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GE, typeOfNumericInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessEqual.
     */
    public void setTypeOfNumericInteger_LessEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LE, typeOfNumericInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericInteger. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericInteger. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as inScope.
     */
    public void setTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_InScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_INS, cTL(typeOfNumericIntegerList), getCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as notInScope.
     */
    public void setTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_NotInScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_NINS, cTL(typeOfNumericIntegerList), getCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericInteger_IsNull() { regTypeOfNumericInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericInteger_IsNotNull() { regTypeOfNumericInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericInteger(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER"); }
    abstract protected ConditionValue getCValueTypeOfNumericInteger();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as equal.
     */
    public void setTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        doSetTypeOfNumericBigint_Equal(typeOfNumericBigint);
    }

    protected void doSetTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_EQ, typeOfNumericBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigint The value of typeOfNumericBigint as notEqual.
     */
    public void setTypeOfNumericBigint_NotEqual(Long typeOfNumericBigint) {
        doSetTypeOfNumericBigint_NotEqual(typeOfNumericBigint);
    }

    protected void doSetTypeOfNumericBigint_NotEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_NES, typeOfNumericBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterThan.
     */
    public void setTypeOfNumericBigint_GreaterThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GT, typeOfNumericBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessThan.
     */
    public void setTypeOfNumericBigint_LessThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LT, typeOfNumericBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterEqual.
     */
    public void setTypeOfNumericBigint_GreaterEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GE, typeOfNumericBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessEqual.
     */
    public void setTypeOfNumericBigint_LessEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LE, typeOfNumericBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericBigint. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericBigint. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as inScope.
     */
    public void setTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_InScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_INS, cTL(typeOfNumericBigintList), getCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as notInScope.
     */
    public void setTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_NotInScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_NINS, cTL(typeOfNumericBigintList), getCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericBigint_IsNull() { regTypeOfNumericBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericBigint_IsNotNull() { regTypeOfNumericBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericBigint(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT"); }
    abstract protected ConditionValue getCValueTypeOfNumericBigint();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as equal.
     */
    public void setTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        doSetTypeOfNumericDecimal_Equal(typeOfNumericDecimal);
    }

    protected void doSetTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_EQ, typeOfNumericDecimal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as notEqual.
     */
    public void setTypeOfNumericDecimal_NotEqual(java.math.BigDecimal typeOfNumericDecimal) {
        doSetTypeOfNumericDecimal_NotEqual(typeOfNumericDecimal);
    }

    protected void doSetTypeOfNumericDecimal_NotEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_NES, typeOfNumericDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterThan.
     */
    public void setTypeOfNumericDecimal_GreaterThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GT, typeOfNumericDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessThan.
     */
    public void setTypeOfNumericDecimal_LessThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LT, typeOfNumericDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterEqual.
     */
    public void setTypeOfNumericDecimal_GreaterEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GE, typeOfNumericDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessEqual.
     */
    public void setTypeOfNumericDecimal_LessEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LE, typeOfNumericDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericDecimal. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericDecimal. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as inScope.
     */
    public void setTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_InScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_INS, cTL(typeOfNumericDecimalList), getCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as notInScope.
     */
    public void setTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_NotInScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_NINS, cTL(typeOfNumericDecimalList), getCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericDecimal_IsNull() { regTypeOfNumericDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericDecimal_IsNotNull() { regTypeOfNumericDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericDecimal(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL"); }
    abstract protected ConditionValue getCValueTypeOfNumericDecimal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as equal.
     */
    public void setTypeOfNumericIntegerMin_Equal(Integer typeOfNumericIntegerMin) {
        doSetTypeOfNumericIntegerMin_Equal(typeOfNumericIntegerMin);
    }

    protected void doSetTypeOfNumericIntegerMin_Equal(Integer typeOfNumericIntegerMin) {
        regTypeOfNumericIntegerMin(CK_EQ, typeOfNumericIntegerMin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as notEqual.
     */
    public void setTypeOfNumericIntegerMin_NotEqual(Integer typeOfNumericIntegerMin) {
        doSetTypeOfNumericIntegerMin_NotEqual(typeOfNumericIntegerMin);
    }

    protected void doSetTypeOfNumericIntegerMin_NotEqual(Integer typeOfNumericIntegerMin) {
        regTypeOfNumericIntegerMin(CK_NES, typeOfNumericIntegerMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as greaterThan.
     */
    public void setTypeOfNumericIntegerMin_GreaterThan(Integer typeOfNumericIntegerMin) {
        regTypeOfNumericIntegerMin(CK_GT, typeOfNumericIntegerMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as lessThan.
     */
    public void setTypeOfNumericIntegerMin_LessThan(Integer typeOfNumericIntegerMin) {
        regTypeOfNumericIntegerMin(CK_LT, typeOfNumericIntegerMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as greaterEqual.
     */
    public void setTypeOfNumericIntegerMin_GreaterEqual(Integer typeOfNumericIntegerMin) {
        regTypeOfNumericIntegerMin(CK_GE, typeOfNumericIntegerMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as lessEqual.
     */
    public void setTypeOfNumericIntegerMin_LessEqual(Integer typeOfNumericIntegerMin) {
        regTypeOfNumericIntegerMin(CK_LE, typeOfNumericIntegerMin);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericIntegerMin. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericIntegerMin. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericIntegerMin_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericIntegerMin(), "TYPE_OF_NUMERIC_INTEGER_MIN", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericIntegerMinList The collection of typeOfNumericIntegerMin as inScope.
     */
    public void setTypeOfNumericIntegerMin_InScope(Collection<Integer> typeOfNumericIntegerMinList) {
        doSetTypeOfNumericIntegerMin_InScope(typeOfNumericIntegerMinList);
    }

    protected void doSetTypeOfNumericIntegerMin_InScope(Collection<Integer> typeOfNumericIntegerMinList) {
        regINS(CK_INS, cTL(typeOfNumericIntegerMinList), getCValueTypeOfNumericIntegerMin(), "TYPE_OF_NUMERIC_INTEGER_MIN");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericIntegerMinList The collection of typeOfNumericIntegerMin as notInScope.
     */
    public void setTypeOfNumericIntegerMin_NotInScope(Collection<Integer> typeOfNumericIntegerMinList) {
        doSetTypeOfNumericIntegerMin_NotInScope(typeOfNumericIntegerMinList);
    }

    protected void doSetTypeOfNumericIntegerMin_NotInScope(Collection<Integer> typeOfNumericIntegerMinList) {
        regINS(CK_NINS, cTL(typeOfNumericIntegerMinList), getCValueTypeOfNumericIntegerMin(), "TYPE_OF_NUMERIC_INTEGER_MIN");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericIntegerMin_IsNull() { regTypeOfNumericIntegerMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericIntegerMin_IsNotNull() { regTypeOfNumericIntegerMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericIntegerMin(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericIntegerMin(), "TYPE_OF_NUMERIC_INTEGER_MIN"); }
    abstract protected ConditionValue getCValueTypeOfNumericIntegerMin();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as equal.
     */
    public void setTypeOfNumericIntegerMax_Equal(Integer typeOfNumericIntegerMax) {
        doSetTypeOfNumericIntegerMax_Equal(typeOfNumericIntegerMax);
    }

    protected void doSetTypeOfNumericIntegerMax_Equal(Integer typeOfNumericIntegerMax) {
        regTypeOfNumericIntegerMax(CK_EQ, typeOfNumericIntegerMax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as notEqual.
     */
    public void setTypeOfNumericIntegerMax_NotEqual(Integer typeOfNumericIntegerMax) {
        doSetTypeOfNumericIntegerMax_NotEqual(typeOfNumericIntegerMax);
    }

    protected void doSetTypeOfNumericIntegerMax_NotEqual(Integer typeOfNumericIntegerMax) {
        regTypeOfNumericIntegerMax(CK_NES, typeOfNumericIntegerMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as greaterThan.
     */
    public void setTypeOfNumericIntegerMax_GreaterThan(Integer typeOfNumericIntegerMax) {
        regTypeOfNumericIntegerMax(CK_GT, typeOfNumericIntegerMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as lessThan.
     */
    public void setTypeOfNumericIntegerMax_LessThan(Integer typeOfNumericIntegerMax) {
        regTypeOfNumericIntegerMax(CK_LT, typeOfNumericIntegerMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as greaterEqual.
     */
    public void setTypeOfNumericIntegerMax_GreaterEqual(Integer typeOfNumericIntegerMax) {
        regTypeOfNumericIntegerMax(CK_GE, typeOfNumericIntegerMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as lessEqual.
     */
    public void setTypeOfNumericIntegerMax_LessEqual(Integer typeOfNumericIntegerMax) {
        regTypeOfNumericIntegerMax(CK_LE, typeOfNumericIntegerMax);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericIntegerMax. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericIntegerMax. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericIntegerMax_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericIntegerMax(), "TYPE_OF_NUMERIC_INTEGER_MAX", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericIntegerMaxList The collection of typeOfNumericIntegerMax as inScope.
     */
    public void setTypeOfNumericIntegerMax_InScope(Collection<Integer> typeOfNumericIntegerMaxList) {
        doSetTypeOfNumericIntegerMax_InScope(typeOfNumericIntegerMaxList);
    }

    protected void doSetTypeOfNumericIntegerMax_InScope(Collection<Integer> typeOfNumericIntegerMaxList) {
        regINS(CK_INS, cTL(typeOfNumericIntegerMaxList), getCValueTypeOfNumericIntegerMax(), "TYPE_OF_NUMERIC_INTEGER_MAX");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericIntegerMaxList The collection of typeOfNumericIntegerMax as notInScope.
     */
    public void setTypeOfNumericIntegerMax_NotInScope(Collection<Integer> typeOfNumericIntegerMaxList) {
        doSetTypeOfNumericIntegerMax_NotInScope(typeOfNumericIntegerMaxList);
    }

    protected void doSetTypeOfNumericIntegerMax_NotInScope(Collection<Integer> typeOfNumericIntegerMaxList) {
        regINS(CK_NINS, cTL(typeOfNumericIntegerMaxList), getCValueTypeOfNumericIntegerMax(), "TYPE_OF_NUMERIC_INTEGER_MAX");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericIntegerMax_IsNull() { regTypeOfNumericIntegerMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericIntegerMax_IsNotNull() { regTypeOfNumericIntegerMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericIntegerMax(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericIntegerMax(), "TYPE_OF_NUMERIC_INTEGER_MAX"); }
    abstract protected ConditionValue getCValueTypeOfNumericIntegerMax();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as equal.
     */
    public void setTypeOfNumericBigintMin_Equal(Long typeOfNumericBigintMin) {
        doSetTypeOfNumericBigintMin_Equal(typeOfNumericBigintMin);
    }

    protected void doSetTypeOfNumericBigintMin_Equal(Long typeOfNumericBigintMin) {
        regTypeOfNumericBigintMin(CK_EQ, typeOfNumericBigintMin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as notEqual.
     */
    public void setTypeOfNumericBigintMin_NotEqual(Long typeOfNumericBigintMin) {
        doSetTypeOfNumericBigintMin_NotEqual(typeOfNumericBigintMin);
    }

    protected void doSetTypeOfNumericBigintMin_NotEqual(Long typeOfNumericBigintMin) {
        regTypeOfNumericBigintMin(CK_NES, typeOfNumericBigintMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as greaterThan.
     */
    public void setTypeOfNumericBigintMin_GreaterThan(Long typeOfNumericBigintMin) {
        regTypeOfNumericBigintMin(CK_GT, typeOfNumericBigintMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as lessThan.
     */
    public void setTypeOfNumericBigintMin_LessThan(Long typeOfNumericBigintMin) {
        regTypeOfNumericBigintMin(CK_LT, typeOfNumericBigintMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as greaterEqual.
     */
    public void setTypeOfNumericBigintMin_GreaterEqual(Long typeOfNumericBigintMin) {
        regTypeOfNumericBigintMin(CK_GE, typeOfNumericBigintMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as lessEqual.
     */
    public void setTypeOfNumericBigintMin_LessEqual(Long typeOfNumericBigintMin) {
        regTypeOfNumericBigintMin(CK_LE, typeOfNumericBigintMin);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericBigintMin. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericBigintMin. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigintMin_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericBigintMin(), "TYPE_OF_NUMERIC_BIGINT_MIN", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericBigintMinList The collection of typeOfNumericBigintMin as inScope.
     */
    public void setTypeOfNumericBigintMin_InScope(Collection<Long> typeOfNumericBigintMinList) {
        doSetTypeOfNumericBigintMin_InScope(typeOfNumericBigintMinList);
    }

    protected void doSetTypeOfNumericBigintMin_InScope(Collection<Long> typeOfNumericBigintMinList) {
        regINS(CK_INS, cTL(typeOfNumericBigintMinList), getCValueTypeOfNumericBigintMin(), "TYPE_OF_NUMERIC_BIGINT_MIN");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericBigintMinList The collection of typeOfNumericBigintMin as notInScope.
     */
    public void setTypeOfNumericBigintMin_NotInScope(Collection<Long> typeOfNumericBigintMinList) {
        doSetTypeOfNumericBigintMin_NotInScope(typeOfNumericBigintMinList);
    }

    protected void doSetTypeOfNumericBigintMin_NotInScope(Collection<Long> typeOfNumericBigintMinList) {
        regINS(CK_NINS, cTL(typeOfNumericBigintMinList), getCValueTypeOfNumericBigintMin(), "TYPE_OF_NUMERIC_BIGINT_MIN");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericBigintMin_IsNull() { regTypeOfNumericBigintMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericBigintMin_IsNotNull() { regTypeOfNumericBigintMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericBigintMin(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericBigintMin(), "TYPE_OF_NUMERIC_BIGINT_MIN"); }
    abstract protected ConditionValue getCValueTypeOfNumericBigintMin();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as equal.
     */
    public void setTypeOfNumericBigintMax_Equal(Long typeOfNumericBigintMax) {
        doSetTypeOfNumericBigintMax_Equal(typeOfNumericBigintMax);
    }

    protected void doSetTypeOfNumericBigintMax_Equal(Long typeOfNumericBigintMax) {
        regTypeOfNumericBigintMax(CK_EQ, typeOfNumericBigintMax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as notEqual.
     */
    public void setTypeOfNumericBigintMax_NotEqual(Long typeOfNumericBigintMax) {
        doSetTypeOfNumericBigintMax_NotEqual(typeOfNumericBigintMax);
    }

    protected void doSetTypeOfNumericBigintMax_NotEqual(Long typeOfNumericBigintMax) {
        regTypeOfNumericBigintMax(CK_NES, typeOfNumericBigintMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as greaterThan.
     */
    public void setTypeOfNumericBigintMax_GreaterThan(Long typeOfNumericBigintMax) {
        regTypeOfNumericBigintMax(CK_GT, typeOfNumericBigintMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as lessThan.
     */
    public void setTypeOfNumericBigintMax_LessThan(Long typeOfNumericBigintMax) {
        regTypeOfNumericBigintMax(CK_LT, typeOfNumericBigintMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as greaterEqual.
     */
    public void setTypeOfNumericBigintMax_GreaterEqual(Long typeOfNumericBigintMax) {
        regTypeOfNumericBigintMax(CK_GE, typeOfNumericBigintMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as lessEqual.
     */
    public void setTypeOfNumericBigintMax_LessEqual(Long typeOfNumericBigintMax) {
        regTypeOfNumericBigintMax(CK_LE, typeOfNumericBigintMax);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericBigintMax. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericBigintMax. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigintMax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericBigintMax(), "TYPE_OF_NUMERIC_BIGINT_MAX", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericBigintMaxList The collection of typeOfNumericBigintMax as inScope.
     */
    public void setTypeOfNumericBigintMax_InScope(Collection<Long> typeOfNumericBigintMaxList) {
        doSetTypeOfNumericBigintMax_InScope(typeOfNumericBigintMaxList);
    }

    protected void doSetTypeOfNumericBigintMax_InScope(Collection<Long> typeOfNumericBigintMaxList) {
        regINS(CK_INS, cTL(typeOfNumericBigintMaxList), getCValueTypeOfNumericBigintMax(), "TYPE_OF_NUMERIC_BIGINT_MAX");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericBigintMaxList The collection of typeOfNumericBigintMax as notInScope.
     */
    public void setTypeOfNumericBigintMax_NotInScope(Collection<Long> typeOfNumericBigintMaxList) {
        doSetTypeOfNumericBigintMax_NotInScope(typeOfNumericBigintMaxList);
    }

    protected void doSetTypeOfNumericBigintMax_NotInScope(Collection<Long> typeOfNumericBigintMaxList) {
        regINS(CK_NINS, cTL(typeOfNumericBigintMaxList), getCValueTypeOfNumericBigintMax(), "TYPE_OF_NUMERIC_BIGINT_MAX");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericBigintMax_IsNull() { regTypeOfNumericBigintMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericBigintMax_IsNotNull() { regTypeOfNumericBigintMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericBigintMax(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericBigintMax(), "TYPE_OF_NUMERIC_BIGINT_MAX"); }
    abstract protected ConditionValue getCValueTypeOfNumericBigintMax();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as equal.
     */
    public void setTypeOfNumericSuperintMin_Equal(java.math.BigDecimal typeOfNumericSuperintMin) {
        doSetTypeOfNumericSuperintMin_Equal(typeOfNumericSuperintMin);
    }

    protected void doSetTypeOfNumericSuperintMin_Equal(java.math.BigDecimal typeOfNumericSuperintMin) {
        regTypeOfNumericSuperintMin(CK_EQ, typeOfNumericSuperintMin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as notEqual.
     */
    public void setTypeOfNumericSuperintMin_NotEqual(java.math.BigDecimal typeOfNumericSuperintMin) {
        doSetTypeOfNumericSuperintMin_NotEqual(typeOfNumericSuperintMin);
    }

    protected void doSetTypeOfNumericSuperintMin_NotEqual(java.math.BigDecimal typeOfNumericSuperintMin) {
        regTypeOfNumericSuperintMin(CK_NES, typeOfNumericSuperintMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as greaterThan.
     */
    public void setTypeOfNumericSuperintMin_GreaterThan(java.math.BigDecimal typeOfNumericSuperintMin) {
        regTypeOfNumericSuperintMin(CK_GT, typeOfNumericSuperintMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as lessThan.
     */
    public void setTypeOfNumericSuperintMin_LessThan(java.math.BigDecimal typeOfNumericSuperintMin) {
        regTypeOfNumericSuperintMin(CK_LT, typeOfNumericSuperintMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as greaterEqual.
     */
    public void setTypeOfNumericSuperintMin_GreaterEqual(java.math.BigDecimal typeOfNumericSuperintMin) {
        regTypeOfNumericSuperintMin(CK_GE, typeOfNumericSuperintMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as lessEqual.
     */
    public void setTypeOfNumericSuperintMin_LessEqual(java.math.BigDecimal typeOfNumericSuperintMin) {
        regTypeOfNumericSuperintMin(CK_LE, typeOfNumericSuperintMin);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericSuperintMin. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericSuperintMin. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericSuperintMin_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericSuperintMin(), "TYPE_OF_NUMERIC_SUPERINT_MIN", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericSuperintMinList The collection of typeOfNumericSuperintMin as inScope.
     */
    public void setTypeOfNumericSuperintMin_InScope(Collection<java.math.BigDecimal> typeOfNumericSuperintMinList) {
        doSetTypeOfNumericSuperintMin_InScope(typeOfNumericSuperintMinList);
    }

    protected void doSetTypeOfNumericSuperintMin_InScope(Collection<java.math.BigDecimal> typeOfNumericSuperintMinList) {
        regINS(CK_INS, cTL(typeOfNumericSuperintMinList), getCValueTypeOfNumericSuperintMin(), "TYPE_OF_NUMERIC_SUPERINT_MIN");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericSuperintMinList The collection of typeOfNumericSuperintMin as notInScope.
     */
    public void setTypeOfNumericSuperintMin_NotInScope(Collection<java.math.BigDecimal> typeOfNumericSuperintMinList) {
        doSetTypeOfNumericSuperintMin_NotInScope(typeOfNumericSuperintMinList);
    }

    protected void doSetTypeOfNumericSuperintMin_NotInScope(Collection<java.math.BigDecimal> typeOfNumericSuperintMinList) {
        regINS(CK_NINS, cTL(typeOfNumericSuperintMinList), getCValueTypeOfNumericSuperintMin(), "TYPE_OF_NUMERIC_SUPERINT_MIN");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericSuperintMin_IsNull() { regTypeOfNumericSuperintMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericSuperintMin_IsNotNull() { regTypeOfNumericSuperintMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericSuperintMin(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericSuperintMin(), "TYPE_OF_NUMERIC_SUPERINT_MIN"); }
    abstract protected ConditionValue getCValueTypeOfNumericSuperintMin();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as equal.
     */
    public void setTypeOfNumericSuperintMax_Equal(java.math.BigDecimal typeOfNumericSuperintMax) {
        doSetTypeOfNumericSuperintMax_Equal(typeOfNumericSuperintMax);
    }

    protected void doSetTypeOfNumericSuperintMax_Equal(java.math.BigDecimal typeOfNumericSuperintMax) {
        regTypeOfNumericSuperintMax(CK_EQ, typeOfNumericSuperintMax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as notEqual.
     */
    public void setTypeOfNumericSuperintMax_NotEqual(java.math.BigDecimal typeOfNumericSuperintMax) {
        doSetTypeOfNumericSuperintMax_NotEqual(typeOfNumericSuperintMax);
    }

    protected void doSetTypeOfNumericSuperintMax_NotEqual(java.math.BigDecimal typeOfNumericSuperintMax) {
        regTypeOfNumericSuperintMax(CK_NES, typeOfNumericSuperintMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as greaterThan.
     */
    public void setTypeOfNumericSuperintMax_GreaterThan(java.math.BigDecimal typeOfNumericSuperintMax) {
        regTypeOfNumericSuperintMax(CK_GT, typeOfNumericSuperintMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as lessThan.
     */
    public void setTypeOfNumericSuperintMax_LessThan(java.math.BigDecimal typeOfNumericSuperintMax) {
        regTypeOfNumericSuperintMax(CK_LT, typeOfNumericSuperintMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as greaterEqual.
     */
    public void setTypeOfNumericSuperintMax_GreaterEqual(java.math.BigDecimal typeOfNumericSuperintMax) {
        regTypeOfNumericSuperintMax(CK_GE, typeOfNumericSuperintMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as lessEqual.
     */
    public void setTypeOfNumericSuperintMax_LessEqual(java.math.BigDecimal typeOfNumericSuperintMax) {
        regTypeOfNumericSuperintMax(CK_LE, typeOfNumericSuperintMax);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericSuperintMax. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericSuperintMax. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericSuperintMax_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericSuperintMax(), "TYPE_OF_NUMERIC_SUPERINT_MAX", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericSuperintMaxList The collection of typeOfNumericSuperintMax as inScope.
     */
    public void setTypeOfNumericSuperintMax_InScope(Collection<java.math.BigDecimal> typeOfNumericSuperintMaxList) {
        doSetTypeOfNumericSuperintMax_InScope(typeOfNumericSuperintMaxList);
    }

    protected void doSetTypeOfNumericSuperintMax_InScope(Collection<java.math.BigDecimal> typeOfNumericSuperintMaxList) {
        regINS(CK_INS, cTL(typeOfNumericSuperintMaxList), getCValueTypeOfNumericSuperintMax(), "TYPE_OF_NUMERIC_SUPERINT_MAX");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericSuperintMaxList The collection of typeOfNumericSuperintMax as notInScope.
     */
    public void setTypeOfNumericSuperintMax_NotInScope(Collection<java.math.BigDecimal> typeOfNumericSuperintMaxList) {
        doSetTypeOfNumericSuperintMax_NotInScope(typeOfNumericSuperintMaxList);
    }

    protected void doSetTypeOfNumericSuperintMax_NotInScope(Collection<java.math.BigDecimal> typeOfNumericSuperintMaxList) {
        regINS(CK_NINS, cTL(typeOfNumericSuperintMaxList), getCValueTypeOfNumericSuperintMax(), "TYPE_OF_NUMERIC_SUPERINT_MAX");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericSuperintMax_IsNull() { regTypeOfNumericSuperintMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericSuperintMax_IsNotNull() { regTypeOfNumericSuperintMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericSuperintMax(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericSuperintMax(), "TYPE_OF_NUMERIC_SUPERINT_MAX"); }
    abstract protected ConditionValue getCValueTypeOfNumericSuperintMax();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as equal.
     */
    public void setTypeOfNumericMaxdecimal_Equal(java.math.BigDecimal typeOfNumericMaxdecimal) {
        doSetTypeOfNumericMaxdecimal_Equal(typeOfNumericMaxdecimal);
    }

    protected void doSetTypeOfNumericMaxdecimal_Equal(java.math.BigDecimal typeOfNumericMaxdecimal) {
        regTypeOfNumericMaxdecimal(CK_EQ, typeOfNumericMaxdecimal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as notEqual.
     */
    public void setTypeOfNumericMaxdecimal_NotEqual(java.math.BigDecimal typeOfNumericMaxdecimal) {
        doSetTypeOfNumericMaxdecimal_NotEqual(typeOfNumericMaxdecimal);
    }

    protected void doSetTypeOfNumericMaxdecimal_NotEqual(java.math.BigDecimal typeOfNumericMaxdecimal) {
        regTypeOfNumericMaxdecimal(CK_NES, typeOfNumericMaxdecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as greaterThan.
     */
    public void setTypeOfNumericMaxdecimal_GreaterThan(java.math.BigDecimal typeOfNumericMaxdecimal) {
        regTypeOfNumericMaxdecimal(CK_GT, typeOfNumericMaxdecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as lessThan.
     */
    public void setTypeOfNumericMaxdecimal_LessThan(java.math.BigDecimal typeOfNumericMaxdecimal) {
        regTypeOfNumericMaxdecimal(CK_LT, typeOfNumericMaxdecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as greaterEqual.
     */
    public void setTypeOfNumericMaxdecimal_GreaterEqual(java.math.BigDecimal typeOfNumericMaxdecimal) {
        regTypeOfNumericMaxdecimal(CK_GE, typeOfNumericMaxdecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as lessEqual.
     */
    public void setTypeOfNumericMaxdecimal_LessEqual(java.math.BigDecimal typeOfNumericMaxdecimal) {
        regTypeOfNumericMaxdecimal(CK_LE, typeOfNumericMaxdecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfNumericMaxdecimal. (NullAllowed)
     * @param maxNumber The max number of typeOfNumericMaxdecimal. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericMaxdecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericMaxdecimal(), "TYPE_OF_NUMERIC_MAXDECIMAL", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericMaxdecimalList The collection of typeOfNumericMaxdecimal as inScope.
     */
    public void setTypeOfNumericMaxdecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericMaxdecimalList) {
        doSetTypeOfNumericMaxdecimal_InScope(typeOfNumericMaxdecimalList);
    }

    protected void doSetTypeOfNumericMaxdecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericMaxdecimalList) {
        regINS(CK_INS, cTL(typeOfNumericMaxdecimalList), getCValueTypeOfNumericMaxdecimal(), "TYPE_OF_NUMERIC_MAXDECIMAL");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfNumericMaxdecimalList The collection of typeOfNumericMaxdecimal as notInScope.
     */
    public void setTypeOfNumericMaxdecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericMaxdecimalList) {
        doSetTypeOfNumericMaxdecimal_NotInScope(typeOfNumericMaxdecimalList);
    }

    protected void doSetTypeOfNumericMaxdecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericMaxdecimalList) {
        regINS(CK_NINS, cTL(typeOfNumericMaxdecimalList), getCValueTypeOfNumericMaxdecimal(), "TYPE_OF_NUMERIC_MAXDECIMAL");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericMaxdecimal_IsNull() { regTypeOfNumericMaxdecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfNumericMaxdecimal_IsNotNull() { regTypeOfNumericMaxdecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericMaxdecimal(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericMaxdecimal(), "TYPE_OF_NUMERIC_MAXDECIMAL"); }
    abstract protected ConditionValue getCValueTypeOfNumericMaxdecimal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as equal.
     */
    public void setTypeOfInteger_Equal(Integer typeOfInteger) {
        doSetTypeOfInteger_Equal(typeOfInteger);
    }

    protected void doSetTypeOfInteger_Equal(Integer typeOfInteger) {
        regTypeOfInteger(CK_EQ, typeOfInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfInteger The value of typeOfInteger as notEqual.
     */
    public void setTypeOfInteger_NotEqual(Integer typeOfInteger) {
        doSetTypeOfInteger_NotEqual(typeOfInteger);
    }

    protected void doSetTypeOfInteger_NotEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_NES, typeOfInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfInteger The value of typeOfInteger as greaterThan.
     */
    public void setTypeOfInteger_GreaterThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_GT, typeOfInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfInteger The value of typeOfInteger as lessThan.
     */
    public void setTypeOfInteger_LessThan(Integer typeOfInteger) {
        regTypeOfInteger(CK_LT, typeOfInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfInteger The value of typeOfInteger as greaterEqual.
     */
    public void setTypeOfInteger_GreaterEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_GE, typeOfInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfInteger The value of typeOfInteger as lessEqual.
     */
    public void setTypeOfInteger_LessEqual(Integer typeOfInteger) {
        regTypeOfInteger(CK_LE, typeOfInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfInteger. (NullAllowed)
     * @param maxNumber The max number of typeOfInteger. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfInteger(), "TYPE_OF_INTEGER", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfIntegerList The collection of typeOfInteger as inScope.
     */
    public void setTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_InScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_InScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_INS, cTL(typeOfIntegerList), getCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfIntegerList The collection of typeOfInteger as notInScope.
     */
    public void setTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        doSetTypeOfInteger_NotInScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_NotInScope(Collection<Integer> typeOfIntegerList) {
        regINS(CK_NINS, cTL(typeOfIntegerList), getCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfInteger_IsNull() { regTypeOfInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfInteger_IsNotNull() { regTypeOfInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfInteger(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfInteger(), "TYPE_OF_INTEGER"); }
    abstract protected ConditionValue getCValueTypeOfInteger();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as equal.
     */
    public void setTypeOfBigint_Equal(Long typeOfBigint) {
        doSetTypeOfBigint_Equal(typeOfBigint);
    }

    protected void doSetTypeOfBigint_Equal(Long typeOfBigint) {
        regTypeOfBigint(CK_EQ, typeOfBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfBigint The value of typeOfBigint as notEqual.
     */
    public void setTypeOfBigint_NotEqual(Long typeOfBigint) {
        doSetTypeOfBigint_NotEqual(typeOfBigint);
    }

    protected void doSetTypeOfBigint_NotEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_NES, typeOfBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfBigint The value of typeOfBigint as greaterThan.
     */
    public void setTypeOfBigint_GreaterThan(Long typeOfBigint) {
        regTypeOfBigint(CK_GT, typeOfBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfBigint The value of typeOfBigint as lessThan.
     */
    public void setTypeOfBigint_LessThan(Long typeOfBigint) {
        regTypeOfBigint(CK_LT, typeOfBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfBigint The value of typeOfBigint as greaterEqual.
     */
    public void setTypeOfBigint_GreaterEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_GE, typeOfBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfBigint The value of typeOfBigint as lessEqual.
     */
    public void setTypeOfBigint_LessEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_LE, typeOfBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param minNumber The min number of typeOfBigint. (NullAllowed)
     * @param maxNumber The max number of typeOfBigint. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfBigint(), "TYPE_OF_BIGINT", rangeOfOption);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfBigintList The collection of typeOfBigint as inScope.
     */
    public void setTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_InScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        regINS(CK_INS, cTL(typeOfBigintList), getCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param typeOfBigintList The collection of typeOfBigint as notInScope.
     */
    public void setTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_NotInScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        regINS(CK_NINS, cTL(typeOfBigintList), getCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfBigint_IsNull() { regTypeOfBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfBigint_IsNotNull() { regTypeOfBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfBigint(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBigint(), "TYPE_OF_BIGINT"); }
    abstract protected ConditionValue getCValueTypeOfBigint();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * @param typeOfDate The value of typeOfDate as equal.
     */
    public void setTypeOfDate_Equal(java.util.Date typeOfDate) {
        regTypeOfDate(CK_EQ,  fCTPD(typeOfDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfDate The value of typeOfDate as greaterThan.
     */
    public void setTypeOfDate_GreaterThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GT,  fCTPD(typeOfDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfDate The value of typeOfDate as lessThan.
     */
    public void setTypeOfDate_LessThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LT,  fCTPD(typeOfDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfDate The value of typeOfDate as greaterEqual.
     */
    public void setTypeOfDate_GreaterEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GE,  fCTPD(typeOfDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfDate The value of typeOfDate as lessEqual.
     */
    public void setTypeOfDate_LessEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LE, fCTPD(typeOfDate));
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueTypeOfDate(), "TYPE_OF_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * <pre>
     * ex) from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *     --&gt; column &gt;= '2007/04/10 00:00:00'
     *     and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (NullAllowed)
     */
    public void setTypeOfDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setTypeOfDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfDate_IsNull() { regTypeOfDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfDate_IsNotNull() { regTypeOfDate(CK_ISNN, DOBJ); }

    protected void regTypeOfDate(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfDate(), "TYPE_OF_DATE"); }
    abstract protected ConditionValue getCValueTypeOfDate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal.
     */
    public void setTypeOfTimestamp_Equal(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan.
     */
    public void setTypeOfTimestamp_GreaterThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan.
     */
    public void setTypeOfTimestamp_LessThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual.
     */
    public void setTypeOfTimestamp_GreaterEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual.
     */
    public void setTypeOfTimestamp_LessEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered.
     * <pre>
     * ex) from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *     --&gt; column &gt;= '2007/04/10 00:00:00'
     *     and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed)
     */
    public void setTypeOfTimestamp_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setTypeOfTimestamp_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfTimestamp_IsNull() { regTypeOfTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfTimestamp_IsNotNull() { regTypeOfTimestamp(CK_ISNN, DOBJ); }

    protected void regTypeOfTimestamp(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP"); }
    abstract protected ConditionValue getCValueTypeOfTimestamp();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(6)}
     * @param typeOfTime The value of typeOfTime as equal.
     */
    public void setTypeOfTime_Equal(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_EQ,  typeOfTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfTime The value of typeOfTime as greaterThan.
     */
    public void setTypeOfTime_GreaterThan(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_GT,  typeOfTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfTime The value of typeOfTime as lessThan.
     */
    public void setTypeOfTime_LessThan(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_LT,  typeOfTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfTime The value of typeOfTime as greaterEqual.
     */
    public void setTypeOfTime_GreaterEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_GE,  typeOfTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param typeOfTime The value of typeOfTime as lessEqual.
     */
    public void setTypeOfTime_LessEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_LE, typeOfTime);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfTime_IsNull() { regTypeOfTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfTime_IsNotNull() { regTypeOfTime(CK_ISNN, DOBJ); }

    protected void regTypeOfTime(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfTime(), "TYPE_OF_TIME"); }
    abstract protected ConditionValue getCValueTypeOfTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
     * @param typeOfBoolean The value of typeOfBoolean as equal.
     */
    public void setTypeOfBoolean_Equal(Boolean typeOfBoolean) {
        regTypeOfBoolean(CK_EQ, typeOfBoolean);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfBoolean_IsNull() { regTypeOfBoolean(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfBoolean_IsNotNull() { regTypeOfBoolean(CK_ISNN, DOBJ); }

    protected void regTypeOfBoolean(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBoolean(), "TYPE_OF_BOOLEAN"); }
    abstract protected ConditionValue getCValueTypeOfBoolean();

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfBinary_IsNull() { regTypeOfBinary(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfBinary_IsNotNull() { regTypeOfBinary(CK_ISNN, DOBJ); }

    protected void regTypeOfBinary(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBinary(), "TYPE_OF_BINARY"); }
    abstract protected ConditionValue getCValueTypeOfBinary();

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfBlob_IsNull() { regTypeOfBlob(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfBlob_IsNotNull() { regTypeOfBlob(CK_ISNN, DOBJ); }

    protected void regTypeOfBlob(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBlob(), "TYPE_OF_BLOB"); }
    abstract protected ConditionValue getCValueTypeOfBlob();

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfUuid_IsNull() { regTypeOfUuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfUuid_IsNotNull() { regTypeOfUuid(CK_ISNN, DOBJ); }

    protected void regTypeOfUuid(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfUuid(), "TYPE_OF_UUID"); }
    abstract protected ConditionValue getCValueTypeOfUuid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @param typeOfArray The value of typeOfArray as equal.
     */
    public void setTypeOfArray_Equal(String typeOfArray) {
        doSetTypeOfArray_Equal(fRES(typeOfArray));
    }

    protected void doSetTypeOfArray_Equal(String typeOfArray) {
        regTypeOfArray(CK_EQ, typeOfArray);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfArray The value of typeOfArray as notEqual.
     */
    public void setTypeOfArray_NotEqual(String typeOfArray) {
        doSetTypeOfArray_NotEqual(fRES(typeOfArray));
    }

    protected void doSetTypeOfArray_NotEqual(String typeOfArray) {
        regTypeOfArray(CK_NES, typeOfArray);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfArray The value of typeOfArray as greaterThan.
     */
    public void setTypeOfArray_GreaterThan(String typeOfArray) {
        regTypeOfArray(CK_GT, fRES(typeOfArray));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfArray The value of typeOfArray as lessThan.
     */
    public void setTypeOfArray_LessThan(String typeOfArray) {
        regTypeOfArray(CK_LT, fRES(typeOfArray));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfArray The value of typeOfArray as greaterEqual.
     */
    public void setTypeOfArray_GreaterEqual(String typeOfArray) {
        regTypeOfArray(CK_GE, fRES(typeOfArray));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfArray The value of typeOfArray as lessEqual.
     */
    public void setTypeOfArray_LessEqual(String typeOfArray) {
        regTypeOfArray(CK_LE, fRES(typeOfArray));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfArrayList The collection of typeOfArray as inScope.
     */
    public void setTypeOfArray_InScope(Collection<String> typeOfArrayList) {
        doSetTypeOfArray_InScope(typeOfArrayList);
    }

    public void doSetTypeOfArray_InScope(Collection<String> typeOfArrayList) {
        regINS(CK_INS, cTL(typeOfArrayList), getCValueTypeOfArray(), "TYPE_OF_ARRAY");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfArrayList The collection of typeOfArray as notInScope.
     */
    public void setTypeOfArray_NotInScope(Collection<String> typeOfArrayList) {
        doSetTypeOfArray_NotInScope(typeOfArrayList);
    }

    public void doSetTypeOfArray_NotInScope(Collection<String> typeOfArrayList) {
        regINS(CK_NINS, cTL(typeOfArrayList), getCValueTypeOfArray(), "TYPE_OF_ARRAY");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfArray The value of typeOfArray as prefixSearch.
     */
    public void setTypeOfArray_PrefixSearch(String typeOfArray) {
        setTypeOfArray_LikeSearch(typeOfArray, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfArray The value of typeOfArray as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfArray_LikeSearch(String typeOfArray, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfArray), getCValueTypeOfArray(), "TYPE_OF_ARRAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfArray The value of typeOfArray as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfArray_NotLikeSearch(String typeOfArray, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfArray), getCValueTypeOfArray(), "TYPE_OF_ARRAY", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfArray_IsNull() { regTypeOfArray(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty(is null or empty). And OnlyOnceRegistered.
     */
    public void setTypeOfArray_IsNullOrEmpty() { regTypeOfArray(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfArray_IsNotNull() { regTypeOfArray(CK_ISNN, DOBJ); }

    protected void regTypeOfArray(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfArray(), "TYPE_OF_ARRAY"); }
    abstract protected ConditionValue getCValueTypeOfArray();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @param typeOfOther The value of typeOfOther as equal.
     */
    public void setTypeOfOther_Equal(String typeOfOther) {
        doSetTypeOfOther_Equal(fRES(typeOfOther));
    }

    protected void doSetTypeOfOther_Equal(String typeOfOther) {
        regTypeOfOther(CK_EQ, typeOfOther);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfOther The value of typeOfOther as notEqual.
     */
    public void setTypeOfOther_NotEqual(String typeOfOther) {
        doSetTypeOfOther_NotEqual(fRES(typeOfOther));
    }

    protected void doSetTypeOfOther_NotEqual(String typeOfOther) {
        regTypeOfOther(CK_NES, typeOfOther);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfOther The value of typeOfOther as greaterThan.
     */
    public void setTypeOfOther_GreaterThan(String typeOfOther) {
        regTypeOfOther(CK_GT, fRES(typeOfOther));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfOther The value of typeOfOther as lessThan.
     */
    public void setTypeOfOther_LessThan(String typeOfOther) {
        regTypeOfOther(CK_LT, fRES(typeOfOther));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfOther The value of typeOfOther as greaterEqual.
     */
    public void setTypeOfOther_GreaterEqual(String typeOfOther) {
        regTypeOfOther(CK_GE, fRES(typeOfOther));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param typeOfOther The value of typeOfOther as lessEqual.
     */
    public void setTypeOfOther_LessEqual(String typeOfOther) {
        regTypeOfOther(CK_LE, fRES(typeOfOther));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfOtherList The collection of typeOfOther as inScope.
     */
    public void setTypeOfOther_InScope(Collection<String> typeOfOtherList) {
        doSetTypeOfOther_InScope(typeOfOtherList);
    }

    public void doSetTypeOfOther_InScope(Collection<String> typeOfOtherList) {
        regINS(CK_INS, cTL(typeOfOtherList), getCValueTypeOfOther(), "TYPE_OF_OTHER");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param typeOfOtherList The collection of typeOfOther as notInScope.
     */
    public void setTypeOfOther_NotInScope(Collection<String> typeOfOtherList) {
        doSetTypeOfOther_NotInScope(typeOfOtherList);
    }

    public void doSetTypeOfOther_NotInScope(Collection<String> typeOfOtherList) {
        regINS(CK_NINS, cTL(typeOfOtherList), getCValueTypeOfOther(), "TYPE_OF_OTHER");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfOther The value of typeOfOther as prefixSearch.
     */
    public void setTypeOfOther_PrefixSearch(String typeOfOther) {
        setTypeOfOther_LikeSearch(typeOfOther, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfOther The value of typeOfOther as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfOther_LikeSearch(String typeOfOther, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfOther), getCValueTypeOfOther(), "TYPE_OF_OTHER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param typeOfOther The value of typeOfOther as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfOther_NotLikeSearch(String typeOfOther, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfOther), getCValueTypeOfOther(), "TYPE_OF_OTHER", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setTypeOfOther_IsNull() { regTypeOfOther(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty(is null or empty). And OnlyOnceRegistered.
     */
    public void setTypeOfOther_IsNullOrEmpty() { regTypeOfOther(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setTypeOfOther_IsNotNull() { regTypeOfOther(CK_ISNN, DOBJ); }

    protected void regTypeOfOther(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfOther(), "TYPE_OF_OTHER"); }
    abstract protected ConditionValue getCValueTypeOfOther();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * U_Y_TEXT: {CLOB(2147483647)}
     * @param uYText The value of uYText as equal.
     */
    public void setUYText_Equal(String uYText) {
        doSetUYText_Equal(fRES(uYText));
    }

    protected void doSetUYText_Equal(String uYText) {
        regUYText(CK_EQ, uYText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uYText The value of uYText as notEqual.
     */
    public void setUYText_NotEqual(String uYText) {
        doSetUYText_NotEqual(fRES(uYText));
    }

    protected void doSetUYText_NotEqual(String uYText) {
        regUYText(CK_NES, uYText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uYText The value of uYText as greaterThan.
     */
    public void setUYText_GreaterThan(String uYText) {
        regUYText(CK_GT, fRES(uYText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uYText The value of uYText as lessThan.
     */
    public void setUYText_LessThan(String uYText) {
        regUYText(CK_LT, fRES(uYText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uYText The value of uYText as greaterEqual.
     */
    public void setUYText_GreaterEqual(String uYText) {
        regUYText(CK_GE, fRES(uYText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uYText The value of uYText as lessEqual.
     */
    public void setUYText_LessEqual(String uYText) {
        regUYText(CK_LE, fRES(uYText));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param uYTextList The collection of uYText as inScope.
     */
    public void setUYText_InScope(Collection<String> uYTextList) {
        doSetUYText_InScope(uYTextList);
    }

    public void doSetUYText_InScope(Collection<String> uYTextList) {
        regINS(CK_INS, cTL(uYTextList), getCValueUYText(), "U_Y_TEXT");
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param uYTextList The collection of uYText as notInScope.
     */
    public void setUYText_NotInScope(Collection<String> uYTextList) {
        doSetUYText_NotInScope(uYTextList);
    }

    public void doSetUYText_NotInScope(Collection<String> uYTextList) {
        regINS(CK_NINS, cTL(uYTextList), getCValueUYText(), "U_Y_TEXT");
    }

    /**
     * PrefixSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param uYText The value of uYText as prefixSearch.
     */
    public void setUYText_PrefixSearch(String uYText) {
        setUYText_LikeSearch(uYText, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param uYText The value of uYText as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUYText_LikeSearch(String uYText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uYText), getCValueUYText(), "U_Y_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered.
     * @param uYText The value of uYText as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUYText_NotLikeSearch(String uYText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uYText), getCValueUYText(), "U_Y_TEXT", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setUYText_IsNull() { regUYText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty(is null or empty). And OnlyOnceRegistered.
     */
    public void setUYText_IsNullOrEmpty() { regUYText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setUYText_IsNotNull() { regUYText(CK_ISNN, DOBJ); }

    protected void regUYText(ConditionKey k, Object v) { regQ(k, v, getCValueUYText(), "U_Y_TEXT"); }
    abstract protected ConditionValue getCValueUYText();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorCheckCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorCheckCB>(new HpSSQSetupper<VendorCheckCB>() {
            public void setup(String function, SubQuery<VendorCheckCB> subQuery) {
                xscalarCondition(function, subQuery, operand);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorCheckCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForScalarCondition(this); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value.
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarCondition(VendorCheckCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Myself InScope (SubQuery). {mainly to avoid CLOB and Union problem or no master table}
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorCheckCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return VendorCheckCB.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
