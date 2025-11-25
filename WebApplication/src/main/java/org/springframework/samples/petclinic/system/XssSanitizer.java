/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Component;
import org.springframework.web.util.HtmlUtils;

/**
 * Utility class for sanitizing user input to prevent XSS attacks.
 * Escapes HTML special characters before storing data in the database.
 */
@Component
public class XssSanitizer {

	/**
	 * Sanitizes input by escaping HTML special characters
	 * @param input the string to sanitize
	 * @return sanitized string safe for HTML output
	 */
	public String sanitize(String input) {
		if (input == null) {
			return null;
		}
		return HtmlUtils.htmlEscape(input);
	}

}
