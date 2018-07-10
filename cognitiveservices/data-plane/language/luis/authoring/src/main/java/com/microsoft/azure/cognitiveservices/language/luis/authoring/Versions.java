/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring;

import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.CloneOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ListVersionsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.UpdateVersionsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ImportMethodVersionsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.LuisApp;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.OperationStatus;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.VersionInfo;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Versions.
 */
public interface Versions {
    /**
     * Creates a new version using the current snapshot of the selected application version.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param cloneOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    
    String clone(UUID appId, String versionId, CloneOptionalParameter cloneOptionalParameter);

    /**
     * Creates a new version using the current snapshot of the selected application version.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param cloneOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    
    Observable<String> cloneAsync(UUID appId, String versionId, CloneOptionalParameter cloneOptionalParameter);

    /**
     * Creates a new version using the current snapshot of the selected application version.
     *
     * @return the first stage of the clone call
     */
    VersionsCloneDefinitionStages.WithAppId clone();

    /**
     * Grouping of clone definition stages.
     */
    interface VersionsCloneDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            WithVersionId withAppId(UUID appId);
        }
        /**
         * The stage of the definition to be specify versionId.
         */
        interface WithVersionId {
            /**
             * The version ID.
             *
             * @return next definition stage
             */
            VersionsCloneDefinitionStages.WithExecute withVersionId(String versionId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The new version for the cloned model.
             *
             * @return next definition stage
             */
            VersionsCloneDefinitionStages.WithExecute withVersion(String version);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends VersionsCloneDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the String object if successful.
             */
            String execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the String object
             */
            Observable<String> executeAsync();
        }
    }

    /**
     * The entirety of clone definition.
     */
    interface VersionsCloneDefinition extends
        VersionsCloneDefinitionStages.WithAppId,
        VersionsCloneDefinitionStages.WithVersionId,
        VersionsCloneDefinitionStages.WithExecute {
    }

    /**
     * Gets the application versions info.
     *
     * @param appId The application ID.
     * @param listOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;VersionInfo&gt; object if successful.
     */
    
    List<VersionInfo> list(UUID appId, ListVersionsOptionalParameter listOptionalParameter);

    /**
     * Gets the application versions info.
     *
     * @param appId The application ID.
     * @param listOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;VersionInfo&gt; object
     */
    
    Observable<List<VersionInfo>> listAsync(UUID appId, ListVersionsOptionalParameter listOptionalParameter);

    /**
     * Gets the application versions info.
     *
     * @return the first stage of the list call
     */
    VersionsListDefinitionStages.WithAppId list();

    /**
     * Grouping of list definition stages.
     */
    interface VersionsListDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            VersionsListDefinitionStages.WithExecute withAppId(UUID appId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The number of entries to skip. Default value is 0.
             *
             * @return next definition stage
             */
            VersionsListDefinitionStages.WithExecute withSkip(Integer skip);

            /**
             * The number of entries to return. Maximum page size is 500. Default is 100.
             *
             * @return next definition stage
             */
            VersionsListDefinitionStages.WithExecute withTake(Integer take);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends VersionsListDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the List&lt;VersionInfo&gt; object if successful.
             */
            List<VersionInfo> execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the List&lt;VersionInfo&gt; object
             */
            Observable<List<VersionInfo>> executeAsync();
        }
    }

    /**
     * The entirety of list definition.
     */
    interface VersionsListDefinition extends
        VersionsListDefinitionStages.WithAppId,
        VersionsListDefinitionStages.WithExecute {
    }


    /**
     * Gets the version info.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VersionInfo object if successful.
     */
    VersionInfo get(UUID appId, String versionId);

    /**
     * Gets the version info.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VersionInfo object
     */
    Observable<VersionInfo> getAsync(UUID appId, String versionId);


    /**
     * Updates the name or description of the application version.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param updateOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    
    OperationStatus update(UUID appId, String versionId, UpdateVersionsOptionalParameter updateOptionalParameter);

    /**
     * Updates the name or description of the application version.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param updateOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    
    Observable<OperationStatus> updateAsync(UUID appId, String versionId, UpdateVersionsOptionalParameter updateOptionalParameter);

    /**
     * Updates the name or description of the application version.
     *
     * @return the first stage of the update call
     */
    VersionsUpdateDefinitionStages.WithAppId update();

    /**
     * Grouping of update definition stages.
     */
    interface VersionsUpdateDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            WithVersionId withAppId(UUID appId);
        }
        /**
         * The stage of the definition to be specify versionId.
         */
        interface WithVersionId {
            /**
             * The version ID.
             *
             * @return next definition stage
             */
            VersionsUpdateDefinitionStages.WithExecute withVersionId(String versionId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The new version for the cloned model.
             *
             * @return next definition stage
             */
            VersionsUpdateDefinitionStages.WithExecute withVersion(String version);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends VersionsUpdateDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the OperationStatus object if successful.
             */
            OperationStatus execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the OperationStatus object
             */
            Observable<OperationStatus> executeAsync();
        }
    }

    /**
     * The entirety of update definition.
     */
    interface VersionsUpdateDefinition extends
        VersionsUpdateDefinitionStages.WithAppId,
        VersionsUpdateDefinitionStages.WithVersionId,
        VersionsUpdateDefinitionStages.WithExecute {
    }


    /**
     * Deletes an application version.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus delete(UUID appId, String versionId);

    /**
     * Deletes an application version.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> deleteAsync(UUID appId, String versionId);



    /**
     * Exports a LUIS application to JSON format.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LuisApp object if successful.
     */
    LuisApp export(UUID appId, String versionId);

    /**
     * Exports a LUIS application to JSON format.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LuisApp object
     */
    Observable<LuisApp> exportAsync(UUID appId, String versionId);


    /**
     * Imports a new version into a LUIS application.
     *
     * @param appId The application ID.
     * @param luisApp A LUIS application structure.
     * @param importMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    
    String importMethod(UUID appId, LuisApp luisApp, ImportMethodVersionsOptionalParameter importMethodOptionalParameter);

    /**
     * Imports a new version into a LUIS application.
     *
     * @param appId The application ID.
     * @param luisApp A LUIS application structure.
     * @param importMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    
    Observable<String> importMethodAsync(UUID appId, LuisApp luisApp, ImportMethodVersionsOptionalParameter importMethodOptionalParameter);

    /**
     * Imports a new version into a LUIS application.
     *
     * @return the first stage of the importMethod call
     */
    VersionsImportMethodDefinitionStages.WithAppId importMethod();

    /**
     * Grouping of importMethod definition stages.
     */
    interface VersionsImportMethodDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            WithLuisApp withAppId(UUID appId);
        }
        /**
         * The stage of the definition to be specify luisApp.
         */
        interface WithLuisApp {
            /**
             * A LUIS application structure.
             *
             * @return next definition stage
             */
            VersionsImportMethodDefinitionStages.WithExecute withLuisApp(LuisApp luisApp);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The new versionId to import. If not specified, the versionId will be read from the imported object.
             *
             * @return next definition stage
             */
            VersionsImportMethodDefinitionStages.WithExecute withVersionId(String versionId);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends VersionsImportMethodDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the String object if successful.
             */
            String execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the String object
             */
            Observable<String> executeAsync();
        }
    }

    /**
     * The entirety of importMethod definition.
     */
    interface VersionsImportMethodDefinition extends
        VersionsImportMethodDefinitionStages.WithAppId,
        VersionsImportMethodDefinitionStages.WithLuisApp,
        VersionsImportMethodDefinitionStages.WithExecute {
    }


    /**
     * Deleted an unlabelled utterance.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param utterance The utterance text to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus deleteUnlabelledUtterance(UUID appId, String versionId, String utterance);

    /**
     * Deleted an unlabelled utterance.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param utterance The utterance text to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> deleteUnlabelledUtteranceAsync(UUID appId, String versionId, String utterance);


}
