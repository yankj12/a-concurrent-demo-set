package org.disruptor.demo.using_version_3_translators;

import com.lmax.disruptor.EventFactory;

public class LongEventFactory implements EventFactory<LongEvent> {
	public LongEvent newInstance() {
		return new LongEvent();
	}
}