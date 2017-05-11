/*-
 * #%L
 * Proof Utility Library
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2014 - 2017 Live Ontologies Project
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.liveontologies.puli.justifications.input;

import org.liveontologies.puli.InferenceSetAndJustifierBuilder;

public abstract class Minimization
		extends BaseEnumeratorTestInput<String, Integer> {

	private static InferenceSetAndJustifierBuilder<String, Integer> getBuilder() {

		final InferenceSetAndJustifierBuilder<String, Integer> builder = new InferenceSetAndJustifierBuilder<String, Integer>();

		builder.conclusion("A").axiom(1).axiom(2).add();
		builder.conclusion("A").premise("B").axiom(1).add();
		builder.conclusion("B").axiom(2).axiom(3).add();

		return builder;
	}

	public Minimization() {
		super(getBuilder());
	}

	@Override
	public String getQuery() {
		return "A";
	}

}
