package com.ctrip.xpipe.redis.meta.server.rest;

import org.junit.Assert;
import org.junit.Test;

import com.ctrip.xpipe.rest.ForwardType;

/**
 * @author wenchao.meng
 *
 * Sep 1, 2016
 */
public class ForwardInfoTest {
	
	@Test
	public void testClone(){
		
		ForwardInfo forwardInfo = new ForwardInfo(ForwardType.MOVING, 1);

		ForwardInfo clone = forwardInfo.clone();
		clone.addForwardServers(2);
		
		Assert.assertNotEquals(forwardInfo.getForwardServers().size(), clone.getForwardServers().size());
		
		
	}

}
