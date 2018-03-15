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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainBpsDataByTimeStampResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainBpsDataByTimeStampResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String timeStamp;

	private List<BpsDataModel> bpsDataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public List<BpsDataModel> getBpsDataList() {
		return this.bpsDataList;
	}

	public void setBpsDataList(List<BpsDataModel> bpsDataList) {
		this.bpsDataList = bpsDataList;
	}

	public static class BpsDataModel {

		private String locationName;

		private String ispName;

		private Long bps;

		public String getLocationName() {
			return this.locationName;
		}

		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}

		public String getIspName() {
			return this.ispName;
		}

		public void setIspName(String ispName) {
			this.ispName = ispName;
		}

		public Long getBps() {
			return this.bps;
		}

		public void setBps(Long bps) {
			this.bps = bps;
		}
	}

	@Override
	public DescribeDomainBpsDataByTimeStampResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainBpsDataByTimeStampResponseUnmarshaller.unmarshall(this, context);
	}
}
