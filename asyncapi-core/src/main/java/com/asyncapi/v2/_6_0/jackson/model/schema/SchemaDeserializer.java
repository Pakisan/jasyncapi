package com.asyncapi.v2._6_0.jackson.model.schema;

import com.asyncapi.v2._6_0.model.schema.Schema;
import com.asyncapi.v2.jackson.ReferenceOrObjectDeserializer;

/**
 * Serializes component servers map.
 *
 * @author Pavel Bodiachevskii
 */
public class SchemaDeserializer extends ReferenceOrObjectDeserializer<Schema> {

    @Override
    public Class<Schema> objectTypeClass() {
        return Schema.class;
    }

}
