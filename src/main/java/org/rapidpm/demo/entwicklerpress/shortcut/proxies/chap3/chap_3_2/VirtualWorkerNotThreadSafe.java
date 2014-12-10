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

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap3.chap_3_2;

/**
 * Created by Sven Ruppert on 14.04.2014.
 */
public class VirtualWorkerNotThreadSafe extends VirtualWorker {

  private Worker subject;

  @Override
  protected Worker realSubject() {
    if (subject == null) {
      subject = new WorkerImpl();
    }
    return subject;
  }
}
