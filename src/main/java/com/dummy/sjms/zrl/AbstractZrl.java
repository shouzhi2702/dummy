package com.dummy.sjms.zrl;

/**
 * @Version 1.0
 * @ClassName ZrlInterface
 * @Author duanshouzhi
 * @Date 2025/3/17 19:52
 * @Description TODO
 **/
public abstract class AbstractZrl {

    private AbstractZrl abstractZrl;

    public AbstractZrl setAbstractZrl(AbstractZrl abstractZrl) {
        this.abstractZrl = abstractZrl;
        return this;
    }

    public AbstractZrl getAbstractZrl() {
        return abstractZrl;
    }

    abstract void apply();


}
