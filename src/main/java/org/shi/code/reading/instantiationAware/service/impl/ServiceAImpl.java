package org.shi.code.reading.instantiationAware.service.impl;

import org.shi.code.reading.instantiationAware.service.ServiceA;
import org.springframework.stereotype.Component;

/**
 * @Author sliang
 * @Date 12/21-021
 **/
@Component
public class ServiceAImpl implements ServiceA {
    @Override
    public String sayA() {
        return "A";
    }
}
