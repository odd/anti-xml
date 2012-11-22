/*
 * Copyright (c) 2011, Daniel Spiewak
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 * 
 * - Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer. 
 * - Redistributions in binary form must reproduce the above copyright notice, this
 *   list of conditions and the following disclaimer in the documentation and/or
 *   other materials provided with the distribution.
 * - Neither the name of "Anti-XML" nor the names of its contributors may
 *   be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.codecommit

/**
 * Base package for the Anti-XML framework.  Note that importing this package
 * brings in a number of implicit conversions.  Specifically:
 *
 * <ul>
 * <li>∀`A` . `A => Converter[A]` – Implements ''explicit'' conversions from
 * `scala.xml` types to Anti-XML correspondents (where applicable).  This
 * technically makes the `convert` method available on all types.  However, that
 * method will only be callable on very specific types in the `scala.xml`
 * library, and thus it shouldn't cause any collsion issues.</li>
 * <li>`(String, String) => (QName, String)` – Required to get nice syntax for
 * unqualified attribute names.  Note there is an additional conversion of type
 * `String => QName`, but that conversion is defined on the companion object for
 * [[com.codecommit.antixml.QName]], which prevents it from cluttering the dispatch
 * implicit space (i.e. it only applies as a type coercion, ''not'' a pimp).</li>
 * </ul>
 */
package object antixml extends LowPrioritiyImplicits {
}
