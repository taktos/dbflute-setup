package com.github.taktos.dbflute.dao.exbhv;

import static org.junit.Assert.*;

import com.github.taktos.dbflute.dao.exentity.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;

@RunWith(Seasar2.class)
@RootDicon("test.dicon")
public class MemberBhvTest {
	MemberBhv memberBhv;

	@Test
	public void testSelectByPK() {
		Member member = memberBhv.selectByPKValue(1);
		assertNotNull(member);
	}
}

