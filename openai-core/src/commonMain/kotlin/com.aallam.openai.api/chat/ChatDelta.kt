package com.aallam.openai.api.chat

import com.aallam.openai.api.BetaOpenAI
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Generated chat message.
 */
@Serializable
public data class ChatDelta(
    /**
     * The role of the author of this message.
     */
    @SerialName("role") val role: ChatRole? = null,

    /**
     * The contents of the message.
     */
    @SerialName("content") val content: String? = null,

    /**
     * The name and arguments of a function that should be called, as generated by the model.
     */
    @SerialName("function_call") public val functionCall: FunctionCall? = null
)
