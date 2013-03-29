/**
 * Copyright 2013 Peergreen S.A.S.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.peergreen.example.paxexam.hello.impl;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Invalidate;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Validate;

import com.peergreen.example.paxexam.hello.api.Hello;

/**
 * OSGi iPOJO component that implements the Hello interface.
 */
@Component(name = "Hello")
@Provides
@Instantiate
public class HelloImpl implements Hello {

    @Validate
    public void start() {
        System.out.println("Start component");

    }

    @Invalidate
    public void stop() {
        System.out.println("Stop component");

    }

    public String sayHello(String name) {
        return "hello " + name;
    }
}
