package com.aallam.openai.api.chat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject

/**
 * The name and arguments of a function that should be called, as generated by the model.
 */
@Serializable
public data class FunctionCall(
    /**
     * The name of the function to call.
     */
    @SerialName("name") val name: String,

    /**
     * The arguments to call the function with, as generated by the model in JSON format.
     * Note that the model does not always generate valid JSON, and may hallucinate parameters
     * not defined by your function schema.
     * Validate the arguments in your code before calling your function.
     */
    @SerialName("arguments") val arguments: String,
) {

    /**
     * Decodes the [arguments] JSON string into a JsonObject.
     * If [arguments] is null, the function will return null.
     *
     * @param json The Json object to be used for decoding, defaults to a default Json instance
     */
    public fun argumentsAsJson(json: Json = Json): JsonObject = json.decodeFromString(arguments)
}
