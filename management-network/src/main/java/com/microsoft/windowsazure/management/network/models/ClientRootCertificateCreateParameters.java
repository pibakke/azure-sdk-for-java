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

package com.microsoft.windowsazure.management.network.models;

public class ClientRootCertificateCreateParameters {
    private String certificate;
    
    /**
    * Required. The new client root certificate to upload, represented as a hex
    * encoded string
    * @return The Certificate value.
    */
    public String getCertificate() {
        return this.certificate;
    }
    
    /**
    * Required. The new client root certificate to upload, represented as a hex
    * encoded string
    * @param certificateValue The Certificate value.
    */
    public void setCertificate(final String certificateValue) {
        this.certificate = certificateValue;
    }
}
