/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ImageShoppingSourcesAction model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ImageShoppingSourcesAction.class)
@JsonTypeName("ImageShoppingSourcesAction")
public class ImageShoppingSourcesAction extends ImageAction {
    /**
     * A list of merchants that offer items related to the image.
     */
    @JsonProperty(value = "data", access = JsonProperty.Access.WRITE_ONLY)
    private AggregateOffer data;

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public AggregateOffer data() {
        return this.data;
    }

}
