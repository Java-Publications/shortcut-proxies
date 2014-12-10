/*
 * Copyright (c) 2014. Heinz Max Kabutz , Sven Ruppert
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

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap2.proxy.version04;

import org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap2.proxy.model.Service;

/**
 * Nachteil: Geht nur auf Interfaces
 * Created by Sven Ruppert on 14.04.2014.
 */
public class Main {
  public static void main(String[] args) {
    Service subject = ProxyGenerator.makeProxy(Service.class, new Subject_A());
    String hello = subject.work("Hello");
    System.out.println("hello = " + hello);
  }
}
