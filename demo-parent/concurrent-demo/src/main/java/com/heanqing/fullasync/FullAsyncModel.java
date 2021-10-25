package com.heanqing.fullasync;

/**
 * 纯异步模式
 * 不适用cutdownlatch，因为cutdownlatch的主线程还是阻塞的
 * 要达到全部纯异步，把上下文传入到子线程中，使子线程识别到自己为最后一个线程，进行处理即可。
 */
public class FullAsyncModel {
}
