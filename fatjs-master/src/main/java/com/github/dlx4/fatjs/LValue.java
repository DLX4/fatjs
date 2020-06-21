package com.github.dlx4.fatjs;

/**
 * 对栈中的值的引用
 */
public interface LValue {

    public Object getValue();

    public void setValue(Object value);

    public Variable getVariable();

    public PlayObject getValueContainer();
    //public StackFrame getFrame();
}