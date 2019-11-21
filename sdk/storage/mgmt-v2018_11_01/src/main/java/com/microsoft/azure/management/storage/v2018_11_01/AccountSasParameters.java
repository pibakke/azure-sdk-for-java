/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_11_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters to list SAS credentials of a storage account.
 */
public class AccountSasParameters {
    /**
     * The signed services accessible with the account SAS. Possible values
     * include: Blob (b), Queue (q), Table (t), File (f). Possible values
     * include: 'b', 'q', 't', 'f'.
     */
    @JsonProperty(value = "signedServices", required = true)
    private Services services;

    /**
     * The signed resource types that are accessible with the account SAS.
     * Service (s): Access to service-level APIs; Container (c): Access to
     * container-level APIs; Object (o): Access to object-level APIs for blobs,
     * queue messages, table entities, and files. Possible values include: 's',
     * 'c', 'o'.
     */
    @JsonProperty(value = "signedResourceTypes", required = true)
    private SignedResourceTypes resourceTypes;

    /**
     * The signed permissions for the account SAS. Possible values include:
     * Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update
     * (u) and Process (p). Possible values include: 'r', 'd', 'w', 'l', 'a',
     * 'c', 'u', 'p'.
     */
    @JsonProperty(value = "signedPermission", required = true)
    private Permissions permissions;

    /**
     * An IP address or a range of IP addresses from which to accept requests.
     */
    @JsonProperty(value = "signedIp")
    private String iPAddressOrRange;

    /**
     * The protocol permitted for a request made with the account SAS. Possible
     * values include: 'https,http', 'https'.
     */
    @JsonProperty(value = "signedProtocol")
    private HttpProtocol protocols;

    /**
     * The time at which the SAS becomes valid.
     */
    @JsonProperty(value = "signedStart")
    private DateTime sharedAccessStartTime;

    /**
     * The time at which the shared access signature becomes invalid.
     */
    @JsonProperty(value = "signedExpiry", required = true)
    private DateTime sharedAccessExpiryTime;

    /**
     * The key to sign the account SAS token with.
     */
    @JsonProperty(value = "keyToSign")
    private String keyToSign;

    /**
     * Get the signed services accessible with the account SAS. Possible values include: Blob (b), Queue (q), Table (t), File (f). Possible values include: 'b', 'q', 't', 'f'.
     *
     * @return the services value
     */
    public Services services() {
        return this.services;
    }

    /**
     * Set the signed services accessible with the account SAS. Possible values include: Blob (b), Queue (q), Table (t), File (f). Possible values include: 'b', 'q', 't', 'f'.
     *
     * @param services the services value to set
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withServices(Services services) {
        this.services = services;
        return this;
    }

    /**
     * Get the signed resource types that are accessible with the account SAS. Service (s): Access to service-level APIs; Container (c): Access to container-level APIs; Object (o): Access to object-level APIs for blobs, queue messages, table entities, and files. Possible values include: 's', 'c', 'o'.
     *
     * @return the resourceTypes value
     */
    public SignedResourceTypes resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the signed resource types that are accessible with the account SAS. Service (s): Access to service-level APIs; Container (c): Access to container-level APIs; Object (o): Access to object-level APIs for blobs, queue messages, table entities, and files. Possible values include: 's', 'c', 'o'.
     *
     * @param resourceTypes the resourceTypes value to set
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withResourceTypes(SignedResourceTypes resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * Get the signed permissions for the account SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p). Possible values include: 'r', 'd', 'w', 'l', 'a', 'c', 'u', 'p'.
     *
     * @return the permissions value
     */
    public Permissions permissions() {
        return this.permissions;
    }

    /**
     * Set the signed permissions for the account SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p). Possible values include: 'r', 'd', 'w', 'l', 'a', 'c', 'u', 'p'.
     *
     * @param permissions the permissions value to set
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withPermissions(Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get an IP address or a range of IP addresses from which to accept requests.
     *
     * @return the iPAddressOrRange value
     */
    public String iPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    /**
     * Set an IP address or a range of IP addresses from which to accept requests.
     *
     * @param iPAddressOrRange the iPAddressOrRange value to set
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withIPAddressOrRange(String iPAddressOrRange) {
        this.iPAddressOrRange = iPAddressOrRange;
        return this;
    }

    /**
     * Get the protocol permitted for a request made with the account SAS. Possible values include: 'https,http', 'https'.
     *
     * @return the protocols value
     */
    public HttpProtocol protocols() {
        return this.protocols;
    }

    /**
     * Set the protocol permitted for a request made with the account SAS. Possible values include: 'https,http', 'https'.
     *
     * @param protocols the protocols value to set
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withProtocols(HttpProtocol protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the time at which the SAS becomes valid.
     *
     * @return the sharedAccessStartTime value
     */
    public DateTime sharedAccessStartTime() {
        return this.sharedAccessStartTime;
    }

    /**
     * Set the time at which the SAS becomes valid.
     *
     * @param sharedAccessStartTime the sharedAccessStartTime value to set
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withSharedAccessStartTime(DateTime sharedAccessStartTime) {
        this.sharedAccessStartTime = sharedAccessStartTime;
        return this;
    }

    /**
     * Get the time at which the shared access signature becomes invalid.
     *
     * @return the sharedAccessExpiryTime value
     */
    public DateTime sharedAccessExpiryTime() {
        return this.sharedAccessExpiryTime;
    }

    /**
     * Set the time at which the shared access signature becomes invalid.
     *
     * @param sharedAccessExpiryTime the sharedAccessExpiryTime value to set
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withSharedAccessExpiryTime(DateTime sharedAccessExpiryTime) {
        this.sharedAccessExpiryTime = sharedAccessExpiryTime;
        return this;
    }

    /**
     * Get the key to sign the account SAS token with.
     *
     * @return the keyToSign value
     */
    public String keyToSign() {
        return this.keyToSign;
    }

    /**
     * Set the key to sign the account SAS token with.
     *
     * @param keyToSign the keyToSign value to set
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withKeyToSign(String keyToSign) {
        this.keyToSign = keyToSign;
        return this;
    }

}