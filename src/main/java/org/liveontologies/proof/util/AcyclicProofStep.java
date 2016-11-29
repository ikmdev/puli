package org.liveontologies.proof.util;

import org.liveontologies.proof.util.AcyclicProofNode;
import org.liveontologies.proof.util.ConvertedProofStep;
import org.liveontologies.proof.util.ProofNode;
import org.liveontologies.proof.util.ProofStep;

/*-
 * #%L
 * OWL API Proof Extension
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2014 - 2016 Live Ontologies Project
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

abstract class AcyclicProofStep<C> extends ConvertedProofStep<C> {

	private final AcyclicProofNode<C> conclusion_;

	AcyclicProofStep(ProofStep<C> delegate, AcyclicProofNode<C> conclusion) {
		super(delegate);
		this.conclusion_ = conclusion;
	}

	@Override
	public AcyclicProofNode<C> getConclusion() {
		return conclusion_;
	}

	@Override
	protected abstract AcyclicProofNode<C> convert(ProofNode<C> node);

}
