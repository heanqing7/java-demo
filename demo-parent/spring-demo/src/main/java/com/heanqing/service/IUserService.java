package com.heanqing.service;

public interface IUserService {
    public int testBefore(int a, int b);
    public int testAfter(int a, int b);
    public int testReturning(int a, int b);
    public int testThrowable(int a, int b);
    public int testAroung(int a, int b);
    public int testExpose(int a, int b);
}
