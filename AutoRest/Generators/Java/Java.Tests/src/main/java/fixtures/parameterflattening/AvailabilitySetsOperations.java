/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.parameterflattening;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.Map;

/**
 * An instance of this class provides access to all the operations defined
 * in AvailabilitySetsOperations.
 */
public interface AvailabilitySetsOperations {
    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> update(String resourceGroupName, String avset, Map<String, String> tags) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateAsync(String resourceGroupName, String avset, Map<String, String> tags, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}