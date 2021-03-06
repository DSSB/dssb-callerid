//  ========================================================================
//  Copyright (c) 2017 Direct Solution Software Builders (DSSB).
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
package dssb.callerid;

import dssb.callerid.IGetCaller;

@SuppressWarnings("javadoc")
public class GetCalling2 {
    
    private final IGetCaller tracer;
    
    public GetCalling2(IGetCaller tracer) {
        this.tracer = tracer;
    }
    
    public StackTraceElement caller() {
        return first();
    }
    
    public StackTraceElement first() {
        return checker();
    }
    
    public StackTraceElement checker() {
        return tracer.caller(1);
    }
    
}
