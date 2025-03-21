/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.7
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baeldung.petstore.client.api;

import java.io.File;
import com.baeldung.petstore.client.model.ModelApiResponse;
import com.baeldung.petstore.client.model.Pet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClientException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PetApi
 */
@Disabled
class PetApiTest {

    private final PetApi api = new PetApi();

    
    /**
     * Add a new pet to the store
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void addPetTest() {
        Pet body = null;

        api.addPet(body);

        // TODO: test validations
    }
    
    /**
     * Deletes a pet
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void deletePetTest() {
        Long petId = null;
        String apiKey = null;

        api.deletePet(petId, apiKey);

        // TODO: test validations
    }
    
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void findPetsByStatusTest() {
        List<String> status = null;

        List<Pet> response = api.findPetsByStatus(status);

        // TODO: test validations
    }
    
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void findPetsByTagsTest() {
        List<String> tags = null;

        List<Pet> response = api.findPetsByTags(tags);

        // TODO: test validations
    }
    
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void getPetByIdTest() {
        Long petId = null;

        Pet response = api.getPetById(petId);

        // TODO: test validations
    }
    
    /**
     * Update an existing pet
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void updatePetTest() {
        Pet body = null;

        api.updatePet(body);

        // TODO: test validations
    }
    
    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void updatePetWithFormTest() {
        Long petId = null;
        String name = null;
        String status = null;

        api.updatePetWithForm(petId, name, status);

        // TODO: test validations
    }
    
    /**
     * uploads an image
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void uploadFileTest() {
        Long petId = null;
        String additionalMetadata = null;
        File _file = null;

        ModelApiResponse response = api.uploadFile(petId, additionalMetadata, _file);

        // TODO: test validations
    }
    
}
