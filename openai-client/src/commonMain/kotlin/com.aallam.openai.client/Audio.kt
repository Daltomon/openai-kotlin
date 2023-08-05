package com.aallam.openai.client

import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.audio.*

/**
 * Learn how to turn audio into text.
 */
public interface Audio {

    /**
     * Transcribes audio into the input language.
     */
    public suspend fun transcription(request: TranscriptionRequest): Transcription

    /**
     * Translates audio into English.
     */
    public suspend fun translation(request: TranslationRequest): Translation
}
