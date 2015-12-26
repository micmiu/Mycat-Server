package io.mycat.net;


public class ThreadLocalBufferPool extends ThreadLocal<BufferQueue> {
	private final long size;

	public ThreadLocalBufferPool(long size) {
		this.size = size;
	}

	protected synchronized BufferQueue initialValue() {
		return new BufferQueue(size);
	}
}
