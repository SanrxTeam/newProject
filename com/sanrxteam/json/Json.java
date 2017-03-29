package com.sanrxteam.json;



public class Json {

	private String from;
	private String to;
	private trans_result trans_result;
	
	public class trans_result {  
		private String src;
		private String dst;
		public String getSrc() {
			return src;
		}
		public void setSrc(String src) {
			this.src = src;
		}
		public String getDst() {
			return dst;
		}
		public void setDst(String dst) {
			this.dst = dst;
		}
		
		
}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public trans_result getTrans_result() {
		return trans_result;
	}

	public void setTrans_result(trans_result trans_result) {
		this.trans_result = trans_result;
	}

	
	
	
}
