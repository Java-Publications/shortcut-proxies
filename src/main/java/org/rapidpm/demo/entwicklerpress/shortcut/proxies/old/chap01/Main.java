/*
 * Copyright (c) 2013. Heinz Max Kabutz , Sven Ruppert
 *   We licenses
 *   this file to you under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License. You may
 *   obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.old.chap01;

import org.rapidpm.demo.entwicklerpress.shortcut.proxies.model.DemoClass;
import org.rapidpm.demo.entwicklerpress.shortcut.proxies.model.ImplementingClass;

/**
 * Created by Sven Ruppert on 14.11.13.
 */
public class Main {
    public static final String PKG_NAME = "org.rapidpm.demo.entwicklerpress.shortcut.proxies.model";

    public static void main(String[] args) {
        Class<DemoClass> demoClassA = DemoClass.class;
        Class<? extends DemoClass> demoClassB = new DemoClass().getClass();
        Class<Integer> integerClass = int.class;

        try {
            Class<?> demoClassC = Class.forName(PKG_NAME+".DemoClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Class<? super DemoClass> superclass = demoClassA.getSuperclass();
        System.out.println("superclass = " + superclass);

        Class<? super ImplementingClass> superclass1 = ImplementingClass.class.getSuperclass();
        System.out.println("superclass1 = " + superclass1);

        System.out.println( "void " + void.class.isPrimitive() );

        try {
            DemoClass demoClass = demoClassA.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }


}
