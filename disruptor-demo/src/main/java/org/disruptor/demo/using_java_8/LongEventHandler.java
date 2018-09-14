package org.disruptor.demo.using_java_8;

import com.lmax.disruptor.EventHandler;

public class LongEventHandler implements EventHandler<LongEvent> {
	public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
		System.out.println("Event: " + event);
	}
}