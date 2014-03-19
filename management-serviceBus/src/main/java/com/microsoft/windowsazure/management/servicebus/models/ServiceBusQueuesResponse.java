/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* A response to a request for a list of queues.
*/
public class ServiceBusQueuesResponse extends OperationResponse implements Iterable<ServiceBusQueue> {
    private ArrayList<ServiceBusQueue> queues;
    
    /**
    * Optional. The listing of queues.
    * @return The Queues value.
    */
    public ArrayList<ServiceBusQueue> getQueues() {
        return this.queues;
    }
    
    /**
    * Optional. The listing of queues.
    * @param queuesValue The Queues value.
    */
    public void setQueues(final ArrayList<ServiceBusQueue> queuesValue) {
        this.queues = queuesValue;
    }
    
    /**
    * Initializes a new instance of the ServiceBusQueuesResponse class.
    *
    */
    public ServiceBusQueuesResponse() {
        super();
        this.queues = new ArrayList<ServiceBusQueue>();
    }
    
    /**
    * Gets the sequence of Queues.
    *
    */
    public Iterator<ServiceBusQueue> iterator() {
        return this.getQueues().iterator();
    }
}
