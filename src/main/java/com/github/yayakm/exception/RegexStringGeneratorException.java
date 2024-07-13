/*
 * Copyright (c) 2024, Yaya Kamissokho
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.yayakm.exception;

/**
 * Specialized exception class intended for use when text generation processes encounter
 * invalid states or arguments. Extending {@link IllegalArgumentException}, this exception
 * is thrown to indicate that a method has been passed an illegal or inappropriate argument
 * in the context of text generation, such as invalid length parameters or incompatible regex patterns.
 * <p>
 * This can help in clearly distinguishing text generation errors from more generic argument issues.
 *
 * @author yaya.kamissokho@gmail.com
 */
public class RegexStringGeneratorException extends IllegalArgumentException {

    /**
     * Constructs a new TextGenerationException with a specific message describing the error.
     *
     * @param message The detailed message that explains the reason for the exception.
     *                This message is saved for later retrieval by the {@link Throwable#getMessage()} method.
     */
    public RegexStringGeneratorException(String message) {
        super(message);
    }
}
