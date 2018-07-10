/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Hierarchical Entity Extractor.
 */
public class HierarchicalEntityModel {
    /**
     * Child entities.
     */
    @JsonProperty(value = "children")
    private List<String> children;

    /**
     * Entity name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the children value.
     *
     * @return the children value
     */
    public List<String> children() {
        return this.children;
    }

    /**
     * Set the children value.
     *
     * @param children the children value to set
     * @return the HierarchicalEntityModel object itself.
     */
    public HierarchicalEntityModel withChildren(List<String> children) {
        this.children = children;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the HierarchicalEntityModel object itself.
     */
    public HierarchicalEntityModel withName(String name) {
        this.name = name;
        return this;
    }

}
