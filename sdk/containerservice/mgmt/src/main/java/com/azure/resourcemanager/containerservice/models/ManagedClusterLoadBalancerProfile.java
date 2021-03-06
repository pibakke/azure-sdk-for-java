// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ManagedClusterLoadBalancerProfile model. */
@Fluent
public final class ManagedClusterLoadBalancerProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterLoadBalancerProfile.class);

    /*
     * Desired managed outbound IPs for the cluster load balancer.
     */
    @JsonProperty(value = "managedOutboundIPs")
    private ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs;

    /*
     * Desired outbound IP Prefix resources for the cluster load balancer.
     */
    @JsonProperty(value = "outboundIPPrefixes")
    private ManagedClusterLoadBalancerProfileOutboundIpPrefixes outboundIpPrefixes;

    /*
     * Desired outbound IP resources for the cluster load balancer.
     */
    @JsonProperty(value = "outboundIPs")
    private ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs;

    /*
     * The effective outbound IP resources of the cluster load balancer.
     */
    @JsonProperty(value = "effectiveOutboundIPs")
    private List<ResourceReference> effectiveOutboundIPs;

    /**
     * Get the managedOutboundIPs property: Desired managed outbound IPs for the cluster load balancer.
     *
     * @return the managedOutboundIPs value.
     */
    public ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs() {
        return this.managedOutboundIPs;
    }

    /**
     * Set the managedOutboundIPs property: Desired managed outbound IPs for the cluster load balancer.
     *
     * @param managedOutboundIPs the managedOutboundIPs value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withManagedOutboundIPs(
        ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs) {
        this.managedOutboundIPs = managedOutboundIPs;
        return this;
    }

    /**
     * Get the outboundIpPrefixes property: Desired outbound IP Prefix resources for the cluster load balancer.
     *
     * @return the outboundIpPrefixes value.
     */
    public ManagedClusterLoadBalancerProfileOutboundIpPrefixes outboundIpPrefixes() {
        return this.outboundIpPrefixes;
    }

    /**
     * Set the outboundIpPrefixes property: Desired outbound IP Prefix resources for the cluster load balancer.
     *
     * @param outboundIpPrefixes the outboundIpPrefixes value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withOutboundIpPrefixes(
        ManagedClusterLoadBalancerProfileOutboundIpPrefixes outboundIpPrefixes) {
        this.outboundIpPrefixes = outboundIpPrefixes;
        return this;
    }

    /**
     * Get the outboundIPs property: Desired outbound IP resources for the cluster load balancer.
     *
     * @return the outboundIPs value.
     */
    public ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs() {
        return this.outboundIPs;
    }

    /**
     * Set the outboundIPs property: Desired outbound IP resources for the cluster load balancer.
     *
     * @param outboundIPs the outboundIPs value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withOutboundIPs(ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs) {
        this.outboundIPs = outboundIPs;
        return this;
    }

    /**
     * Get the effectiveOutboundIPs property: The effective outbound IP resources of the cluster load balancer.
     *
     * @return the effectiveOutboundIPs value.
     */
    public List<ResourceReference> effectiveOutboundIPs() {
        return this.effectiveOutboundIPs;
    }

    /**
     * Set the effectiveOutboundIPs property: The effective outbound IP resources of the cluster load balancer.
     *
     * @param effectiveOutboundIPs the effectiveOutboundIPs value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withEffectiveOutboundIPs(List<ResourceReference> effectiveOutboundIPs) {
        this.effectiveOutboundIPs = effectiveOutboundIPs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managedOutboundIPs() != null) {
            managedOutboundIPs().validate();
        }
        if (outboundIpPrefixes() != null) {
            outboundIpPrefixes().validate();
        }
        if (outboundIPs() != null) {
            outboundIPs().validate();
        }
        if (effectiveOutboundIPs() != null) {
            effectiveOutboundIPs().forEach(e -> e.validate());
        }
    }
}
