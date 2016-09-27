/*
 * MIT License
 *
 * Copyright (c) $date.year Thought Logix
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.thoughtlogix.advancedstarter.server.transformers

import com.thoughtlogix.advancedstarter.server.transformers.HtmlTransformer
import com.thoughtlogix.advancedstarter.server.transformers.JsonTransformer
import com.thoughtlogix.advancedstarter.server.transformers.Transformer
import com.thoughtlogix.advancedstarter.server.transformers.XmlTransformer

object TransformerFactory {

    val jsonTransformer = JsonTransformer()
    val htmlTransformer = HtmlTransformer()
    val xmlTransformer = XmlTransformer()

    fun create(format: String?): Transformer? {

        if (format == null) return null

        if (format.contains("json")) {
            return jsonTransformer
        } else if (format.contains("html")) {
            return htmlTransformer
        } else if (format.contains("xml")) {
            return xmlTransformer
        } else {
            return null
        }
    }
}
