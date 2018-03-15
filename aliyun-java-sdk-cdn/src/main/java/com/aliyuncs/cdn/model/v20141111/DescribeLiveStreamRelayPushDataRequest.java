/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamRelayPushDataRequest extends RpcAcsRequest<DescribeLiveStreamRelayPushDataResponse> {
	
	public DescribeLiveStreamRelayPushDataRequest() {
		super("Cdn", "2014-11-11", "DescribeLiveStreamRelayPushData");
	}

	private String relayDomain;

	private String securityToken;

	private String endTime;

	private String startTime;

	private Long ownerId;

	public String getRelayDomain() {
		return this.relayDomain;
	}

	public void setRelayDomain(String relayDomain) {
		this.relayDomain = relayDomain;
		if(relayDomain != null){
			putQueryParameter("RelayDomain", relayDomain);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<DescribeLiveStreamRelayPushDataResponse> getResponseClass() {
		return DescribeLiveStreamRelayPushDataResponse.class;
	}

}
