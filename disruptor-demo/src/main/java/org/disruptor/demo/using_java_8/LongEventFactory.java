package org.disruptor.demo.using_java_8;

import com.lmax.disruptor.EventFactory;

public class LongEventFactory implements EventFactory<LongEvent> {
	public LongEvent newInstance() {
		return new LongEvent();
	}
}